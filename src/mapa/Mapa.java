package mapa;

// import java.awt.Image;
// import javax.swing.ImageIcon;

public class Mapa {
    
    private final int larguraMapa;
    private final int alturaMapa;
    private final int tileSize = 16 ;
    //private int[][] mapaExpansao;
    //private Image[] tileImages;

    public Mapa(int maxScreenCol, int maxScreenRow) {
        this.larguraMapa = maxScreenCol * this.tileSize;
        this.alturaMapa = maxScreenRow * this.tileSize;
        // mapaExpansao = new int[larguraMapa / tileSize][alturaMapa / tileSize];
        // tileImages = new Image[2];
        // tileImages[0] = new ImageIcon("C:\\Users\\Saúde\\OneDrive\\Área de Trabalho\\FrontEnd Hospitais\\images1.1.png").getImage();
        // tileImages[1] = new ImageIcon("C:\\Users\\Saúde\\OneDrive\\Área de Trabalho\\FrontEnd Hospitais\\images2.1.png").getImage();
    }

    // public void inicializarMapaExpansao() {
    //     for (int i = 0; i < largura_mapa / tileSize; i++) {
    //         for (int j = 0; j < altura_mapa / tileSize; j++) {
    //             mapa_expansao[i][j] = 0;
    //         }
    //     }
    // }

    // public void expandMap() {
    //     int novaLargura = largura_mapa * 2;
    //     int novaAltura = altura_mapa * 2;
    //     int[][] novoMapa = new int[novaLargura / tileSize][novaAltura / tileSize];

    //     for (int i = 0; i < largura_mapa / tileSize; i++) {
    //         for (int j = 0; j < altura_mapa / tileSize; j++) {
    //             novoMapa[i][j] = mapa_expansao[i][j];
    //         }
    //     }

    //     mapa_expansao = novoMapa;
    //     largura_mapa = novaLargura;
    //     altura_mapa = novaAltura;

    //     for (int i = largura_mapa / 2 / tileSize; i < largura_mapa / tileSize; i++) {
    //         for (int j = altura_mapa / 2 / tileSize; j < altura_mapa / tileSize; j++) {
    //             mapa_expansao[i][j] = 1; // Novo tipo de terreno
    //         }
    //     }
    // }

    public int getAlturaMapa() {
        return alturaMapa;
    }

    public int getLarguraMapa() {
        return larguraMapa;
    }

}
