package mapa;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Obstaculos {

    private List<Rectangle> obstaculosMapa1;
    private List<Rectangle> obstaculosMapa2;
    private List<Rectangle> obstaculosMapa3;


    public Obstaculos() {
        inicializarObstaculos();
    }

    private void inicializarObstaculos() {

        
        
    //MAPA 1
    //     obstaculosMapa1 = new ArrayList<>();
    //     obstaculosMapa1.add(new Rectangle(300, 200, 50, 150));
    //     obstaculosMapa1.add(new Rectangle(200, 32, 50, 132));
    //     obstaculosMapa1.add(new Rectangle(725, 200, 30, 150));
    //     obstaculosMapa1.add(new Rectangle(725, 395, 30,  40));
    //     obstaculosMapa1.add(new Rectangle(790,200,150, 30));

    // //MAPA 2
    //     obstaculosMapa2 = new ArrayList<>();
    //     obstaculosMapa2.add(new Rectangle(100, 25, 50, 200));
    //     obstaculosMapa2.add(new Rectangle(200, 200, 50, 268));
    //     obstaculosMapa2.add(new Rectangle(300, 25, 50, 200));
    //     obstaculosMapa2.add(new Rectangle(450, 300, 75, 150));
    //     obstaculosMapa2.add(new Rectangle(600, 100, 200, 100));

    //     //LOCAL DE COMBATE - MAPA 2
    //     obstaculosMapa2.add(new Rectangle(893, 350, 75, 30));
    //     obstaculosMapa2.add(new Rectangle(863, 420, 30, 48));
        

    // //MAPA 3
    //     obstaculosMapa3 = new ArrayList<>();
    //     obstaculosMapa3.add(new Rectangle(150, 25, 50, 125));
    //     obstaculosMapa3.add(new Rectangle(250, 250, 50, 175));
    //     obstaculosMapa3.add(new Rectangle(350, 50, 50, 120));
    //     obstaculosMapa3.add(new Rectangle(450, 200, 100, 150));
    //     obstaculosMapa3.add(new Rectangle(625, 50, 50, 150));
        
    //     //LOCAL DO ALIADO - MAPA 3
    //     obstaculosMapa3.add(new Rectangle(570, 400, 30, 75));
    //     obstaculosMapa3.add(new Rectangle(675, 400, 30, 75));
    //     obstaculosMapa3.add(new Rectangle(570, 370, 50, 30));
    //     obstaculosMapa3.add(new Rectangle(655, 370, 50, 30));

    //     //LOCAL DE COMBATE - MAPA 3
    //     obstaculosMapa3.add(new Rectangle(925, 75, 50, 50));
    //     obstaculosMapa3.add(new Rectangle(875, 125, 50, 50));
    //     obstaculosMapa3.add(new Rectangle(825, 175, 50,50 ));
    //     obstaculosMapa3.add(new Rectangle(825, 275, 50,50 ));
    //     obstaculosMapa3.add(new Rectangle(875, 325,50, 50));
    //     obstaculosMapa3.add(new Rectangle(925, 375,50, 50));

         
    //MAPA 1
        obstaculosMapa1 = new ArrayList<>();
        obstaculosMapa1.add(new Rectangle(300, 200, 50, 150));
        obstaculosMapa1.add(new Rectangle(200, 32, 50, 132));
        obstaculosMapa1.add(new Rectangle(725, 200, 30, 150));
        obstaculosMapa1.add(new Rectangle(725, 395, 30,  40));
        obstaculosMapa1.add(new Rectangle(790,200,150, 30));

    //MAPA 2
        obstaculosMapa2 = new ArrayList<>();
        obstaculosMapa2.add(new Rectangle(100, 25, 50, 200));
        obstaculosMapa2.add(new Rectangle(200, 200, 50, 250));
        obstaculosMapa2.add(new Rectangle(300, 25, 50, 200));
        obstaculosMapa2.add(new Rectangle(450, 300, 75, 150));
        //obstaculosMapa2.add(new Rectangle(600, 100, 200, 100));
        

        //LOCAL DE COMBATE - MAPA 2
        obstaculosMapa2.add(new Rectangle(898, 320, 50, 50));
        obstaculosMapa2.add(new Rectangle(800, 420, 50, 50));
        

    //MAPA 3
        obstaculosMapa3 = new ArrayList<>();
        obstaculosMapa3.add(new Rectangle(150, 25, 50, 150));
        obstaculosMapa3.add(new Rectangle(250, 250, 50, 170));
        obstaculosMapa3.add(new Rectangle(350, 50, 50, 120));
        obstaculosMapa3.add(new Rectangle(625, 50, 50, 150));
        
        //LOCAL DO ALIADO - MAPA 3
        obstaculosMapa3.add(new Rectangle(540, 408, 30, 68));
        obstaculosMapa3.add(new Rectangle(675, 408, 30, 68));
       

        //LOCAL DE COMBATE - MAPA 3
        obstaculosMapa3.add(new Rectangle(925, 75, 50, 50));
        obstaculosMapa3.add(new Rectangle(875, 125, 50, 50));
        obstaculosMapa3.add(new Rectangle(825, 175, 50,50 ));
        obstaculosMapa3.add(new Rectangle(825, 275, 50,50 ));
        obstaculosMapa3.add(new Rectangle(875, 325,50, 50));
        obstaculosMapa3.add(new Rectangle(925, 375,50, 50));



    }

    public List<Rectangle> obterObstaculos(int mapaAtual) {
        return switch (mapaAtual) {
            case 1 -> obstaculosMapa1;
            case 2 -> obstaculosMapa2;
            case 3 -> obstaculosMapa3;
            default -> new ArrayList<>();
        };
    }
}
