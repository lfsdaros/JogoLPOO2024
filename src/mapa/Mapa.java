// package mapa;

// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Image;
// import java.awt.Rectangle;
// import java.util.List;
// import javax.swing.ImageIcon;


// public class Mapa {

//     private final int larguraMapa = 1000;
//     private final int alturaMapa = 500;
//     private int mapaAtual;
//     private Obstaculos obstaculos;

//     private final Image pedraTile = new ImageIcon("resources\\images\\imagemPedra.png").getImage();
//     private final Image coqueiroTile = new ImageIcon("resources\\images\\imagemCoqueiro.png").getImage();
//     private final Image barcoTile = new ImageIcon("resources\\images\\imagemBarco.png").getImage();
//     private final Image bandeiraFinal = new ImageIcon("resources\\images\\imagemBandeiraFinal.png").getImage();
//     private final Image bandeiraT = new ImageIcon("resources\\images\\imagemBandeiraT.png").getImage();
//     private final Image bandeiraL = new ImageIcon("resources\\images\\imagemBandeiraL.png").getImage();
//     public Mapa(){
//         this.obstaculos = new Obstaculos();
//     }


//     public void desenharMapa(Graphics g, int mapaAtual) {

//         List<Rectangle> listaObstaculos = obstaculos.obterObstaculos(mapaAtual);
//         Color corBorda = Color.GRAY;
//         Color corObstaculos; // = Color.BLACK;

//         switch (mapaAtual) {
//             case 1:
//                 corObstaculos = Color.BLACK;//new Color(0, 100, 0);      //MESMA COR DO FUNDO   
            
//             //DESENHANDO FUNDO 
//                 g.setColor(new Color(0, 100, 0));
//                 g.fillRect(0, 0, larguraMapa, alturaMapa);

//             //DESENHANDO OBSTÁCULOS
//                 for (Rectangle obstaculo : listaObstaculos) {
//                     g.setColor(corObstaculos);
//                     g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
//                 }
                
//             //TILES - OBSTÁCULOS
//                 g.drawImage(pedraTile, 300, 200, null);
//                 g.drawImage(pedraTile, 300, 250, null);
//                 g.drawImage(pedraTile, 300, 300, null);
//                 g.drawImage(pedraTile, 200, 32, null);
//                 g.drawImage(pedraTile, 200, 72, null);
//                 g.drawImage(pedraTile, 200, 122, null);
//                 g.drawImage(bandeiraFinal, 100, 300, null);

//             //TILES - ALIADO
//                 g.setColor(Color.ORANGE);
//                 g.fillRect(850, 425, 20, 20);
//                 g.drawString("Cabo Bruno", 835, 420);
                
            
//             //TILES - INIMIGO
//                 g.setColor(Color.RED);
//                 g.fillRect(940, 40, 25,25);
//                 g.drawString("!!!", 925, 70);

//                 break;

//             case 2:
//                // corBorda = new Color(162,135,68);                       //AREIA ESCURA
//                 corObstaculos = new Color(92, 64, 5);                   //MARROM
            
//             //DESENHANDO FUNDO
//                 g.setColor(new Color(194, 178, 128));                   //AREIA CLARA
//                 g.fillRect(25, 25, larguraMapa -25, alturaMapa - 25);
//                 g.setColor(new Color(65,107,223));                      //ÁGUA
//                 g.fillRect(500, alturaMapa/2 , 475, alturaMapa - 25);


//             //DESENHANDO OBSTÁCULOS
//                 for (Rectangle obstaculo : listaObstaculos) {
//                     g.setColor(corObstaculos);
//                     g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
//                 }

//             //TILES - OBSTÁCULOS

//             //TILES - ALIADO

//             //TILES - INIMIGO
//                 g.drawImage(barcoTile, 600, 270, null);
//                 g.drawImage(barcoTile, 700, 320, null);
//                 g.drawImage(bandeiraL, 930, 430, null);
                

//                 break;

//             case 3:

//                 //corBorda = new Color(87,88,87);
//                 corObstaculos = Color.BLACK;
                
//                 g.setColor(new Color(231,230,221));
//                 g.fillRect(0, 0, larguraMapa, alturaMapa);
            
            
//             //DESENHANDO OBSTÁCULOS
//                 for (Rectangle obstaculo : listaObstaculos) {
//                     g.setColor(corObstaculos);
//                     g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
//                 }



                
//             //TILES - OBSTÁCULOS

//             //TILES - ALIADO

//             //TILES - INIMIGO
//                 g.drawImage(bandeiraFinal, 875, 245, 32, 32, null);
                
            
//                 break;

//         }

//     //DESENHANDO BORDAS
//         g.setColor(corBorda);
//         g.fillRect(0, 0, larguraMapa, 32);
//         g.fillRect(0, 0, 32, alturaMapa);
//         g.fillRect(0, alturaMapa-32, larguraMapa, 32);
//         g.fillRect(larguraMapa-32 , 0, 32, alturaMapa);

//     }



//     public int getLargura() {
//         return larguraMapa;
//     }

//     public int getAltura() {
//         return alturaMapa;
//     }

//     public int getMapaAtual(){
//         return mapaAtual;
//     }

// }

package mapa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.ImageIcon;


public class Mapa {

    private final int larguraMapa = 1000;
    private final int alturaMapa = 500;
    private int mapaAtual;
    private final Obstaculos obstaculos;

    private final Image pedraTile = new ImageIcon("resources\\images\\imagemPedra.png").getImage();
    private final Image bandeiraFinal = new ImageIcon("resources\\images\\imagemBandeiraFinal.png").getImage();
    private final Image bandeiraT = new ImageIcon("resources\\images\\imagemBandeiraT.png").getImage();
    private final Image bandeiraL = new ImageIcon("resources\\images\\imagemBandeiraL.png").getImage();
    private final Image coqueiroTile = new ImageIcon("resources\\images\\imagemCoqueiro.png").getImage();
    private final Image barcoTile = new ImageIcon("resources\\images\\imagemBarco.png").getImage();
    private final Image chaoTile = new ImageIcon("resources\\images\\chaoTile.png").getImage();
    private final Image tilePinheiro = new ImageIcon("resources\\images\\tilePinheiro.png").getImage();
    private final Image canhaoTile1 = new ImageIcon("resources\\images\\canhaoTile1.png").getImage();
    private final Image canhaoTile2 = new ImageIcon("resources\\images\\canhaoTile2.png").getImage();
    private final Image madeiraTile = new ImageIcon("resources\\images\\madeiraTile.png").getImage();
    private final Image pedraTile2 = new ImageIcon("resources\\images\\imagemPedra2.png").getImage();
    private final Image aliadoTile2 = new ImageIcon("resources\\images\\aliadoImagem2.png").getImage();

    public Mapa(){
        this.obstaculos = new Obstaculos();
    }

    public void desenharMapa(Graphics g, int mapaAtual) {

        List<Rectangle> listaObstaculos = obstaculos.obterObstaculos(mapaAtual);
        Color corBorda = Color.GRAY;
        Color corObstaculos; //= Color.BLACK;

        switch (mapaAtual) {
            case 1:
               // corBorda = new Color(92, 64, 5);           //MARROM
                corObstaculos = (new Color(0, 100, 0));//new Color(0, 100, 0);      //MESMA COR DO FUNDO   
            
            //DESENHANDO FUNDO 
                g.setColor(new Color(0, 100, 0));
                g.fillRect(0, 0, larguraMapa, alturaMapa);

            //DESENHANDO OBSTÁCULOS
                for (Rectangle obstaculo : listaObstaculos) {
                    g.setColor(corObstaculos);
                    g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
                }
                
            //TILES - OBSTÁCULOS
                g.drawImage(pedraTile, 300, 200, null);
                g.drawImage(pedraTile, 300, 250, null);
                g.drawImage(pedraTile, 300, 300, null);
                g.drawImage(pedraTile, 200, 32, null);
                g.drawImage(pedraTile, 200, 72, null);
                g.drawImage(pedraTile, 200, 122, null);
                //g.drawImage(bandeiraFinal, 100, 300, null);

            //TILES - ALIADO
                g.setColor(Color.ORANGE);
                //g.fillRect(850, 425, 20, 20);
                g.drawString("Cabo Bruno", 825, 420);
                g.drawImage(aliadoTile2, 840, 425, null);
                
            
            //TILES - INIMIGO
                
                g.drawImage(bandeiraT, 940, 40, null);
                g.drawImage(pedraTile2, 725, 200, null);
                g.drawImage(pedraTile2, 725, 230, null);
                g.drawImage(pedraTile2, 725, 260, null);
                g.drawImage(pedraTile2, 725, 290, null);
                g.drawImage(pedraTile2, 725, 320, null);
                g.drawImage(pedraTile2, 725, 395, null);
                g.drawImage(pedraTile2, 790, 200, null);
                g.drawImage(pedraTile2, 820, 200, null);
                g.drawImage(pedraTile2, 850, 200, null);
                g.drawImage(pedraTile2, 880, 200, null);
                g.drawImage(pedraTile2, 910, 200, null);
              

                break;

            case 2:
            
                corObstaculos = new Color(194, 178, 128); 
            //DESENHANDO FUNDO
                g.setColor(new Color(194, 178, 128));                   //AREIA CLARA
                g.fillRect(25, 25, larguraMapa -25, alturaMapa - 25);
                g.setColor(new Color(65,107,223));                      //ÁGUA
                g.fillRect(500, alturaMapa/2 , 475, alturaMapa - 25);


            //DESENHANDO OBSTÁCULOS
                for (Rectangle obstaculo : listaObstaculos) {
                    g.setColor(corObstaculos);
                    g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
                }

            //TILES - OBSTÁCULOS
                g.drawImage(coqueiroTile, 100, 25, null);
                g.drawImage(coqueiroTile, 100, 75, null);
                g.drawImage(coqueiroTile, 100, 125, null);
                g.drawImage(coqueiroTile, 100, 175, null);
                g.drawImage(coqueiroTile, 200, 200, null);
                g.drawImage(coqueiroTile, 200, 250, null);
                g.drawImage(coqueiroTile, 200, 300, null);
                g.drawImage(coqueiroTile, 200, 350, null);
                g.drawImage(coqueiroTile, 200, 400, null);
                g.drawImage(coqueiroTile, 300, 25, null);
                g.drawImage(coqueiroTile, 300, 75, null);
                g.drawImage(coqueiroTile, 300, 125, null);
                g.drawImage(coqueiroTile, 300, 175, null);
                g.drawImage(chaoTile, 450, 300, null);
                g.drawImage(chaoTile, 450, 375, null);
            //TILES - ALIADO

            //TILES - INIMIGO
                g.drawImage(barcoTile, 600, 270, null);
                g.drawImage(barcoTile, 700, 320, null);
                g.drawImage(bandeiraL, 930, 430, null);
                g.drawImage(canhaoTile1, 898, 320, null);
                g.drawImage(canhaoTile1, 800, 420, null);
                

                break;

            case 3:

                //corBorda = new Color(87,88,87);
                corObstaculos = (new Color(212,201,201));
                
                g.setColor(new Color(212,201,201));
                g.fillRect(0, 0, larguraMapa, alturaMapa);

                

               
            
            
            //DESENHANDO OBSTÁCULOS
                for (Rectangle obstaculo : listaObstaculos) {
                    g.setColor(corObstaculos);
                    g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
                }



                
            //TILES - OBSTÁCULOS
                g.drawImage(tilePinheiro, 150, 25, null);
                g.drawImage(tilePinheiro, 150, 75, null);
                g.drawImage(tilePinheiro, 150, 125, null);
                g.drawImage(tilePinheiro, 250, 250, null);
                g.drawImage(tilePinheiro, 250, 300, null);
                g.drawImage(tilePinheiro, 250, 350, null);
                g.drawImage(tilePinheiro, 350, 50, null);
                g.drawImage(tilePinheiro, 350, 100, null);
                g.drawImage(tilePinheiro, 625, 50, null);
                g.drawImage(tilePinheiro, 625, 100, null);
                g.drawImage(tilePinheiro, 625, 150, null);
                


            //TILES - ALIADO
                g.drawImage(madeiraTile, 540, 408, null);
                g.drawImage(madeiraTile, 540, 438, null);
                g.drawImage(madeiraTile, 675, 408, null);
                g.drawImage(madeiraTile, 675, 438, null);
                

            //TILES - INIMIGO
                g.drawImage(bandeiraFinal, 875, 245, 32, 32, null);
                g.drawImage(canhaoTile2, 925, 75, null);
                g.drawImage(canhaoTile2, 875, 125, null);
                g.drawImage(canhaoTile2, 825, 175, null);
                g.drawImage(canhaoTile2, 825, 275, null);
                g.drawImage(canhaoTile2, 875, 325, null);
                g.drawImage(canhaoTile2, 925, 375, null);
            
                break;

        }

    //DESENHANDO BORDAS
        g.setColor(corBorda);
        g.fillRect(0, 0, larguraMapa, 32);
        g.fillRect(0, 0, 32, alturaMapa);
        g.fillRect(0, alturaMapa-32, larguraMapa, 32);
        g.fillRect(larguraMapa-32 , 0, 32, alturaMapa);

    }



    public int getLargura() {
        return larguraMapa;
    }

    public int getAltura() {
        return alturaMapa;
    }

    public int getMapaAtual(){
        return mapaAtual;
    }

}
