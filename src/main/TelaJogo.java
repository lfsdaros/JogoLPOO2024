package main;



import entidades.personagem.PersonagemPadrao;
import java.awt.*;
import javax.swing.*;

public class TelaJogo extends JPanel implements Runnable {
    private final PersonagemPadrao player;
    private final int DELAY = 16; // Aproximadamente 60 FPS
    private boolean running = true;

    public TelaJogo() {
        setFocusable(true);
        requestFocusInWindow();

        // Initialize character
        player = new PersonagemPadrao(100, 100, 5,100,100,1);

        // Initialize and add controls
        final Controles controles = new Controles(this, player);
        addKeyListener(controles);

        // Start game loop
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the character
        g.setColor(Color.GRAY);
        g.fillRect(player.getX(), player.getY(), 50, 50);
    }

    public void update() {
        if (player.isMovingUp()) {
            player.moveUp();
        }
        if (player.isMovingLeft()) {
            player.moveLeft();
        }
        if (player.isMovingDown()) {
            player.moveDown();
        }
        if (player.isMovingRight()) {
            player.moveRight();
        }
        repaint();
    }

    @Override
    public void run() {
        while (running) {
            update();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        running = false;
    }


}










