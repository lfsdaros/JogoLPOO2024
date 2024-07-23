package main.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaComandosInstrucoes extends JFrame{


    public TelaComandosInstrucoes(TelaInicial telaInicial) {

        setUndecorated(true);
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       

        JPanel panel = new JPanel();
        panel.setBackground(new Color(121, 0, 0)); 
        JLabel instrucoesLabel = new JLabel("<html><h1>Instruções de jogo:</h1><p>Olá, combatente!</p>\n <p>Sua missão começa ao escolher a sua função dentro do campo de batalha.</p><p>\nOBS: Essa escolha tem consequências, escolha sabiamente.</p><p>\nVocê pode encontrar aliados ao longo do percurso,</p><p>\n eles te ajudarão com itens e suprimentos.</p><p>\nBandeiras representam territórios inimigos, seja cauteloso. \nAo combate!</p></html>");
        instrucoesLabel.setFont(new Font("Serif", Font.BOLD, 18));
        instrucoesLabel.setHorizontalAlignment(JLabel.CENTER);
        instrucoesLabel.setForeground(new Color(255,255,255));
        panel.add(instrucoesLabel);

        JButton voltarButton = new JButton("Voltar");
        voltarButton.setBackground(Color.WHITE);
        voltarButton.setFont(new Font("Serif", Font.BOLD, 16));
        voltarButton.setAlignmentX(CENTER_ALIGNMENT);
        voltarButton.addActionListener((ActionEvent e) -> {
            this.dispose();
            telaInicial.setVisible(true);
        });

        panel.add(voltarButton);

        add(panel);
    }
}

