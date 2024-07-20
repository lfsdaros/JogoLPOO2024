package mapa;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Obstaculos {

    private List<Rectangle> obstaculosMapa1;
    private List<Rectangle> obstaculosMapa2;
    private List<Rectangle> obstaculosMapa3;

    //private Mapa mapa;

    public Obstaculos() {
        inicializarObstaculos();
    }

    private void inicializarObstaculos() {
        obstaculosMapa1 = new ArrayList<>();
        obstaculosMapa1.add(new Rectangle(450, 250, 50, 225));
        obstaculosMapa1.add(new Rectangle(300, 25, 50, 225));
        obstaculosMapa1.add(new Rectangle(700, 100, 70, 250));
        obstaculosMapa1.add(new Rectangle(725, 375, 30, 75 ));
        obstaculosMapa1.add(new Rectangle(825,200,150, 30));


        obstaculosMapa2 = new ArrayList<>();
        obstaculosMapa2.add(new Rectangle(100, 100, 50, 50));
        obstaculosMapa2.add(new Rectangle(300, 300, 50, 100));

        obstaculosMapa3 = new ArrayList<>();
        obstaculosMapa3.add(new Rectangle(150, 150, 50, 50));
        obstaculosMapa3.add(new Rectangle(250, 250, 50, 100));



    }

    public List<Rectangle> obterObstaculos(int mapaAtual) {
        switch (mapaAtual) {
            case 1:
                return obstaculosMapa1;
            case 2:
                return obstaculosMapa2;
            case 3:
                return obstaculosMapa3;
            default:
                return new ArrayList<>();
        }
    }
}
