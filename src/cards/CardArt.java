package cards;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CardArt {

    private String nome;
    private String emoticon;

    public CardArt(String nome, String emoticon) {
        this.nome = nome;
        this.emoticon = emoticon;
    }

    public BufferedImage CardArt() {
        int largura = 300;
        int altura = 400;

        BufferedImage imagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagem.createGraphics();

        // Desenha o retângulo da carta
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, largura, altura);

        // Desenha o nome da carta
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString(nome, 20, 30);

        // Desenha o emoticon
        g2d.setFont(new Font("Arial", Font.PLAIN, 50));
        g2d.drawString(emoticon, largura / 2 - 25, altura / 2);

        g2d.dispose();

        return imagem;
    }
}

