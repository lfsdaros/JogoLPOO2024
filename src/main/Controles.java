package main;

import entidades.personagem.PersonagemPadrao;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import main.telas.TelaDialogoAliado;
import main.telas.TelaJogo;
import mapa.Obstaculos;

public class Controles implements KeyListener {
    
    private final TelaJogo telaJogo;
    private final PersonagemPadrao personagem;
    private int listaObstaculosAtual;
    private final Obstaculos obstaculos;

    public Controles(TelaJogo telaJogo, PersonagemPadrao player, int mapaAtual, Obstaculos obstaculos){
        this.telaJogo = telaJogo;
        this.personagem = player;
        this.listaObstaculosAtual = mapaAtual;
        this.obstaculos = obstaculos;
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int teclaPressionada = e.getKeyCode();
        List<Rectangle> listaObstaculos = obstaculos.obterObstaculos(listaObstaculosAtual);
        
        switch (teclaPressionada) {
            case KeyEvent.VK_UP:
                personagem.mover("cima", listaObstaculos);
                break;

            case KeyEvent.VK_DOWN:
                personagem.mover("baixo", listaObstaculos);
                break;

            case KeyEvent.VK_LEFT:
                personagem.mover("esquerda", listaObstaculos);
                break;

            case KeyEvent.VK_RIGHT:
                personagem.mover("direita", listaObstaculos);
                break;

            case KeyEvent.VK_Q:
                System.exit(0);
                break;

            case KeyEvent.VK_E:

                if(listaObstaculosAtual == 1 && personagem.getX() >= 930 && personagem.getX() <= 968 && personagem.getY() >= 35 && personagem.getY() <= 70){
                    telaJogo.abrirTelaCombate(1);
                } else if (listaObstaculosAtual == 2 && personagem.getX() >= 900 && personagem.getX() <= 980 && personagem.getY() >= 400 && personagem.getY() <= 480){
                    telaJogo.abrirTelaCombate(2);
                } else if (listaObstaculosAtual == 3 && personagem.getX() >= 870 && personagem.getX() <= 905 && personagem.getY() >= 240 && personagem.getY() <= 280){
                    telaJogo.abrirTelaCombate(3);
                }
                break;

            case KeyEvent.VK_I:
            
                if(listaObstaculosAtual == 1 && personagem.getX() >= 835 && personagem.getX() <= 880 && personagem.getY() >= 420 && personagem.getY() <= 450 ){
                    new TelaDialogoAliado(telaJogo, personagem).setVisible(true);
                }
                break;
            default:
                break;
        }

        telaJogo.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int keyR = e.getKeyCode();  //TECLA LIBERADA

        if(keyR == KeyEvent.VK_UP || keyR == KeyEvent.VK_DOWN || keyR == KeyEvent.VK_LEFT || keyR == KeyEvent.VK_RIGHT){
            personagem.mover(" ", obstaculos.obterObstaculos(listaObstaculosAtual));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    public void setListaObstaculosAtual(int listaObstaculosAtual) {
        this.listaObstaculosAtual = listaObstaculosAtual;
    }
    
}
