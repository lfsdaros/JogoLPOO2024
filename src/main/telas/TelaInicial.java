package main.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame {

    public TelaInicial() {

        setTitle("JOBA: THE WAR");
        setSize(1000,500);
        setUndecorated(true); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel inicialPanel = new JPanel();

    //COR DE FUNDO    
        inicialPanel.setBackground(new Color(121, 0, 0));
        inicialPanel.setLayout(new BoxLayout(inicialPanel, BoxLayout.Y_AXIS));

        Font buttonFont = new Font("Serif", Font.BOLD, 16);
        Font titleFont = new Font("Serif", Font.BOLD, 50);

        JLabel tituloLabel = new JLabel("JOBA: THE WAR");
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setFont(titleFont);
        tituloLabel.setAlignmentX(CENTER_ALIGNMENT); 

        inicialPanel.add(Box.createVerticalStrut(150)); //altura texto título
        inicialPanel.add(tituloLabel);
        inicialPanel.add(Box.createVerticalStrut(50)); // altura texto botao

        JButton jogarButton = new JButton("Jogar");
        jogarButton.setBackground(Color.WHITE);
        jogarButton.setFont(buttonFont);
        jogarButton.setAlignmentX(CENTER_ALIGNMENT);
        jogarButton.addActionListener((ActionEvent e) -> {
            
            new TelaHistoriaPreJogo().setVisible(true);

            dispose();
            // new TelaEscolha().setVisible(true);
        
            // dispose();
        });
        

        JButton historiaButton = new JButton("Comandos e Instruções");
        historiaButton.setBackground(Color.WHITE);
        historiaButton.setFont(buttonFont);
        historiaButton.setAlignmentX(CENTER_ALIGNMENT); 
        historiaButton.addActionListener((ActionEvent e) -> {
            
            new TelaComandosInstrucoes(this).setVisible(true);

            setVisible(false);

            
            //new TelaHistoria().setVisible(true);
        });

        JButton sairButton = new JButton("Sair");
        sairButton.setBackground(Color.WHITE);
        sairButton.setFont(buttonFont);
        sairButton.setAlignmentX(CENTER_ALIGNMENT); 
        sairButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        inicialPanel.add(jogarButton);
        inicialPanel.add(Box.createVerticalStrut(10));
        inicialPanel.add(historiaButton);
        inicialPanel.add(Box.createVerticalStrut(10)); 
        inicialPanel.add(sairButton);

        add(inicialPanel);
    }

}


