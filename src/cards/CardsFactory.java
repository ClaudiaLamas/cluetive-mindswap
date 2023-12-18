package cards;

import java.util.ArrayList;
import java.util.List;

public abstract class CardsFactory {

    public static List<Card> create(){
        List<Card> deck = new ArrayList<>();

        Card p1MindSwap = new Card("MindSwap Mindera", CardsType.PLACES);
        Card p2Porto42 = new Card("42 Porto", CardsType.PLACES);
        Card p3CodeForAll = new Card("Code For All_", CardsType.PLACES);
        Card p4Switch = new Card("Switch", CardsType.PLACES);
        Card p5IronHack = new Card("Ironhack", CardsType.PLACES);
        Card p6DataCamp = new Card("DataCamp", CardsType.PLACES);
        Card c1Diogo = new Card("Diogo Velho", CardsType.CRIMINALS);
        Card c2Christophe = new Card("Christophe Soares", CardsType.CRIMINALS);
        Card c3Joao = new Card("João Anes", CardsType.CRIMINALS);
        Card w1Git = new Card("Git", CardsType.WEAPONS);
        Card w2Java = new Card("Java", CardsType.WEAPONS);
        Card w3JavaScript = new Card("JavaScript", CardsType.WEAPONS);
        Card w4Docker = new Card("Docker", CardsType.WEAPONS);
        Card w5SpringBoot = new Card("Spring Boot", CardsType.WEAPONS);
        Card w6React = new Card("React", CardsType.WEAPONS);

        deck.add(p1MindSwap);
        deck.add(p2Porto42);
        deck.add(p3CodeForAll);
        deck.add(p4Switch);
        deck.add(p5IronHack);
        deck.add(p6DataCamp);
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
