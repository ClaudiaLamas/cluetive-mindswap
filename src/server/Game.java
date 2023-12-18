package server;

import cards.Card;
import cards.CardsFactory;
import cards.CardsType;


import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Game implements Runnable {

    private Server server;
    private List<Card> deck;
    private static int NUM_OF_PLAYERS = 3;
    private static final int MAX_NUM_OF_PLAYERS = 3;
    private List<PlayerClient> players;
    private final List<Card> envelope;
    private ExecutorService service;
    private static int roundCount = 0;


    public Game(Server server, int numOfPlayers) {
        this.server = server;
        deck = CardsFactory.create() ;
        NUM_OF_PLAYERS = numOfPlayers;
        players = new LinkedList<>();
        envelope = new ArrayList<>();
        service = Executors.newFixedThreadPool(MAX_NUM_OF_PLAYERS);
    }

    @Override
    public void run() {
            start();
    }

    public void start() {
        while(!gameIsOver()) {
            createPlayers();

            createEnvelopeCards();

            dealCardsToPlayers();

            try {
                playRound(players.getFirst());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



    private boolean gameIsOver() {
        return false;
    }

    private void playRound(PlayerClient playerClient) throws IOException {
       // roundCount++;

       /* if(roundCount == 1 && playerClient.isPlayerTurn) {
            playerClient.displayHand();
            // Show instructions to command Throw bet
            // bet = string "cardPlace;cardCriminal;cardWeapon";
            playerClient.throwBet();
        }

       /* if (roundCount > 1) {

            switch (optionBet) { //command option
                case bet:
                  PlayerClient.throwBet();
                   break;
                case finalbet:
                    throwfinal();
                    break;
            }

        }*/
    }

    private int determineTheNumberOfCardsForPlayers() {

        return deck.size() / players.size();
    }

    private boolean handMinorThanNumOfCardsDealt() {
        return PlayerClient.getHand().size() < determineTheNumberOfCardsForPlayers();
    }

    private void dealCardsToPlayers() {

        Iterator<Card> itDeck = deck.iterator();
        Iterator<PlayerClient> itPlayers = players.iterator();

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

    private void createPlayers() {

        Iterator<PlayerClient> it = players.iterator();

        while(it.hasNext()) {

            Scanner playerName = new Scanner(System.in);
            players.add(new PlayerClient(playerName.toString()));

        }
    }

    public List<Card> getEnvelope() {
        return envelope;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<PlayerClient> getPlayers() {
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

}
