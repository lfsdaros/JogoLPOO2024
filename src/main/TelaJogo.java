package main;


import entidades.personagem.PersonagemPadrao; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

//import mapa.Mapa;



public class TelaJogo extends JPanel implements Runnable {
    
    final int tamanhoOriginalQuadrados = 16;  // QUADRADO 16x16 (PADRÃO)
    final int escalaQuadrados = 3;            // ESCALA DE AMPLIAÇÃO 3:1
    final int tamanhoQuadrados = tamanhoOriginalQuadrados * escalaQuadrados;  // QUADRADO 48x48 (COM ESCALA)

    final int numMaxColunas = 16;
    final int numMaxLinhas = 12;
    final int larguraMaxTela = tamanhoQuadrados * numMaxColunas;  // 768 PIXELS
    final int alturaMaxTela = tamanhoQuadrados * numMaxLinhas;    // 576 PIXELS
    
    // private double intervalo;
    // private double delta;
    // private long ultimaAtualizacao;
    // private long tempoReal;

    //FPS
    int fps = 60;

    Controles teclaPressionada = new Controles();   //Criando objeto do tipo controles
    //Mapa mapa;
    PersonagemPadrao player;

    Thread gameThread; //Loop do jogo

    //POSIÇÃO INICIAL
    // private int x_personagem = 100;
    // private int y_personagem = 100;
    // private int velocidadePersonagem = 5;

    //Item item1; //= new Item('e', 140, 140);

    public TelaJogo(){

        this.setPreferredSize(new Dimension(larguraMaxTela, alturaMaxTela));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(teclaPressionada);
        this.setFocusable(true);

    }


    public void startGameThread(){

        gameThread = new Thread(this);
        gameThread.start(); //isso chama o metodo run
    }


    @Override
    public void run(){      //LOOP DO JOGO A PARTIR DAQUI

        double intervalo = 1000000000/fps;    // 1 nanosegundo / 60
        double delta = 0;
        long ultimaAtualizacao  = System.nanoTime() + intervaloPrintTela;
        long tempoReal = 0;

        while(gameThread != null){

            tempoReal = System.nanoTime();
                    delta += (tempoReal - ultimaAtualizacao) / intervalo;
                    ultimaAtualizacao = tempoReal;
        
                    if (delta >= 1) {
                        update();
                        repaint();
                        delta--;
                    }
                }



            //long currentTime = System.nanoTime();   //retorna tempo em nanosegundos
            

            //update();

            //repaint(); //chamando a funcao paintComponent
           // 
            // try{
            //     double tempoFaltante = tempoProximoPrintTela - System.nanoTime();
            //     tempoFaltante = tempoFaltante/1000000; //convertendo para milisegundos

            //     if(tempoFaltante < 0){
            //         tempoFaltante = 0;
            //     }

            //     Thread.sleep((long)tempoFaltante);     //Pausa o jogo durante esse tempo (tempoFaltante)

            //     tempoProximoPrintTela += intervaloPrintTela;

            // } catch(InterruptedException e){
            // }


        }
    












    // @Override
    // public void run() {
    //     intervalo = 1000000000 / fps;
    //     delta = 0;
    //     ultimaAtualizacao = System.nanoTime();
    //     tempoReal = 0;

    //     while (gameThread != null) {
    //         tempoReal = System.nanoTime();
    //         delta += (tempoReal - ultimaAtualizacao) / intervalo;
    //         ultimaAtualizacao = tempoReal;

    //         if (delta >= 1) {
    //             update();
    //             repaint();
    //             delta--;
    //         }
    //     }
    //}




    public void update(){       //mudar posiçao do personagem aqui
        int coord_y = player.getY();
        int coord_x = player.getX();
        int sprint = player.getVelocidade();

        if(teclaPressionada.getUpPressed()){
            player.setY((coord_y - sprint)); //coord_y -= sprint;
        } else if(teclaPressionada.getDownPressed()){
            player.setY((coord_y + sprint)); //coord_y += sprint;
        } else if(teclaPressionada.getRightPressed()){
            player.setX((coord_x + sprint)); //coord_x += sprint;
        } else if(teclaPressionada.getLeftPressed()){
            player.setX((coord_x - sprint)); //coord_x -= sprint;
        }



    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.BLACK);

        g2.drawRect(100, 100, tamanhoQuadrados, tamanhoQuadrados);

        g2.fillRect(player.getX(), player.getY(), tamanhoQuadrados, tamanhoQuadrados);




        g2.dispose();

        
    }

}


// public class TelaJogo extends JPanel implements Runnable {

//     private final int originalTileSize = 16;
//     private final int scale = 3;
//     private final int tileSize = originalTileSize * scale;
//     private final int maxScreenCol = 16;
//     private final int maxScreenRow = 12;
//     private final int screenWidth = tileSize * maxScreenCol;
//     private final int screenHeight = tileSize * maxScreenRow;
//     private double intervalo;
//     private double delta;
//     private long ultimaAtualizacao;
//     private long tempoReal;
//     // private Image playerSprite;
//     //private Image objectSprite;
//     private int objectX;
//     private int objectY;
//     private int objectWidth;
//     private int objectHeight;
//     private int fps = 60;

//     Controles controles = new Controles();
//     Thread gameThread;
//     Mapa mapa;
//     PersonagemPadrao player;

//     private int playerX = 100;
//     private int playerY = 100;
//     private int playerSpeed = 4;

//     public TelaJogo(){
//         this.setPreferredSize(new Dimension(screenWidth, screenHeight));
//         this.setBackground(Color.black);
//         this.setDoubleBuffered(true);
//         this.addKeyListener(controles);
//         this.setFocusable(true);

//         //playerSprite = new ImageIcon("C:\\Users\\Saúde\\OneDrive\\Área de Trabalho\\FrontEnd Hospitais\\png-clipart-pixel-art-drawing-art-game-character-animation-animation-game-cartoon.png").getImage();
//         //objectSprite = new ImageIcon("C:\\Users\\Saúde\\OneDrive\\Área de Trabalho\\FrontEnd Hospitais\\png-transparent-pixel-art-2d-platform-text-computer-computer-wallpaper.png").getImage();

//         objectX = 200;
//         objectY = 300;
//         objectWidth = 32;
//         objectHeight = 32;

//         mapa = new Mapa(maxScreenCol, maxScreenRow);
//         //mapa.inicializarMapaExpansao();
//     }

//     public void startGameThread() {
//         gameThread = new Thread(this);
//         gameThread.start();
//     }

//     @Override
//     public void run() {
//         intervalo = 1000000000 / fps;
//         delta = 0;
//         ultimaAtualizacao = System.nanoTime();
//         tempoReal = 0;

//         while (gameThread != null) {
//             tempoReal = System.nanoTime();
//             delta += (tempoReal - ultimaAtualizacao) / intervalo;
//             ultimaAtualizacao = tempoReal;

//             if (delta >= 1) {
//                 update();
//                 repaint();
//                 delta--;
//             }
//         }
//     }

//     public void update() {
//         if (controles.getUpPressed()) {
//             playerY -= playerSpeed;
//             player.setY(playerY);
//         } else if (controles.getDownPressed()) {
//             playerY += playerSpeed;
//             player.setY(playerY);
//         } else if (controles.getLeftPressed()) {
//             playerX -= playerSpeed;
//             player.setX(playerX);
//         } else if (controles.getRightPressed()) {
//             playerX += playerSpeed;
//             player.setX(playerX);
//         }
//         // if (playerX < 0 || playerX >= mapa.getLarguraMapa() || playerY < 0 || playerY >= mapa.getAlturaMapa()) {
//         //     mapa.expandMap();
//         // }
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         Graphics2D g2 = (Graphics2D) g;

//         int startX = Math.max(0, playerX / tileSize - screenWidth / tileSize / 2);
//         int startY = Math.max(0, playerY / tileSize - screenHeight / tileSize / 2);
//         int endX = Math.min(mapa.getLarguraMapa() / tileSize, startX + screenWidth / tileSize + 1);
//         int endY = Math.min(mapa.getAlturaMapa() / tileSize, startY + screenHeight / tileSize + 1);

//         // for (int x = startX; x < endX; x++) {
//         //     for (int y = startY; y < endY; y++) {
//         //         int tileType = mapa.getMapaExpansao()[x][y];
//         //         g2.drawImage(mapa.getTileImages()[tileType], x * tileSize - playerX + screenWidth / 2, y * tileSize - playerY + screenHeight / 2, tileSize, tileSize, null);
//         //     }
//         // }

//         g2.drawRect(playerX, playerY, tileSize, tileSize); //(playerSprite, playerX, playerY, tileSize, tileSize, null);
//         ///g2.drawImage(objectSprite, objectX, objectY, objectWidth, objectHeight, null);
//         g2.dispose();
//     }
    
// }
