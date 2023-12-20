package server;

import cards.Card;
import cardsagain.Card2;
import cardsagain.CardsFactory;
import cards.CardsType;
import cardsagain.PlayerClient2;
import server.commands.Command;
import server.commands.CommandMessages;
import server.exceptions.NoMessageException;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Game implements Runnable {

    private Server server;
    private ExecutorService service;
    private List<Card2> deck;
    private static List<PlayerClientHandler> players;
    private final List<Card2> envelope;
    private Card2[] bet;
    private static int NUM_OF_PLAYERS = 3;
    private static final int MAX_NUM_OF_PLAYERS = 3;
    private static int roundCount = 0;
    private boolean isGameStarted;
    private boolean isGameEnded;
    private PlayerClientHandler playerClientHandler;
    private Command playerChoice;





    public Game(Server server) {
        this.server = server;
        service = Executors.newFixedThreadPool(MAX_NUM_OF_PLAYERS);
        players = new LinkedList<>();
        deck = CardsFactory.create() ;
        envelope = new ArrayList<>();
        bet = new Card2[3];
        isGameStarted = false;
        isGameEnded = false;
    }

    @Override
    public void run() {

        while (isGameEnded) {

            if (checkIfGameCanStart() && !isGameStarted) {
                start();
            }

            if (isGameStarted && !isGameEnded) {
                try {
                    playRound();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private boolean checkIfGameCanStart() {
        return !isGameAcceptingPlayers();
    }

    public void start() {
        while(!gameIsOver()) {

            isGameStarted = true;
            createEnvelopeCards();
            dealCardsToPlayers();
            // ToDo brodcast(String boardGame);
            //playRound(players.getFirst());
        }
    }

    public boolean isGameAcceptingPlayers() {
        return players.size() < MAX_NUM_OF_PLAYERS && !isGameStarted;
    }

    public void acceptPlayer(ServerSocket serverSocket) throws IOException {
        Socket playerSocket = serverSocket.accept();

        PlayerClientHandler playerClientHandler = new PlayerClientHandler(playerSocket, ServerMessages.DEFAULT_NAME + players.size());
        service.submit(playerClientHandler);
    }

    private boolean gameIsOver() {
        return false;
    }
    private void playerTurn(PlayerClient2 playerClient) {
        //Iterator<PlayerClientHandler> it = players.iterator();
       // 1 - show player hand of cards only to himself
        playerClient.displayHand();

        //2 - if round == round 1 -> seenCards==playerHand
        if(roundCount == 1){
            playerClient.getSeenCards().equals(playerClient.getHand2());
            betProcedure();
            return;
        }
        if(roundCount > 1){
            playerClient.displaySeenCards();
            playerClientHandler.send(CommandMessages.OPTIONS_BET_INSTRUCTIONS);
            if(playerChoice.equals(Command.FINAL_BET)){
                if(envelope.equals(playerChoice)){
                    victoryIsYours();
                } else {
                    playerLost();
                }

            }
        }

        //betProcedure() || finalBetProcedure();
           /* while(it.hasNext()){

            }*/



        // - throw bet -> if (throw bet) -> if next player has one card to show (= some card of the bet) - showsCard() only to this player.
            //else -> setNext(player.getnext())




            /*while (it.hasNext()){
                playerClientHandler.send(CommandMessages.BET_INSTRUCTIONS);
                playerClientHandler.send(CommandMessages.BET_MESSAGE);
            }*/
        //3 - if round > 1 -> show seen cards :
           // 3.1 choose between trhowBet() ou throwFinalBet()

        //4 - if ( throwFinalBet ) -> if throwFinalBet== envelope - Player winns
           // else player looses and quit the game;

           // if (throw bet) -> if next player has one card to show (= some card of the bet) - showsCard() only to this player.
            //else -> setNext(player.getnext())

       // 5 - isPlayerTurn = false;



      /*  while (isPlayerTurn) {
            displayHand();
            displaySeenCards(); // in this turn is the same og displayHand.
            // Show instructions to command Throw bet
            // bet = string "cardPlace;cardCriminal;cardWeapon";

            try {
                throwBet();
            } catch (IOException e) {
                throw new NullPointerException();
            }
        }*/
        playerClient.isPlayerTurn = false;
    }

    private void playerLost() {
    }

    private void victoryIsYours() {
    }


    private void betProcedure(){
        playerClientHandler.send(CommandMessages.BET_INSTRUCTIONS);
        playerClientHandler.send(CommandMessages.BET_MESSAGE);
    }

    private void finalBetProcedure() {
        playerClientHandler.send(CommandMessages.FINAL_BET_INSTRUCTIONS);
        playerClientHandler.send(CommandMessages.FINAL_BET_MESSAGE);
    }
    private void iterateThroughPlayers(){

    }
    private void playRound(PlayerClient2 playerClient1, PlayerClient2 playerClient2, PlayerClient2 playerClient3) throws IOException {
        roundCount++;

        while (!gameIsOver()){

        playerTurn(playerClient1);
        //precisamos de ver a carta do próximo jogador.
        //Se o jogador não tiver, ver a do seguinte.
        //Verificar se existe próximo jogador.
        playerTurn(playerClient2);
        //precisamos de ver a carta do próximo jogador.
        //Se o jogador não tiver, ver a do seguinte.
        //Verificar se existe próximo jogador.
        playerTurn(playerClient3);
        }
    }

    private int determineTheNumberOfCardsForPlayers() {

        return deck.size() / players.size();
    }

    private boolean handMinorThanNumOfCardsDealt() {
        return PlayerClient.getHand().size() < determineTheNumberOfCardsForPlayers();
    }

    private void dealCardsToPlayers() {

        Iterator<Card2> itDeck = deck.iterator();
        Iterator<PlayerClientHandler> itPlayers = players.iterator();

        while(itDeck.hasNext() && handMinorThanNumOfCardsDealt())  {
            while(itPlayers.hasNext()){
                Card2 card = deck.get((int) (Math.random() * deck.size()));
                PlayerClient.getHand().add(card);
                deck.remove(card);
            }
        }
    }

    private void createEnvelopeCards() {

        List<Card2> placesCards = createArrayTypesPlaces();
        Card2 envelopPlaceCard = placesCards.get((int) (Math.random() * 6));
        envelope.add(envelopPlaceCard);
        deck.remove(envelopPlaceCard);

        List<Card2> criminalsCards = createArrayTypesCriminals();
        Card2 envelopCriminalCard = criminalsCards.get((int) (Math.random() * 3));
        envelope.add(envelopCriminalCard);
        deck.remove(envelopCriminalCard);

        List<Card2> weaponsCards = createArrayTypesWeapons();
        Card2 envelopWeaponCard = weaponsCards.get((int) (Math.random() * 6));
        envelope.add(envelopWeaponCard);
        deck.remove(envelopWeaponCard);
    }

    private List<Card2> createArrayTypesPlaces() {
        return deck.stream()
                .filter(card -> card.getType().equals(CardsType.PLACES))
                .toList();
    }

    private List<Card2> createArrayTypesCriminals() {
        return deck.stream()
                .filter(card -> card.getType().equals(CardsType.CRIMINALS))
                .toList();
    }

    private List<Card2> createArrayTypesWeapons() {
        return deck.stream()
                .filter(card -> card.getType().equals(CardsType.WEAPONS))
                .toList();
    }

    public static void addPlayer(PlayerClientHandler playerClientHandler) {
        players.add(playerClientHandler);
        playerClientHandler.send(GameMessages.WELCOME.formatted(playerClientHandler.getName()));
        playerClientHandler.send(GameMessages.CLUETIVE_LOGO.formatted(playerClientHandler.getName()));
        playerClientHandler.send(GameMessages.GAME_INTRODUCTION.formatted(playerClientHandler.getName()));

        playerClientHandler.send(ServerMessages.COMMANDS_LIST);

        // Not working because there is no client name
        //broadcast(playerClientHandler.getName(), Messages.CLIENT_ENTERED_GAME);
    }

    public static void broadcast(String name, String message) {
        players.stream()
                .filter(handler -> !handler.getName().equals(name))
                .forEach(handler -> handler.send(name + ": " + message));
    }

    public static void broadcast(String name, String[] message) {
        players.stream()
                .filter(handler -> !handler.getName().equals(name))
                .forEach(handler -> handler.send(name + ": " + Arrays.toString(message)));
    }


    public void broadcast(PlayerClientHandler handler_, String message) {
        players.stream()
                .filter(handler -> handler != handler_)
                .forEach(handler -> handler.send(handler.getName() + ": " + message));
    }

    public void removePlayer(PlayerClientHandler playerClientHandler) {
        players.remove(playerClientHandler);
    }

    public Optional<PlayerClientHandler> getPlayerByName(String name) {
        return players.stream()
                .filter(clientConnectionHandler -> clientConnectionHandler.getName().equalsIgnoreCase(name))
                .findFirst();
    }



    public List<Card2> getEnvelope() {
        return envelope;
    }

    public String listPlayers() {
        StringBuffer buffer = new StringBuffer();

        players.forEach(client -> buffer.append(client.getName()).append("\n"));
        return buffer.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Card2> getDeck() {
        return deck;
    }

    public List<PlayerClientHandler> getPlayers() {
        return players;
    }

    public static int getNUM_OF_PLAYERS() {
        return NUM_OF_PLAYERS;
    }

    public static int getRoundCount() {
        return roundCount;
    }

    public static int getMaxNumOfPlayers() {
        return MAX_NUM_OF_PLAYERS;
    }

    public class PlayerClientHandler implements Runnable{
        private String name;
        private final Socket playerClientSocket;
        private final BufferedWriter out;
        private String message;

        private boolean hasNext;


        public PlayerClientHandler (Socket playerClientSocket, String name) throws IOException {
            this.playerClientSocket = playerClientSocket;
            this.name = name;
            try {
                this.out = new BufferedWriter(new OutputStreamWriter(playerClientSocket.getOutputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        @Override
        public void run() {

            addPlayer(this);

            BufferedReader in = null;
            try {
                in = new BufferedReader( new InputStreamReader(playerClientSocket.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }



            while (true) {
                try {
                    if (!((message = in.readLine())!= null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    // BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                   // message = in.nextLine();

                    System.out.println(message);
                    if (isCommand(message)) {
                        dealWithCommand(message);
                        continue;
                    }
                    if (message.equals("")) {
                        throw new NoMessageException("Empty message");
                        // continue;
                    }

                    broadcast(name, message);

                } catch (IOException e) {
                    System.err.println(ServerMessages.CLIENT_ERROR + e.getMessage());
                    removeClient(this);
                } catch (NoMessageException e) {
                    System.err.println(ServerMessages.CLIENT_ERROR + e.getMessage());
                } finally {
                    // removeClient(this);
                }
            }
        }

        public void removeClient(PlayerClientHandler clientConnectionHandler) {
            players.remove(clientConnectionHandler);
        }

        private boolean isCommand(String message) {
            return message.startsWith("/");
        }

        private void dealWithCommand(String message) throws IOException {
            String description = message.split(" ")[0];
            Command command = Command.getCommandDescription(description);

            command.getHandler().execute(Game.this, this);
        }

        public void send(String message) {

            try {
                out.write(message);
                out.newLine();
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMessage() {
            return message;
        }

        public void quit() {
            try {
                playerClientSocket.close();
            } catch (IOException e) {
                System.out.println("Couldn't closer player socket");
            } finally {
                broadcast("player left the game", name);
            }
        }
    }

}


