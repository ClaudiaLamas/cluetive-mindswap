package server;

import cards.Card;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class PlayerClient {

    private static List<Card> hand;
    private static int playersCount;
    private String name;
    private List<Card> seenCards;
    private Socket playerSocket;
    public boolean isPlayerTurn;



    public PlayerClient(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.seenCards = new ArrayList<>();
        seenCards.addAll(hand);
        playersCount++;

        this.playerSocket = null;
        isPlayerTurn = false;
    }

    public static void main(String[] args) throws IOException {
        PlayerClient playerClient = new PlayerClient("nome");
        InetAddress host = InetAddress.getLocalHost();
        int port = 8086;

        playerClient.startGame(host, port);
    }

    private void startGame(InetAddress host, int port) throws IOException {
        playerSocket = new Socket(host, port);

        new Thread(new SendMessage()).start();
        receiveMessageGame();


        /*BufferedReader in = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(playerSocket.getOutputStream()));

        String line = "";

            System.out.println(line);
            System.out.print("Enter your name: ");
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
            String playerName = keyboardReader.readLine();
            out.write(playerName);
            out.newLine();
            out.flush();
        */
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


     /*
        int value;
        boolean buildingCommand = false;
        boolean isCommand = false;

        while ((value = in.read()) != -1) {
            char letter = (char) value;

             if (!buildingCommand) {
                isCommand = checkCommandStart(letter);
            }


            if (isCommand) {
                command.append(letter);
                //  buildingCommand = checkCommandEnd(letter);
                if (!buildingCommand) {
                    //isPlayerTurn = canTalk(command.toString());
                    if (!isPlayerTurn) {
                        System.out.print(command);
                    }
                    command.delete(0, command.length()); //delete the message in memory
                }
            } else {
                System.out.print(letter);
            }
        }

        */
    }

    private boolean checkCommandStart(char letter) {
        return(letter == "/".charAt(0));
    }


   /* public void throwBet(Card[] playerBet) {

    }*/

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public void seeCard(Card card) {
        seenCards.add(card);
    }

    public void displayHand() {
        System.out.println(name + "'s Hand:");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();
    }

    public void displaySeenCards() {
        System.out.println(name + "'s Seen Cards:");
        for (Card card : seenCards) {
            System.out.println(card);
        }
        System.out.println();
    }

   /* public String getName() {
        return name;
    }*/

    public List<Card> getSeenCards() {
        return seenCards;
    }

    public static List<Card> getHand() {
        return hand;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setIsPlayerTurn(boolean isPlayerTurn){
        this.isPlayerTurn = isPlayerTurn;
    }

    private class SendMessage implements Runnable {
        @Override
        public void run () {

            // PrintWriter out = null;
            while (!playerSocket.isClosed()) {

                try {
                    PrintWriter out = new PrintWriter(playerSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    String message;
                    while ((message = in.readLine()) != null) {
                       // if (isPlayerTurn) {
                            out.println(message);
                        //}
                        //isPlayerTurn = false;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

            }


        }
   // }



}


// public int hand

