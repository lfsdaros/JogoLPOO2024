package main;

import entidades.personagem.*;
import javax.swing.JFrame;
import mapa.*;

public class ConfigsTela extends JFrame {

    private final TelaJogo telaJogo;
    private final Mapa mapa;
    private final PersonagemPadrao personagem;
    
    public ConfigsTela() {

        this.mapa = new Mapa();
        this.personagem = new PersonagemPadrao(100, 100, 5, 100, 50, 1); //}, mapa);
        this.telaJogo = new TelaJogo(mapa, personagem);
        
        add(telaJogo);
        setTitle("LPOO - THE WAR");
        pack();  // Ajusta o tamanho da janela ao conteúdo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}


