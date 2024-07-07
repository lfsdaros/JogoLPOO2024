package main;

import java.awt.Color;
import javax.swing.JFrame;

public class ConfigsTela extends JFrame {

    private final TelaJogo telaJogo;

    public ConfigsTela() {
        
        telaJogo = new TelaJogo();
        
        add(telaJogo);
        setTitle("Jogo LPOO 2024 - Guerra");
        setSize(800, 600);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
