package cards;

import java.util.ArrayList;
import java.util.List;

public abstract class CardsFactory {

    public List<Card> create(CardsType type){

        List<Card> deck = new ArrayList<>();

        Card mindSwapL1 = new Card("MindSwap Mindera", CardsType.PLACES);
        Card porto42L2 = new Card("42 Porto", CardsType.PLACES);
        Card codeForAllL3 = new Card("Code For All_", CardsType.PLACES);
        Card switchIppL4 = new Card("Switch", CardsType.PLACES);
        Card ironHackL4 = new Card("Ironhack", CardsType.PLACES);
        Card dataCampL5 = new Card("DataCamp", CardsType.PLACES);
        Card diogoC1 = new Card("Diogo Velho", CardsType.CRIMINALS);
        Card christopheC2 = new Card("Christophe Soares", CardsType.CRIMINALS);
        Card joaoC3 = new Card("João Anes", CardsType.CRIMINALS);
        Card gitW1 = new Card("Git", CardsType.WEAPONS);
        Card javaW2 = new Card("Java", CardsType.WEAPONS);
        Card javaScriptW3 = new Card("JavaScript", CardsType.WEAPONS);
        Card dockerW4 = new Card("Docker", CardsType.WEAPONS);
        Card springBootW5 = new Card("Spring Boot", CardsType.WEAPONS);
        Card reactW6 = new Card("React", CardsType.WEAPONS);

        return deck;
    }
}
