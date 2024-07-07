package main;

import entidades.personagem.PersonagemPadrao;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controles implements KeyListener {
    private final TelaJogo telaJogo;
    private final PersonagemPadrao player;

    public Controles(TelaJogo telaJogo, PersonagemPadrao player) {
        this.telaJogo = telaJogo;
        this.player = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int teclaPressionada = e.getKeyCode();
        
        //NÃO HÁ USO DE SWITCH POIS O MESMO NÃO FUNCIONA COM OR "||"
        if(teclaPressionada == KeyEvent.VK_W || teclaPressionada == KeyEvent.VK_UP) {
            player.setMovingUp(true);
        } else if (teclaPressionada == KeyEvent.VK_A || teclaPressionada == KeyEvent.VK_LEFT) {
            player.setMovingLeft(true);
        } else if (teclaPressionada == KeyEvent.VK_S || teclaPressionada == KeyEvent.VK_DOWN) {
            player.setMovingDown(true);
        } else if (teclaPressionada == KeyEvent.VK_D || teclaPressionada == KeyEvent.VK_RIGHT) {
            player.setMovingRight(true);
        } else if(teclaPressionada == KeyEvent.VK_Q) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int teclaPressionada = e.getKeyCode();

        //NÃO HÁ USO DE SWITCH POIS O MESMO NÃO FUNCIONA COM OR "||"
        if(teclaPressionada == KeyEvent.VK_W || teclaPressionada == KeyEvent.VK_UP) {
            player.setMovingUp(false);
        } else if (teclaPressionada == KeyEvent.VK_A || teclaPressionada == KeyEvent.VK_LEFT) {
            player.setMovingLeft(false);
        } else if (teclaPressionada == KeyEvent.VK_S || teclaPressionada == KeyEvent.VK_DOWN) {
            player.setMovingDown(false);
        } else if (teclaPressionada == KeyEvent.VK_D || teclaPressionada == KeyEvent.VK_RIGHT) {
            player.setMovingRight(false);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Não precisamos de implementação aqui por enquanto
    }
    
}

