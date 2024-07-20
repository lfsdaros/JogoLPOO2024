// package main;

// import entidades.personagem.PersonagemPadrao;
// import java.awt.*;
// import javax.swing.*;

// public class TelaJogo extends JPanel implements Runnable {
//     private final PersonagemPadrao player;
//     private final int DELAY = 16; // Aproximadamente 60 FPS
//     private boolean running = true;

//     public TelaJogo() {
        
//         setFocusable(true);
//         requestFocusInWindow();

//         setBackground(Color.BLACK);
//         // Initialize character
//         player = new PersonagemPadrao(100, 100, 5,100,100,1);

//         // Initialize and add controls
//         final Controles controles = new Controles(this, player);
//         addKeyListener(controles);

//         // Start game loop
//         new Thread(this).start();
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // Draw the character
//         g.setColor(Color.WHITE);
//         g.fillRect(player.getX(), player.getY(), 50, 50);
//     }

//     public void update() {
//         if (player.isMovingUp()) {
//             player.moveUp();
//         }
//         if (player.isMovingLeft()) {
//             player.moveLeft();
//         }
//         if (player.isMovingDown()) {
//             player.moveDown();
//         }
//         if (player.isMovingRight()) {
//             player.moveRight();
//         }
//         repaint();
//     }

//     @Override
//     public void run() {
//         while (running) {
//             update();
//             try {
//                 Thread.sleep(DELAY);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     public void stop() {
//         running = false;
//     }


///TESTEEEE

// }

//package main;

// import entidades.personagem.PersonagemPadrao;
// import java.awt.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;
// import javax.swing.*;

// public class TelaJogo extends JPanel {
//     private static final int LARGURA = 1000;
//     private static final int ALTURA = 500;

//     private final PersonagemPadrao personagem;

//     public TelaJogo() {

//         personagem = new PersonagemPadrao(100, 100, 5, 100, 50, 1);
        
//         setPreferredSize(new Dimension(LARGURA, ALTURA));
//         setFocusable(true);
//         setBackground(Color.GREEN);

//         addKeyListener(new KeyAdapter() {

//             @Override
//             public void keyPressed(KeyEvent e) {
//                 int keyCode = e.getKeyCode();
//                 if (keyCode == KeyEvent.VK_M) {
//                     mapaAtual = 1;
//                 } else if (keyCode == KeyEvent.VK_N) {
//                     mapaAtual = 2;
//                 } else if (keyCode == KeyEvent.VK_L) {
//                     mapaAtual = 3;
//                 } else {
//                     moverPersonagem(keyCode);
//                 }
//                 repaint();
//     }

//     public void iniciar() {
//         JFrame frame = new JFrame("WORLD WAR LPOO");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(this);
//         frame.pack();
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);

//         g.setColor(Color.GRAY);
//         g.fillRect(0, 0, LARGURA, 25);
//         g.fillRect(0, 0, 25, ALTURA);
//         g.fillRect(0, ALTURA-25, LARGURA, 25);
//         g.fillRect(LARGURA-25 , 0, 25, ALTURA);




//         g.setColor(Color.RED);
//         g.fillRect(personagem.getX(), personagem.getY(), 25, 25);
//     }

//     private void moverPersonagem(int keyCode) {
//         int x = personagem.getX();
//         int y = personagem.getY();
//         int velocidade = personagem.getVelocidade();

//         switch (keyCode) {
//             case KeyEvent.VK_UP:
//                 if (y > 25) {personagem.setY(y - velocidade);}
//                 break;
//             case KeyEvent.VK_DOWN:
//                 if (y < ALTURA - 50) {personagem.setY(y + velocidade);}
//                 break;
//             case KeyEvent.VK_LEFT:
//                 if (x > 25) {personagem.setX(x - velocidade);}
//                 break;
//             case KeyEvent.VK_RIGHT:
//                 if (x < LARGURA - 50) {personagem.setX(x + velocidade);}
//                 break;
//             case KeyEvent.VK_Q:
//                 System.exit(0);
//                 break;
//             default:
//                 break;
//         }
//     }
// }

//NOVOS TESTE 13/07

// import entidades.personagem.*;
// import java.awt.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;
// import javax.swing.*;;

// public class TelaJogo extends JPanel {
    
//     private static final int larguraMapa = 1000;
//     private static final int alturaMapa = 500;
//     private static final int quadradoPersonagem = 25;

//     private final PersonagemPadrao personagem;
//     private int mapaAtual = 1;

//     public TelaJogo() {

//         personagem = new PersonagemPadrao(100, 100, 5, 100, 50, 1);
//         setPreferredSize(new Dimension(larguraMapa, alturaMapa));
//         setFocusable(true);
//         addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyPressed(KeyEvent e) {
//                 int keyCode = e.getKeyCode();
                
//                 if (keyCode == KeyEvent.VK_M) {
//                     mapaAtual = 1;
//                 } else if (keyCode == KeyEvent.VK_N) {
//                     mapaAtual = 2;
//                 } else if (keyCode == KeyEvent.VK_L) {
//                     mapaAtual = 3;
//                 } else {
//                     moverPersonagem(keyCode);
//                 }
//                 repaint();
//             }
//         });
//     }

//     public void iniciar() {
//         JFrame frame = new JFrame("Jogo");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(this);
//         frame.pack();
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);

//         // Desenha fundo e bordas de acordo com o mapa atual
//         switch (mapaAtual) {
//             case 1:
//                 g.setColor(Color.GREEN);
//                 g.fillRect(0, 0, larguraMapa, alturaMapa);
//                 g.setColor(Color.GRAY);
//                 break;
//             case 2:
//                 g.setColor(new Color(139, 69, 19)); // Marrom
//                 g.fillRect(0, 0, larguraMapa, alturaMapa);
//                 g.setColor(Color.GREEN);
//                 break;
//             case 3:
//                 g.setColor(Color.WHITE);
//                 g.fillRect(0, 0, larguraMapa, alturaMapa);
//                 g.setColor(Color.GRAY);
//                 break;
//         }

//         // Desenha borda
//         g.fillRect(0, 0, larguraMapa, 25);
//         g.fillRect(0, 0, 25, alturaMapa);
//         g.fillRect(0, alturaMapa-25, larguraMapa, 25);
//         g.fillRect(larguraMapa-25 , 0, 25, alturaMapa);

//         // Desenha personagem
//         g.setColor(Color.RED);
//         g.fillRect(personagem.getX(), personagem.getY(), quadradoPersonagem, quadradoPersonagem);
//     }

//     private void moverPersonagem(int keyCode) {
//         int x = personagem.getX();
//         int y = personagem.getY();
//         int velocidade = personagem.getVelocidade();

//         switch (keyCode) {
//             case KeyEvent.VK_UP:
//                 if (y > 25) {personagem.setY(y - velocidade);}
//                 break;
//             case KeyEvent.VK_DOWN:
//                 if (y < alturaMapa - 50) {personagem.setY(y + velocidade);}
//                 break;
//             case KeyEvent.VK_LEFT:
//                 if (x > 25) {personagem.setX(x - velocidade);}
//                 break;
//             case KeyEvent.VK_RIGHT:
//                 if (x < larguraMapa - 50) {personagem.setX(x + velocidade);}
//                 break;
//             case KeyEvent.VK_Q:
//                 System.exit(0);
//                 break;
//             default:
//                 break;
//         }
//     }
// }
 

///CORRETOOOOOOOOOOOOOOOOOOOOOOO



package main;

import entidades.npcs.Inimigos;
import entidades.personagem.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.*;
import mapa.*;

public class TelaJogo extends JPanel {
    private static final int tamanhoPersonagem = 25;  //quadrado 25x25
    private PersonagemPadrao personagem;
    
    private int mapaAtual = 1;
    private Mapa mapa;
    private Obstaculos obstaculos;

    private Timer timer;


    
    public TelaJogo(Mapa mapa, PersonagemPadrao personagem) {

        this.mapa = mapa;
        this.personagem = personagem;
        this.obstaculos = new Obstaculos();
        setPreferredSize(new Dimension(mapa.getLargura(), mapa.getAltura()));  // largura = 1000 ; largura = 500
        setFocusable(true);
        

        Controles controles = new Controles(this, personagem);
        addKeyListener(controles);

        timer = new Timer(16, (ActionEvent e) -> {
            //personagem.mover(obstaculos.obterObstaculos(mapaAtual));
            repaint();
        });
        timer.start();
    }

        // addKeyListener(new KeyAdapter() {
        //     @Override
        //     public void keyPressed(KeyEvent e) {
        //         int keyCode = e.getKeyCode();
                
        //         switch (keyCode) {
        //             case KeyEvent.VK_M:
        //                 personagem.setX(50);
        //                 personagem.setY(50);
        //                 mapaAtual = Mapa.MAPA_1;
        //                 break;
        //             case KeyEvent.VK_N:
        //                 personagem.setX(50);
        //                 personagem.setY(50);
        //                 mapaAtual = Mapa.MAPA_2;
        //                 break;
        //             case KeyEvent.VK_L:
        //                 personagem.setX(50);
        //                 personagem.setY(50);
        //                 mapaAtual = Mapa.MAPA_3;
        //                 break;
        //             case KeyEvent.VK_Q:
        //                 System.exit(0);
        //             default:
        //                 moverPersonagem(keyCode);
        //                 break;
        //         }
        //         repaint();
        //     }
        // });
    //}

    public void setMapaAtual(int mapaAtual){
        this.mapaAtual = mapaAtual;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        mapa.desenharMapa(g, mapaAtual);

        // Desenha obstáculos
        
        List<Rectangle> listaObstaculos = obstaculos.obterObstaculos(mapaAtual);
        for (Rectangle obstaculo : listaObstaculos) {
            if(mapaAtual == 1){
                g.setColor(Color.ORANGE);
                g.fillRect(850, 425, 20, 20);
                g.drawString("Cabo Bruno", 835, 420);
                g.setColor(Color.RED);
                g.fillRect(940, 40, 25,25);
                g.drawString("!!!", 925, 70);
                g.setColor(new Color(92, 64, 5)); // marrom  _> cor dos obstaculos
            } else if (mapaAtual == 2){
                g.setColor(Color.GRAY);
            } else if (mapaAtual ==3) {
                g.setColor(Color.RED);
            }
            g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
        }

        // Desenha personagem
        g.setColor(Color.BLACK);
        g.fillRect(personagem.getX(), personagem.getY(), tamanhoPersonagem, tamanhoPersonagem);


        // // PRIMEIRO NPC
        // g.setColor(Color.ORANGE);
        // g.fillRect(850, 425, 20, 20);
        // g.drawString("Neymar", 835, 420);
    }

    public void actionPerformed(ActionEvent e){
        if (mapaAtual == 2) {
            JFrame combateFrame = new JFrame("Tela de Combate");
            combateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            combateFrame.setSize(800, 600);
            combateFrame.add(new TelaCombate(personagem, new Inimigos(200,200,3,100,20,1)));
            combateFrame.setVisible(true);
            //timer.stop(); // Parar a atualização da tela de jogo
        } else {
            repaint();
        }
        //personagem.mover(obstaculos.obterObstaculos(mapaAtual));
    }
}
