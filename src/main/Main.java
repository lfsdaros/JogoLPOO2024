package main;

import java.awt.EventQueue;
import main.telas.TelaInicial;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            TelaInicial configsTela = new TelaInicial();
            configsTela.setVisible(true);
        });
    }
}

