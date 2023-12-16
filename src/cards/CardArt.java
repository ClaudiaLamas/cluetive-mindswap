package cards;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class CardArt extends JFrame {

    public CardArt() {
        setTitle("Jogo de Detetive");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Carregar imagens das cartas
        ImageIcon carta1 = loadImage("carta.png");
        // Adicione mais cartas conforme necessário

        // Exemplo de uso: adicione as cartas a JLabels
        JLabel labelCarta1 = new JLabel(carta1);

        // Adicione os JLabels ao JFrame
        setLayout(new FlowLayout());
        add(labelCarta1);
        // Adicione mais JLabels conforme necessário
    }

    private ImageIcon loadImage(String carta) {
        URL urlImagem = getClass().getResource(carta);
        if (urlImagem != null) {
            return new ImageIcon(urlImagem);
        } else {
            System.err.println("Imagem não encontrada: " + carta);
            return new ImageIcon(); // Pode ser útil retornar um ícone padrão ou nulo em caso de falha
        }
    }
}
