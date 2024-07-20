package main;

import entidades.npcs.Inimigos;
import entidades.personagem.PersonagemPadrao;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import mapa.Mapa;

public class Controles implements KeyListener {
    
    private final TelaJogo telaJogo;
    private final PersonagemPadrao personagem;

    public Controles(TelaJogo telaJogo, PersonagemPadrao player) {
        this.telaJogo = telaJogo;
        this.personagem = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int teclaPressionada = e.getKeyCode();
        
        switch (teclaPressionada) {
            case KeyEvent.VK_UP:
                personagem.mover("cima");
                break;
            case KeyEvent.VK_DOWN:
                personagem.mover("baixo");
                break;
            case KeyEvent.VK_LEFT:
                personagem.mover("esquerda");
                break;
            case KeyEvent.VK_RIGHT:
                personagem.mover("direita");
                break;
            case KeyEvent.VK_Q:
                System.exit(0);
                break;
         //TESTE       
            case KeyEvent.VK_M:
                personagem.setX(50);
                personagem.setY(50);
                telaJogo.setMapaAtual(Mapa.MAPA_1);
                break;
            case KeyEvent.VK_N:
                personagem.setX(50);
                personagem.setY(50);
                telaJogo.setMapaAtual(Mapa.MAPA_2);
                break;
            case KeyEvent.VK_L:
                personagem.setX(50);
                personagem.setY(50);
                telaJogo.setMapaAtual(Mapa.MAPA_3);
                break;
             case KeyEvent.VK_C: // Abre a tela de combate
                    JFrame combateFrame = new JFrame("Tela de Combate");
                    combateFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    combateFrame.setLocationRelativeTo(null);
                    combateFrame.setSize(500, 500);
                    combateFrame.add(new TelaCombate(personagem, new Inimigos(100,100,5,100,20,1)));
                    combateFrame.setVisible(true);
                    break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyR = e.getKeyCode();  //TECLA LIBERADA

        if(keyR == KeyEvent.VK_UP || keyR == KeyEvent.VK_DOWN || keyR == KeyEvent.VK_LEFT || keyR == KeyEvent.VK_RIGHT){
            personagem.mover(" ");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    
}
