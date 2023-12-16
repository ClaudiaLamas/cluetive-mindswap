import cards.Card;
import cards.CardsFactory;
import cards.CardsType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Card> deck;
    private final int NUM_OF_PLAYERS;
    private Player[] players;
    private List<Card> envelope;


    public Game(int numOfPlayers) {
        this.deck = CardsFactory.create() ;
        this.NUM_OF_PLAYERS = numOfPlayers;
        this.players = new Player[numOfPlayers];
        envelope = new ArrayList<>();

    }

    public void start() {

        while (Player.getPlayersCount() <= players.length) {
            createPlayers();
        }

        createEnvelopeCards();

        dealCardsToPlayers();

        playRound();


    }

    private void playRound() {

        for (int i = 0; i < players.length; i++) {

            players[i].throwBet();

        }

    }

    private void dealCardsToPlayers() {

        for(Player player : players) {

            for (int i = 0; i < determineTheNumberOfCardsForPlayers(); i++) {

                Card card = deck.get((int) (Math.random() * deck.size()));
                player.seeCard(card);
                deck.remove(card);

            }
            player.displayHand();
        }
    }

    private int determineTheNumberOfCardsForPlayers() {

        return deck.size() / players.length;
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

        for (int i = 0; i < NUM_OF_PLAYERS; i++) {
            Scanner playerName = new Scanner(System.in);
            players[i] = new Player(playerName.toString());
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

    public Player[] getPlayers() {
        return players;
    }
}
