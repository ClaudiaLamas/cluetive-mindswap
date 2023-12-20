package cardsagain;


import cards.Card;
import cards.CardsType;

import java.util.ArrayList;
import java.util.List;

public abstract class CardsFactory {

    public static List<Card2> create() {
        List<Card2> deck = new ArrayList<>();

        //Card2 p1MindSwap2 = new Card2("MindSwap Mindera", CardsType.PLACES, CardDraw.p1MindSwap);


        Card2 p1MindSwap = new Card2("MindSwap", CardsType.PLACES, CardDraw.p1MindSwap);
        Card2 p2Porto42 = new Card2("42Porto", CardsType.PLACES, CardDraw.p2Porto42);
        Card2 p3CodeForAll = new Card2("CodeForAll_", CardsType.PLACES, CardDraw.p3CodeForAll);
        Card2 p4Switch = new Card2("Switch", CardsType.PLACES, CardDraw.p4Switch);
        Card2 p5IronHack = new Card2("Ironhack", CardsType.PLACES, CardDraw.p5IronHack);
        Card2 p6DataCamp = new Card2("DataCamp", CardsType.PLACES, CardDraw.p6DataCamp);
        Card2 c1Diogo = new Card2("DiogoVelho", CardsType.CRIMINALS, CardDraw.c1Diogo);
        Card2 c2Christophe = new Card2("ChristopheSoares", CardsType.CRIMINALS, CardDraw.c2Christophe);
        Card2 c3Joao = new Card2("JoãoAnes", CardsType.CRIMINALS, CardDraw.c3Joao);
        Card2 w1Git = new Card2("Git", CardsType.WEAPONS, CardDraw.w1Git);
        Card2 w2Java = new Card2("Java", CardsType.WEAPONS, CardDraw.w2Java);
        Card2 w3JavaScript = new Card2("JavaScript", CardsType.WEAPONS, CardDraw.w3JavaScript);
        Card2 w4Docker = new Card2("Docker", CardsType.WEAPONS, CardDraw.w4Docker);
        Card2 w5SpringBoot = new Card2("SpringBoot", CardsType.WEAPONS, CardDraw.w5SpringBoot);
        Card2 w6React = new Card2("React", CardsType.WEAPONS, CardDraw.w6React);


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
