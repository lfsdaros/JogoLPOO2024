package main;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Controles implements KeyListener{

    public boolean cima, baixo, esquerda, direita;
    
  @Override
    public void keyTyped(KeyEvent tecla){ }

  @Override
    public void keyPressed(KeyEvent tecla){

        int codigoTecla = tecla.getKeyCode();

        switch(codigoTecla){
          case KeyEvent.VK_W:
            cima = true;
            break;
          case KeyEvent.VK_S:
            baixo = true;
            break;
          case KeyEvent.VK_D:
            direita = true;
            break;
          case KeyEvent.VK_A:
            esquerda = true;
            break;
        }


        


    }

  @Override
    public void keyReleased(KeyEvent tecla){

        int codigoTecla = tecla.getKeyCode();

        switch(codigoTecla){
          case KeyEvent.VK_W:
            cima = false;
            break;
          case KeyEvent.VK_S:
            baixo = false;
            break;
          case KeyEvent.VK_D:
            direita = false;
            break;
          case KeyEvent.VK_A:
            esquerda = false;
            break;
        }



    }
  }