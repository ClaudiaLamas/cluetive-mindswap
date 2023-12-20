package server;

import cards.Card;
import cardsagain.Card2;
import com.sun.tools.jconsole.JConsoleContext;
import server.commands.Command;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PlayerClient {

    private String name;
    private static List<Card2> hand;
    private static int playersCount;
    private List<Card2> seenCards;
    private Socket playerSocket;
    public boolean isPlayerTurn;

    private static final int SERVER_PORT = 8080;
    private static final String SERVER_HOST = "localhost";

    public PlayerClient() {
        this.hand = new ArrayList<>();
        this.seenCards = new ArrayList<>();

        playersCount++;

        this.playerSocket = null;
        isPlayerTurn = false;
    }

    public static void main(String[] args) throws IOException {
        PlayerClient playerClient = new PlayerClient();
        playerClient.startGame(SERVER_HOST, SERVER_PORT);
    }

    private void startGame(String host, int port) throws IOException {

        // 1 - Request player name and update this.name

        playerSocket = new Socket(host, port);
        BufferedReader in = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(playerSocket.getOutputStream()));

        new Thread(new EmitMessage(out, playerSocket)).start();

        try {
            receiveMessageGame(in);
        } catch (IOException e) {
            System.out.printf("Game terminated!");
        }

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
    private void receiveMessageGame(BufferedReader in) throws IOException {
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        playerSocket.close();
    }

    private boolean checkCommandStart(char letter) {
        return(letter == "/".charAt(0));
    }

    public void receiveCard(Card2 card) {
        hand.add(card);
    }

    public void seeCard(Card2 card) {
        seenCards.add(card);
    }

    /*
    public void displayHand() {
        System.out.println(name + "'s Hand:");
        printCards(String.valueOf(hand));
    }


    public void printCards(ArrayList<Str>){
        int cardsInRow = cards.size();
        int cardsInColumn = 1;

        for(int i = 0; i < getCardLines(cards[0]).length; i++){ //linhas de cada carta
            for(int j = 0; j < cardsInColumn; j++){ //loop linhas de cartas
                for(int k = 0; k < cardsInRow; k++){ //loop colunas
                    System.out.print(getCardLine(cards[k], i) + " "); //imprime cada linha da carta
                }

            }
            System.out.println(); //move para a próxima linha
        }
    }

    public String getCardLine(String card, int lineIndex){
        String[] lines = card.split("\n"); // divisão feita através de \n
        return lines[lineIndex];
    }

    public String[] getCardLines(String card){ // obter linhas de cada carta
        return card.split("\n");
    }
*/


    public void displaySeenCards() {
        System.out.println(name + "'s Seen Cards:");
        for (Card2 card : seenCards) {
            System.out.println(card);
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public List<Card2> getSeenCards() {
        return seenCards;
    }

    public static List<Card2> getHand() {
        return hand;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setIsPlayerTurn(boolean isPlayerTurn){
        this.isPlayerTurn = isPlayerTurn;
    }

    private class EmitMessage implements Runnable {

        private BufferedWriter out;
        private BufferedReader in;
        private Socket pSocket;

        public EmitMessage(BufferedWriter out, Socket pSocket) {
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
                    out.newLine();
                    out.flush();

                    if(message.equalsIgnoreCase("/exit")) {
                        playerSocket.close();
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



