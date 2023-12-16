package cards;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DesignCards {
    public static void main(String[] args) {
        try {
            CardArt card = new CardArt("React", "⚛c"); // Nome e emoticon

            BufferedImage imagemCarta = card.CardArt();

            // Salvar a imagem em um arquivo
            File outputfile = new File("React.png");
            ImageIO.write(imagemCarta, "png", outputfile);

            System.out.println("Imagem da carta criada com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
