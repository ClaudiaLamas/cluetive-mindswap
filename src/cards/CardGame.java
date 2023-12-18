package cards;

import javax.swing.*;
import java.awt.*;

public class CardGame {
    private JFrame frame;
    private JPanel mainPanel;
    private static JLabel cardLabel;

    public CardGame(String title, String card) {
        // Configuração da janela principal
        frame = new JFrame("Cluetive Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Painel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Imagem inicial da carta (pode ser a carta de um criminoso, arma ou lugar inicial)
        ImageIcon initialCardImage = new ImageIcon(card);
        cardLabel = new JLabel(initialCardImage);
        mainPanel.add(cardLabel, BorderLayout.CENTER);

        // Adiciona o painel principal à janela
        frame.getContentPane().add(mainPanel);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
