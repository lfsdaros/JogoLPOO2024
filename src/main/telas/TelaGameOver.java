package main.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaGameOver extends JFrame {
    public TelaGameOver() {

        setUndecorated(true);
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font buttonFont = new Font("Serif", Font.BOLD, 16);

        JPanel gameoverPanel = new JPanel(new BorderLayout());
        gameoverPanel.setBackground(new Color(121, 0, 0)); 

        JLabel gameOverLabel = new JLabel("GAME OVER", JLabel.CENTER);
        gameOverLabel.setFont(new Font("Serif", Font.BOLD, 70));
        gameOverLabel.setForeground(new Color(255, 255, 255));
        gameoverPanel.add(gameOverLabel, BorderLayout.CENTER);

        JButton sairButton = new JButton("Sair");
        sairButton.setBackground(Color.WHITE);
        sairButton.setFont(buttonFont);
        sairButton.setAlignmentX(CENTER_ALIGNMENT); 
        sairButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(121, 0, 0));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(sairButton);
        buttonPanel.add(Box.createVerticalGlue());

        gameoverPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(gameoverPanel);
    }
}