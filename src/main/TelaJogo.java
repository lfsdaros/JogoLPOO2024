// package main;


// import java.awt.Color; 
// import java.awt.Dimension;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import javax.swing.JPanel;
// import personagem.PersonagemPadrao;

// //import Mapa.Item;

// public class TelaJogo extends JPanel implements Runnable {
    
//     final int tamanhoOriginalQuadrados = 16;  // QUADRADO 16x16 (PADRÃO)
//     final int escalaQuadrados = 3;            // ESCALA DE AMPLIAÇÃO 3:1
//     final int tamanhoQuadrados = tamanhoOriginalQuadrados * escalaQuadrados;  // QUADRADO 48x48 (COM ESCALA)

//     final int numMaxColunas = 16;
//     final int numMaxLinhas = 12;
//     final int larguraMaxTela = tamanhoQuadrados * numMaxColunas;  // 768 PIXELS
//     final int alturaMaxTela = tamanhoQuadrados * numMaxLinhas;    // 576 PIXELS
    
//     //FPS
//     int FPS = 60;

//     Controles teclaPressionada = new Controles();   //Criando objeto do tipo controles
//     PersonagemPadrao player = new PersonagemPadrao(1);

//     Thread gameThread; //Loop do jogo

//     //POSIÇÃO INICIAL
//     // private int x_personagem = 100;
//     // private int y_personagem = 100;
//     // private int velocidadePersonagem = 5;

//     //Item item1; //= new Item('e', 140, 140);

//     public TelaJogo(){

//         this.setPreferredSize(new Dimension(larguraMaxTela, alturaMaxTela));
//         this.setBackground(Color.darkGray);
//         this.setDoubleBuffered(true);
//         this.addKeyListener(teclaPressionada);
//         this.setFocusable(true);

//     }


//     public void startGameThread(){

//         gameThread = new Thread(this);
//         gameThread.start(); //isso chama o metodo run
//     }


//     @Override
//     public void run(){      //LOOP DO JOGO A PARTIR DAQUI

//         double intervaloPrintTela = 1000000000/FPS;    // 1 nanosegundo / 60
//         double tempoProximoPrintTela  = System.nanoTime() + intervaloPrintTela;

//         while(gameThread != null){

//             //long currentTime = System.nanoTime();   //retorna tempo em nanosegundos
            

//             update();

//             repaint(); //chamando a funcao paintComponent
            
//             try{
//                 double tempoFaltante = tempoProximoPrintTela - System.nanoTime();
//                 tempoFaltante = tempoFaltante/1000000; //convertendo para milisegundos

//                 if(tempoFaltante < 0){
//                     tempoFaltante = 0;
//                 }

//                 Thread.sleep((long)tempoFaltante);     //Pausa o jogo durante esse tempo (tempoFaltante)

//                 tempoProximoPrintTela += intervaloPrintTela;

//             } catch(InterruptedException e){
//                 e.printStackTrace();
//             }


//         }
//     }
//     public void update(){       //mudar posiçao do personagem aqui
//         int coord_y = player.getY_personagem();
//         int coord_x = player.getX_personagem();
//         int sprint = player.getVelocidadePersonagem();

//         if(teclaPressionada.cima == true){
//             player.setY_personagem((coord_y - sprint)); //coord_y -= sprint;
//         } else if(teclaPressionada.baixo == true){
//             player.setY_personagem((coord_y + sprint)); //coord_y += sprint;
//         } else if(teclaPressionada.direita == true){
//             player.setX_personagem((coord_x + sprint)); //coord_x += sprint;
//         } else if(teclaPressionada.esquerda == true){
//             player.setX_personagem((coord_x - sprint)); //coord_x -= sprint;
//         }



//     }

//     public void paintComponent(Graphics g){

//         super.paintComponent(g);

//         Graphics2D g2 = (Graphics2D)g;

//         g2.setColor(Color.white);

//         g2.fillRect(player.getX_personagem(), player.getY_personagem(), tamanhoQuadrados, tamanhoQuadrados);




//         g2.dispose();

        
//     }

// }
