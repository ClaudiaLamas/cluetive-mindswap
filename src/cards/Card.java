package cards;

public class Card {

    private String cardNameAndDesign;
    private CardsType type;



    public Card(String cardDesign, CardsType type) {
        this.cardNameAndDesign = cardDesign;
        this.type = type;
    }


    /*public CardsType choosingCardByType(String cardInitialLetter) {

       if(cardInitialLetter.equalsIgnoreCase("p")){
           return CardsType.PLACES;
       }
       if(cardInitialLetter.equalsIgnoreCase("c")){
           return CardsType.CRIMINALS;
       }
       if(cardInitialLetter.equalsIgnoreCase("w")){
           return CardsType.WEAPONS;
       }
       return null; // fazer command para list de cada carta de cada tipo.
    }*/




    public CardsType getType() {
        return type;
    }

    public String getCardNameAndDesign() {
        return cardNameAndDesign;
    }
}


