package server;

import cards.Card;
import cards.CardsFactory;
import cards.CardsType;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Game implements Runnable {

    private Server server;
    private ExecutorService service;
    private List<Card> deck;
    private List<PlayerClientHandler> players;
    private final List<Card> envelope;
    private Card[] bet;
    private static int NUM_OF_PLAYERS = 3;
    private static final int MAX_NUM_OF_PLAYERS = 3;
    private static int roundCount = 0;
    private boolean isGameStarted;
    private boolean isGameEnded;


    public Game(Server server) {
        this.server = server;
        service = Executors.newFixedThreadPool(MAX_NUM_OF_PLAYERS);
        players = new LinkedList<>();
        deck = CardsFactory.create() ;
        envelope = new ArrayList<>();
        bet = new Card[3];
        isGameStarted = false;
        isGameEnded = false;
    }

    @Override
    public void run() {

        while (isGameEnded) {

            if (checkIfGameCanStart() && !isGameStarted) {
                try {
                    start();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

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

    public void start() throws IOException {
        while(!gameIsOver()) {

            isGameStarted = true;
            //createPlayers();
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
        serverSocket.accept();
    }

            /*try {
                playRound(players.getFirst());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            playRound(players.getFirst());
        };*/





    private boolean gameIsOver() {
        return false;
    }


    private void playRound() throws IOException {
        roundCount++;

    }

    private int determineTheNumberOfCardsForPlayers() {

        return deck.size() / players.size();
    }

    private boolean handMinorThanNumOfCardsDealt() {
        return PlayerClient.getHand().size() < determineTheNumberOfCardsForPlayers();
    }

    private void dealCardsToPlayers() {

        Iterator<Card> itDeck = deck.iterator();
        Iterator<PlayerClientHandler> itPlayers = players.iterator();

        while(itDeck.hasNext() && handMinorThanNumOfCardsDealt())  {
            while(itPlayers.hasNext()){
                Card card = deck.get((int) (Math.random() * deck.size()));
                PlayerClient.getHand().add(card);
                deck.remove(card);
            }
        }
    }

    private void createEnvelopeCards() {

        List<Card> placesCards = createArrayTypesPlaces();
        Card envelopPlaceCard = placesCards.get((int) (Math.random() * 6));
        envelope.add(envelopPlaceCard);
        deck.remove(envelopPlaceCard);

        List<Card> criminalsCards = createArrayTypesCriminals();
        Card envelopCriminalCard = criminalsCards.get((int) (Math.random() * 3));
        envelope.add(envelopCriminalCard);
        deck.remove(envelopCriminalCard);

        List<Card> weaponsCards = createArrayTypesWeapons();
        Card envelopWeaponCard = weaponsCards.get((int) (Math.random() * 6));
        envelope.add(envelopWeaponCard);
        deck.remove(envelopWeaponCard);
    }

    private List<Card> createArrayTypesPlaces() {
        return deck.stream()
                .filter(card -> card.getType().equals(CardsType.PLACES))
                .toList();
    }

    private List<Card> createArrayTypesCriminals() {
        return deck.stream()
                .filter(card -> card.getType().equals(CardsType.CRIMINALS))
                .toList();
    }

    private List<Card> createArrayTypesWeapons() {
        return deck.stream()
                .filter(card -> card.getType().equals(CardsType.WEAPONS))
                .toList();
    }

    private void addPlayer(PlayerClientHandler playerClientHandler) {
        players.add(playerClientHandler);
        playerClientHandler. send(Messages.WELCOME.formatted(playerClientHandler.getName()));
        playerClientHandler.send(Messages.COMMANDS_LIST);
        broadcast(playerClientHandler.getName(), Messages.CLIENT_ENTERED_GAME);
    }

    public synchronized void broadcast(String name, String message) {
        players.stream()
                .filter(handler -> !handler.getName().equals(name))
                .forEach(handler -> handler.send(name + ": " + message));
    }

    public void removePlayer(PlayerClientHandler playerClientHandler) {
        players.remove(playerClientHandler);
    }

    public Optional<PlayerClientHandler> getPlayerByName(String name) {
        return players.stream()
                .filter(clientConnectionHandler -> clientConnectionHandler.getName().equalsIgnoreCase(name))
                .findFirst();
    }



    public List<Card> getEnvelope() {
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

    public List<Card> getDeck() {
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
        private BufferedReader in;
        private String message;

        public PlayerClientHandler (Socket playerClientSocket) {
            this.playerClientSocket = playerClientSocket;
            try {
                this.in = new BufferedReader(new InputStreamReader(playerClientSocket.getInputStream()));
                this.out = new BufferedWriter(new OutputStreamWriter(playerClientSocket.getOutputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

        @Override
        public void run() {

            addPlayer(this);
            send("whats your name");
            broadcast("Player Joined", name);

        }

        public void send(String message) {

            try {
                out.write(message);
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


