package cardsagain;

import cards.CardsType;
import cardsagain.PlayerClient2;
import server.PlayerClient;
import cardsagain.Card2;



public class Main {
    public static void main(String[] args) {

        PlayerClient2 player = new PlayerClient2();

        Card2 card2 = new Card2("p1MindSwap", cards.CardsType.PLACES, Card2.getP1MindSwap());
        Card2 card3 = new Card2("p2Porto42", cards.CardsType.PLACES, Card2.getP2Porto42());
        Card2 card4 = new Card2("p3CodeForAll_", CardsType.PLACES, Card2.getP3CodeForAll());

        player.getHand2().add(card2);
        player.getHand2().add(card3);
        player.getHand2().add(card4);

        player.displayHand();
    }
}
