package cards;


import java.util.ArrayList;
import java.util.List;

public abstract class CardsFactory {

    public static List<Card> create() {
        List<Card> deck = new ArrayList<>();


        /*Card p1MindSwap = new Card("MindSwap Mindera", CardsType.PLACES, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Mindera.png"));
        Card p2Porto42 = new Card("42 Porto", CardsType.PLACES, new CardGame(" ","/Users/mindera/Downloads/cluetive-mindswap/src/cards/42Porto.png"));
        Card p3CodeForAll = new Card("Code For All_", CardsType.PLACES, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/CodeforAll.png"));
        Card p4Switch = new Card("Switch", CardsType.PLACES, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Switch.png"));
        Card p5IronHack = new Card("Ironhack", CardsType.PLACES, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Ironhack.png"));
        Card p6DataCamp = new Card("DataCamp", CardsType.PLACES, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/DataCamp.png"));
        Card c1Diogo = new Card("Diogo Velho", CardsType.CRIMINALS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Diogo.png"));
        Card c2Christophe = new Card("Christophe Soares", CardsType.CRIMINALS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Christophe.png"));
        Card c3Joao = new Card("João Anes", CardsType.CRIMINALS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Joao.png"));
        Card w1Git = new Card("Git", CardsType.WEAPONS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Git.png"));
        Card w2Java = new Card("Java", CardsType.WEAPONS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Java.png"));
        Card w3JavaScript = new Card("JavaScript", CardsType.WEAPONS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/JavaScript.png"));
        Card w4Docker = new Card("Docker", CardsType.WEAPONS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Docker.png"));
        Card w5SpringBoot = new Card("Spring Boot", CardsType.WEAPONS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Spring.png"));
        Card w6React = new Card("React", CardsType.WEAPONS, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/React.png"));
*/

       /* deck.add(p1MindSwap);
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

*/
        return deck;
    }
}
