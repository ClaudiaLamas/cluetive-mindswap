package cards;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Card {
    private String cardName;
    private CardsType type;

        

    public Card(String cardName, CardsType type) {
        this.cardName = cardName;
        this.type = type;
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


}


