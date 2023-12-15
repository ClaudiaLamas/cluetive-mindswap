package cards;

public class Card {
    private String cardName;
    private CardsType type;

    private int num;

    public Card(String cardName, CardsType type){
        this.cardName = cardName;
        this.type = type;
    }
}
