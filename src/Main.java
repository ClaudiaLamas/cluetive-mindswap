import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Game game = new Game(3);
        game.start();

        System.out.println("Envelope: ");

        for (int i = 0; i < game.getEnvelope().size(); i++) {

            System.out.println(game.getEnvelope().get(i).getType() + ": " +game.getEnvelope().get(i).getCardName());

        }

        System.out.println(Arrays.toString(game.getPlayers()));



    }
}
