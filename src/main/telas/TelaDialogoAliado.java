package main.telas;

import entidades.personagem.PersonagemPadrao;
import itens.Inventario;
import itens.Item_Colete;
import itens.Item_Granada;
import itens.Item_Morfina;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaDialogoAliado extends JFrame{

    private TelaJogo telaJogo;
    private PersonagemPadrao personagem;
    
    public TelaDialogoAliado (TelaJogo telaJogo, PersonagemPadrao personagem){

        this.telaJogo = telaJogo;
        Inventario inventario = new Inventario();
        this.personagem = personagem;

        Item_Morfina morfina1 = new Item_Morfina(personagem, inventario);
        Item_Morfina morfina2 = new Item_Morfina(personagem, inventario);
        Item_Colete colete1 = new Item_Colete(personagem, inventario);
        Item_Granada granada1 = new Item_Granada(personagem, inventario);

        setTitle("Quiz");
        setUndecorated(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(null);

        JPanel dialogoPanel = new JPanel(new BorderLayout());
        dialogoPanel.setBackground(new Color(121, 0, 0));

        Color button3Color = new Color(255, 255, 255);
        Color title3Color = new Color(255, 255, 255);
        Font button3Font = new Font("Serif", Font.BOLD, 16);
        Font title3Font = new Font("Serif", Font.BOLD, 20);

        // Usando HTML para permitir quebra de linha e formatação
        JLabel titulo3Label = new JLabel("<html><div style='text-align: center;'>Qual das frases abaixo melhor define POO:<p>a) É um paradigma de programação baseado no conceito de funções.</p><p>b) É um paradigma de programação baseado em objetos.</p><p>c) Não é um paradigma de programação.</p></div></html>", JLabel.CENTER);
        titulo3Label.setForeground(title3Color);
        titulo3Label.setFont(title3Font);
        titulo3Label.setHorizontalAlignment(JLabel.CENTER);
        titulo3Label.setVerticalAlignment(JLabel.CENTER);

        dialogoPanel.add(titulo3Label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        buttonPanel.setBackground(new Color(121, 0, 0));
        buttonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 50, 20, 50));  // Ajusta as margens

        JButton alternativa1Button = new JButton("Letra A");
        alternativa1Button.setBackground(button3Color);
        alternativa1Button.setFont(button3Font);
        alternativa1Button.setAlignmentX(CENTER_ALIGNMENT);
        alternativa1Button.addActionListener((ActionEvent e) -> {
            System.out.println("Resposta errada!");
        });

        JButton alternativa2Button = new JButton("Letra B");
        alternativa2Button.setBackground(button3Color);
        alternativa2Button.setFont(button3Font);
        alternativa2Button.setAlignmentX(CENTER_ALIGNMENT);
        alternativa2Button.addActionListener((ActionEvent e) -> {
            System.out.println("Resposta certa!");

            inventario.adicionarItem(morfina1);
            inventario.adicionarItem(morfina2);
            inventario.adicionarItem(colete1);
            inventario.adicionarItem(granada1);


            this.telaJogo.setVisible(true);
            dispose();
        });

        JButton alternativa3Button = new JButton("Letra C");
        alternativa3Button.setBackground(button3Color);
        alternativa3Button.setFont(button3Font);
        alternativa3Button.setAlignmentX(CENTER_ALIGNMENT);
        alternativa3Button.addActionListener((ActionEvent e) -> {
            System.out.println("Resposta errada!");
        });

        buttonPanel.add(alternativa1Button);
        buttonPanel.add(alternativa2Button);
        buttonPanel.add(alternativa3Button);

        dialogoPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(dialogoPanel);
    }

}

