package cards;

import java.util.ArrayList;
import java.util.List;

public abstract class CardsFactory {

    public static List<Card> create(){
        List<Card> deck = new ArrayList<>();

        Card l1MindSwap = new Card("MindSwap Mindera", CardsType.PLACES);
        Card l2Porto42 = new Card("42 Porto", CardsType.PLACES);
        Card l3CodeForAll = new Card("Code For All_", CardsType.PLACES);
        Card l4Switch = new Card("Switch", CardsType.PLACES);
        Card l5IronHack = new Card("Ironhack", CardsType.PLACES);
        Card l6DataCamp = new Card("DataCamp", CardsType.PLACES);
        Card c1Diogo = new Card("Diogo Velho", CardsType.CRIMINALS);
        Card c2Christophe = new Card("Christophe Soares", CardsType.CRIMINALS);
        Card c3Joao = new Card("João Anes", CardsType.CRIMINALS);
        Card w1Git = new Card("Git", CardsType.WEAPONS);
        Card w2Java = new Card("Java", CardsType.WEAPONS);
        Card w3JavaScript = new Card("JavaScript", CardsType.WEAPONS);
        Card w4Docker = new Card("Docker", CardsType.WEAPONS);
        Card w5SpringBoot = new Card("Spring Boot", CardsType.WEAPONS);
        Card w6React = new Card("React", CardsType.WEAPONS);

        deck.add(l1MindSwap);
        deck.add(l2Porto42);
        deck.add(l3CodeForAll);
        deck.add(l4Switch);
        deck.add(l5IronHack);
        deck.add(l6DataCamp);
        deck.add(c1Diogo);
        deck.add(c2Christophe);
        deck.add(c3Joao);
        deck.add(w1Git);
        deck.add(w2Java);
        deck.add(w3JavaScript);
        deck.add(w4Docker);
        deck.add(w5SpringBoot);
        deck.add(w6React);


        return deck;
    }
}
