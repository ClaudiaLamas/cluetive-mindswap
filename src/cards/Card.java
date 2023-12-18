package cards;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Card {
    private String cardName;
    private CardsType type;
    private CardGame cardGame;


    public Card(String cardName, CardsType type, CardGame cardGame) {
        this.cardName = cardName;
        this.type = type;
        this.cardGame = cardGame;
    }

    private BufferedImage createCardArt(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            // Tratar exceção (pode ser que a imagem não seja encontrada)
            return null;
        }
    }

    public String getCardName() {
        return cardName;
    }


    public CardsType getType() {
        return type;
    }

    public String getImagePath() {
        return getImagePath();
    }
}


