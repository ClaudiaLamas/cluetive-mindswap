import cards.Card;
import cards.CardGame;
import cards.CardsFactory;
import cards.CardsType;
import server.Game;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Card mindSwapL1 = new Card("MindSwap Mindera", CardsType.PLACES, new CardGame(" ", "/Users/mindera/Downloads/cluetive-mindswap/src/cards/Mindera.png"));
        System.out.println(mindSwapL1);
       /* Card porto42L2 = new Card("42 Porto", CardsType.PLACES, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/42Porto.png"));
        System.out.println(porto42L2);
        Card codeForAllL3 = new Card("Code For All_", CardsType.PLACES, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/CodeforAll.png"));
        Card switchIppL4 = new Card("Switch", CardsType.PLACES, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Switch.png"));
        Card ironHackL4 = new Card("Ironhack", CardsType.PLACES, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Ironhack.png"));
        Card dataCampL5 = new Card("DataCamp", CardsType.PLACES, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/DataCamp.png"));
        Card diogoC1 = new Card("Diogo Velho", CardsType.CRIMINALS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Diogo.png"));
        Card christopheC2 = new Card("Christophe Soares", CardsType.CRIMINALS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Christophe.png"));
        Card joaoC3 = new Card("João Anes", CardsType.CRIMINALS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Joao.png"));
        Card gitW1 = new Card("Git", CardsType.WEAPONS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Git.png"));
        Card javaW2 = new Card("Java", CardsType.WEAPONS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Java.png"));
        Card javaScriptW3 = new Card("JavaScript", CardsType.WEAPONS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/JavaScript.png"));
        Card dockerW4 = new Card("Docker", CardsType.WEAPONS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Docker.png"));
        Card springBootW5 = new Card("Spring Boot", CardsType.WEAPONS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/Spring.png"));
        Card reactW6 = new Card("React", CardsType.WEAPONS, new CardGame("/Users/mindera/Downloads/cluetive-mindswap/src/cards/React.png"));
        System.out.println(codeForAllL3);
        System.out.println(switchIppL4);
        System.out.println(ironHackL4);
        System.out.println(dataCampL5);
        System.out.println(diogoC1);
        System.out.println(christopheC2);
        System.out.println(joaoC3);
        System.out.println(gitW1);
        System.out.println(javaW2);
        System.out.println(javaScriptW3);
        System.out.println(dockerW4);
        System.out.println(springBootW5);
        System.out.println(reactW6);


/*
        server.Game game = new server.Game(server, 3);
        game.start();

        System.out.println("Envelope: ");

        for (int i = 0; i < game.getEnvelope().size(); i++) {

            System.out.println(game.getEnvelope().get(i).getType() + ": " +game.getEnvelope().get(i).getCardName());

        }

        System.out.println(Arrays.toString(game.getPlayers()));




 */


    }
}
