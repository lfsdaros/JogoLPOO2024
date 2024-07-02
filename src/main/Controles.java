// package main;

// import java.awt.event.KeyListener;
// import java.awt.event.KeyEvent;

// public class Controles implements KeyListener{

//     public boolean cima, baixo, esquerda, direita;
    
//   @Override
//     public void keyTyped(KeyEvent tecla){ }

//   @Override
//     public void keyPressed(KeyEvent tecla){

//         int codigoTecla = tecla.getKeyCode();

//         switch(codigoTecla){
//           case KeyEvent.VK_W:
//             cima = true;
//             break;
//           case KeyEvent.VK_S:
//             baixo = true;
//             break;
//           case KeyEvent.VK_D:
//             direita = true;
//             break;
//           case KeyEvent.VK_A:
//             esquerda = true;
//             break;
//         }


        


//     }

//   @Override
//     public void keyReleased(KeyEvent tecla){

//         int codigoTecla = tecla.getKeyCode();

//         switch(codigoTecla){
//           case KeyEvent.VK_W:
//             cima = false;
//             break;
//           case KeyEvent.VK_S:
//             baixo = false;
//             break;
//           case KeyEvent.VK_D:
//             direita = false;
//             break;
//           case KeyEvent.VK_A:
//             esquerda = false;
//             break;
//         }



//     }
//   }

package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controles extends KeyAdapter {

    private boolean upPressed, downPressed, leftPressed, rightPressed;

    public boolean getUpPressed() {
        return upPressed;
    }

    public boolean getDownPressed() {
        return downPressed;
    }

    public boolean getLeftPressed() {
        return leftPressed;
    }

    public boolean getRightPressed() {
        return rightPressed;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_W -> upPressed = true;
            case KeyEvent.VK_S -> downPressed = true;
            case KeyEvent.VK_A -> leftPressed = true;
            case KeyEvent.VK_D -> rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_W -> upPressed = false;
            case KeyEvent.VK_S -> downPressed = false;
            case KeyEvent.VK_A -> leftPressed = false;
            case KeyEvent.VK_D -> rightPressed = false;
        }
    }
}
