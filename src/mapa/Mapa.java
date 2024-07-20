package mapa;

import java.awt.Color;
import java.awt.Graphics;

public class Mapa {
    private static final int larguraMapa = 1000;
    private static final int alturaMapa = 500;

    public static final int MAPA_1 = 1;
    public static final int MAPA_2 = 2;
    public static final int MAPA_3 = 3;

    public int getLargura() {
        return larguraMapa;
    }

    public int getAltura() {
        return alturaMapa;
    }

    public void desenharMapa(Graphics g, int mapaAtual) {
        Color corBorda = Color.BLACK;
        // Desenha fundo e bordas de acordo com o mapa atual
        switch (mapaAtual) {
            case MAPA_1:
                g.setColor(new Color(0, 100, 0));
                g.fillRect(0, 0, larguraMapa, alturaMapa);
                corBorda = new Color(92, 64, 5);
                break;

            case MAPA_2:
                g.setColor(new Color(194, 178, 128)); // Marrom
                g.fillRect(25, 25, larguraMapa/2 -25, alturaMapa - 25);
                //g.setColor(Color.BLUE);
                g.fillRect(500, 50, 975, alturaMapa - 25);
                break;
            case MAPA_3:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, larguraMapa, alturaMapa);
                corBorda = Color.GRAY;
                break;
        }

        g.setColor(corBorda);
        g.fillRect(0, 0, larguraMapa, 25);
        g.fillRect(0, 0, 25, alturaMapa);
        g.fillRect(0, alturaMapa-25, larguraMapa, 25);
        g.fillRect(larguraMapa-25 , 0, 25, alturaMapa);
   
    }

}
