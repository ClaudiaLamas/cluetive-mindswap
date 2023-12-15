import java.util.LinkedList;
import java.util.List;

public class Game {

    private List<String> deck; //Todo tipe Card
    private int numOfPlayers;
    private String[] players; // ToDo variable type Player


    public Game(int numOfPlayers) {
        this.deck = new LinkedList<>(); // ToDo call Cards factory to construct the deck of cards
        this.numOfPlayers = numOfPlayers;
        this.players = new String[numOfPlayers];

    }

    public void start() {

        for (int i = 0; i < numOfPlayers; i++) {
            players[i] = new String(); // ToDo change type to Player
        }


    }

}
