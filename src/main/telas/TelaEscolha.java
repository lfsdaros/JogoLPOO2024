package main.telas;

import entidades.personagem.Artilharia;
import entidades.personagem.Cavalaria;
import entidades.personagem.Infantaria;
import entidades.personagem.PersonagemPadrao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mapa.Mapa;


public class TelaEscolha extends JFrame{

    public TelaEscolha(){

        setTitle("Tela de Escolha");
        setSize(1000,500);
        setUndecorated(true); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel escolhaPanel = new JPanel();
        escolhaPanel.setBackground(new Color(121, 0, 0));
        escolhaPanel.setLayout(new BoxLayout(escolhaPanel, BoxLayout.Y_AXIS));

        
        Font escolhaButtonFont = new Font("Serif", Font.BOLD, 16);
        Font escolhaTitleFont = new Font("Serif", Font.BOLD, 40);

        JLabel tituloEscolha = new JLabel("SELECIONE SUA ARMA");
        tituloEscolha.setForeground(Color.WHITE);
        tituloEscolha.setFont(escolhaTitleFont);
        tituloEscolha.setAlignmentX(CENTER_ALIGNMENT); 

        escolhaPanel.add(Box.createVerticalStrut(150)); 
        escolhaPanel.add(tituloEscolha);
        escolhaPanel.add(Box.createVerticalStrut(50)); 

        JButton artilhariaButton = new JButton("Artilharia");
        artilhariaButton.setBackground(Color.WHITE);
        artilhariaButton.setFont(escolhaButtonFont);
        artilhariaButton.setAlignmentX(CENTER_ALIGNMENT);

        artilhariaButton.addActionListener((ActionEvent e) -> {

            PersonagemPadrao personagem = new Artilharia(50, 50, 5, 100, 75, 1);
            Mapa mapa = new Mapa();
            TelaJogo telaJogo = new TelaJogo(mapa, personagem);
            
            telaJogo.setVisible(true);
            
            JFrame jogoFrame = new JFrame("Tela de Jogo");
            jogoFrame.setUndecorated(true);
            jogoFrame.setResizable(false);
            jogoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jogoFrame.add(telaJogo);
            jogoFrame.pack();
            jogoFrame.setLocationRelativeTo(null);
            jogoFrame.setVisible(true);
            
            dispose();
            
        });

        JButton cavalariaButton = new JButton("Cavalaria");
        cavalariaButton.setBackground(Color.WHITE);
        cavalariaButton.setFont(escolhaButtonFont);
        cavalariaButton.setAlignmentX(CENTER_ALIGNMENT); 

        cavalariaButton.addActionListener((var e) -> {

            PersonagemPadrao personagem = new Cavalaria(50, 50, 8, 100, 100, 1);
            Mapa mapa = new Mapa();
            TelaJogo telaJogo = new TelaJogo(mapa, personagem);
            
            telaJogo.setVisible(true);
            
            JFrame jogoFrame = new JFrame("Tela de Jogo");
            jogoFrame.setUndecorated(true);
            jogoFrame.setResizable(false);
            jogoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jogoFrame.add(telaJogo);
            jogoFrame.pack();
            jogoFrame.setLocationRelativeTo(null);
            jogoFrame.setVisible(true);
            
            dispose();
            
            
        });

        JButton infantariaButton = new JButton("Infantaria");
        infantariaButton.setBackground(Color.WHITE);
        infantariaButton.setFont(escolhaButtonFont);
        infantariaButton.setAlignmentX(CENTER_ALIGNMENT);

        infantariaButton.addActionListener((ActionEvent e) -> {

            PersonagemPadrao personagem = new Infantaria(50, 50, 3, 100, 50, 1);
            Mapa mapa = new Mapa();
            TelaJogo telaJogo = new TelaJogo(mapa, personagem);
            
            telaJogo.setVisible(true);
            
            JFrame jogoFrame = new JFrame("Tela de Jogo");
            jogoFrame.setUndecorated(true);
            jogoFrame.setResizable(false);
            jogoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jogoFrame.add(telaJogo);
            jogoFrame.pack();
            jogoFrame.setLocationRelativeTo(null);
            jogoFrame.setVisible(true);
            
            //System.out.println("Infantaria escolhido");
            
            dispose();
        });


        escolhaPanel.add(artilhariaButton);
        escolhaPanel.add(Box.createVerticalStrut(10));
        escolhaPanel.add(cavalariaButton);
        escolhaPanel.add(Box.createVerticalStrut(10)); 
        escolhaPanel.add(infantariaButton);

        add(escolhaPanel);
    }

}
