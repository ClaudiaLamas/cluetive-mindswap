import cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private static List<Card> hand;
    private List<Card> seenCards;
    private static int playersCount;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.seenCards = new ArrayList<>();
        playersCount++;
    }

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

    public String getName() {
        return name;
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    public static void setCard(Card card) {
        hand.add(card);
    }

   // public int hand
}