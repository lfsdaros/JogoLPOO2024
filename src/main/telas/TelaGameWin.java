package main.telas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaGameWin extends JFrame {

    public TelaGameWin() {

        setUndecorated(true);
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel gamewinPanel = new JPanel();
        gamewinPanel.setBackground(new Color(121, 0, 0)); 
        JLabel gameWinLabel = new JLabel("PARABÉNS, GUERREIRO!");
        gameWinLabel.setFont(new Font("Serif", Font.BOLD, 70));
        gameWinLabel.setForeground(new Color(255,255,255));
        
        gamewinPanel.add(gameWinLabel);
        add(gamewinPanel);
    }
}