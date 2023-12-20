package cardsagain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class PlayerClient2 {

    private String name;
    private ArrayList<Card2> hand2;
    private static int playersCount;
    private ArrayList<Card2> seenCards;
    private Socket playerSocket;
    public boolean isPlayerTurn;



    public PlayerClient2() {
        this.hand2 = new ArrayList<>();
        this.seenCards = new ArrayList<>();
        seenCards.addAll(hand2);
        playersCount++;

        this.playerSocket = null;
        isPlayerTurn = false;
    }

    public static void main(String[] args) throws IOException {
        PlayerClient2 playerClient = new PlayerClient2();
        InetAddress host = playerClient.getServerHost(args);
        int port = playerClient.getServerPort(args);

        playerClient.startGame(host,port);
    }

    private int getServerPort(String[] args) {
        int port = 8080;
        if(args.length > 0) {
            port = Integer.parseInt(args[1]);
        }
        return port;
    }

    private InetAddress getServerHost(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        if(args.length > 0) {
            host = InetAddress.getByName(args[0]);
        }
        return host;
    }

    private void startGame(InetAddress host, int port) throws IOException {

        playerSocket = new Socket(host, port);
        BufferedReader in = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));
        PrintWriter out = new PrintWriter(playerSocket.getOutputStream(), true);

        new Thread(new PlayerSendMessage(out, playerSocket)).start();
        receiveMessageGame();

    }

    private void playerTurn() {
        /* 1 - show player hand of cards only to himself

        2 - if round == round 1 -> seenCards==playerHand

         - throw bet -> if (throw bet) -> if next player has one card to show (= some card of the bet) - showsCard() only to this player.
            else -> setNext(player.getnext())

        3 - if round > 1 -> show seen cards :
            3.1 choose between trhowBet() ou throwFinalBet()

        4 - if ( throwFinalBet ) -> if throwFinalBet== envelope - Player winns
            else player looses and quit the game;

            if (throw bet) -> if next player has one card to show (= some card of the bet) - showsCard() only to this player.
            else -> setNext(player.getnext())

        5 - isPlayerTurn = false;


         */
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

    }

    public static int getPlayersCount() {
        return playersCount;
    }

   /* public void throwBet() throws IOException {

        PrintWriter out = new PrintWriter(playerSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String bet;
        if ((bet = in.readLine()) != null) {
            out.println(bet);
        }

    }
*/
    private void receiveMessageGame() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));
      //  StringBuilder command = new StringBuilder();

        String line;

        while ( (line = in.readLine()) != null) {

            System.out.println(line);
        }
        playerSocket.close();
    }

    private boolean checkCommandStart(char letter) {
        return(letter == "/".charAt(0));
    }

    public void receiveCard(Card2 card) {
        hand2.add(card);
    }

    public void seeCard(Card2 card) {
        seenCards.add(card);
    }

    public void displayHand() {
        System.out.println(name + "'s Hand:");
        printCards(hand2);
    }


    public void printCards(ArrayList<Card2> cards){
        int cardsInRow = cards.size();
        int cardsInColumn = 1;

        for(int i = 0; i < getCardLines(cards.get(0)).size(); i++){ //linhas de cada carta
            for(int j = 0; j < cardsInColumn; j++){ //loop linhas de cartas
                for(int k = 0; k < cardsInRow; k++){ //loop colunas
                    System.out.print(getCardLine(cards.get(k), i) + " "); //imprime cada linha da carta
                }

            }
            System.out.println(); //move para a próxima linha
        }
    }

    public ArrayList<String> getCardLine(Card2 card, int lineIndex){
        String[] lines = card.getCardArt().split("\n"); // divisão feita através de \n
        return (ArrayList<String>) List.of(lines[lineIndex]);
    }

    public ArrayList<String> getCardLines(Card2 card){ // obter linhas de cada carta
        return (ArrayList<String>) List.of(card.getCardArt().split("\n"));
    }



    public void displaySeenCards() {
        System.out.println(name + "'s Seen Cards:");
        printCards(seenCards);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card2> getSeenCards() {
        return seenCards;
    }

    public ArrayList<Card2> getHand2() {
        return hand2;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setIsPlayerTurn(boolean isPlayerTurn){
        this.isPlayerTurn = isPlayerTurn;
    }

    private class PlayerSendMessage implements Runnable {

        private PrintWriter out;
        private BufferedReader in;
        private Socket pSocket;

        public PlayerSendMessage(PrintWriter out, Socket pSocket) {
          this.out = out;
          this.pSocket = pSocket;
          this.in = new BufferedReader(new InputStreamReader(System.in));

        }
        @Override
        public void run () {

            while (!playerSocket.isClosed()) {

                try {
                    String message = in.readLine();

                    out.write(message);

                    if(message.equalsIgnoreCase("/exit")) {
                        playerSocket.close();
                        System.exit(0);
                    }

                   /* while ((message = in.readLine()) != null) {
                       // if (isPlayerTurn) {
                            out.println(message);
                        //}
                        //isPlayerTurn = false;
                    }*/
                } catch (IOException e) {
                    System.out.println("Something wrong with the server.");
                    try {
                        playerSocket.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

            }

        }

}



