package main.telas;

import entidades.personagem.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import main.Controles;
import mapa.*;


public class TelaJogo extends JPanel {
    
    private PersonagemPadrao personagem;

    private int mapaAtual = 1;
    private final Mapa mapa;
    private final Obstaculos obstaculos;
    private final Controles controles;

    private final Timer timer;
    
    public TelaJogo(Mapa mapa, PersonagemPadrao personagem) {

        this.mapa = mapa;
        this.personagem = personagem;
        this.obstaculos = new Obstaculos();
        setPreferredSize(new Dimension(mapa.getLargura(), mapa.getAltura()));  // largura = 1000 ; largura = 500
        setFocusable(true);
        

        this.controles = new Controles(this, personagem, mapaAtual, obstaculos);
        addKeyListener(controles);

        timer = new Timer(16, (ActionEvent e) -> {
            repaint();
        });
        timer.start();
    }

    public void setMapaAtual(int mapaAtual){
        this.mapaAtual = mapaAtual;
        this.controles.setListaObstaculosAtual(mapaAtual);
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        mapa.desenharMapa(g, mapaAtual);
        personagem.desenharPersonagem(g, personagem);

        g.setColor(Color.BLACK);
        g.drawString("SAÚDE: " + personagem.getSaudeAtual(), 32, 490);
        g.drawString("PROTEÇÃO: " + personagem.getProtecaoAtual(), 132, 490);


    //DIALOGO NPC - MAPA 1
        if(mapaAtual == 1 && personagem.getX() >= 840 && personagem.getX() <= 875 && personagem.getY() >= 420 && personagem.getY() <= 455){
            g.setColor(Color.BLACK);
            g.drawString("VOCÊ ENCONTROU UM ALIADO!! APERTE ' I ' PARA INTERAGIR COM ELE", 10, 15);
        }
        
    //COMBATE - MAPA 1
        if(mapaAtual == 1 && personagem.getX() >= 930 && personagem.getX() <= 968 && personagem.getY() >= 35 && personagem.getY() <= 70){
            g.setColor(Color.BLACK);
            g.drawString("VOCÊ ESTÁ EM UM TERRITÓRIO DE COMBATE!! APERTE ' E ' PARA ENTRAR NA BATALHA", 10, 15);
        }

    //COMBATE - MAPA 2
        if(mapaAtual == 2 && personagem.getX() >= 900 && personagem.getX() <= 980 && personagem.getY() >= 400 && personagem.getY() <= 480 ){
            g.setColor(Color.BLACK);
            g.drawString("VOCÊ ESTÁ EM UM TERRITÓRIO DE COMBATE!! APERTE ' E ' PARA ENTRAR NA BATALHA", 10, 15);
        }

    //COMBATE - MAPA 3
        if(mapaAtual == 3 && personagem.getX() >= 870 && personagem.getX() <= 905 && personagem.getY() >= 240 && personagem.getY() <= 290){
            g.setColor(Color.BLACK);
            g.drawString("VOCÊ ESTÁ EM UM TERRITÓRIO DE COMBATE!! APERTE ' E ' PARA ENTRAR NA BATALHA", 10, 15);
        }


    }

    public void abrirTelaCombate(int combateAtual) {
        TelaCombate telaCombate = new TelaCombate(personagem, combateAtual,this);
        telaCombate.setVisible(true);
    }

}
