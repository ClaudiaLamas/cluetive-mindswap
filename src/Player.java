public class Player {

    private String name;
    private List<Card> hand;
    private List<Card> seenCards;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.seenCards = new ArrayList<>();
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
}