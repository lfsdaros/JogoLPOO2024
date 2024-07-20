// package main;

// public class TelaCombate{

// }
// package main;

// import java.awt.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;
// import javax.swing.*;

// public class TelaCombate extends JPanel {
//     private ConfigsTela mainFrame;

//     public TelaCombate(ConfigsTela mainFrame) {
//         this.mainFrame = mainFrame;
//         setFocusable(true);
//         requestFocusInWindow();

//         setBackground(Color.BLACK);

//         // Add key listener for user interaction
//         addKeyListener(new KeyAdapter() {
//             @Override
//             public void keyPressed(KeyEvent e) {
//                 int key = e.getKeyCode();
//                 if (key == KeyEvent.VK_K) {
//                     mainFrame.switchToGameScreen();
//                 }
//             }
//         });
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.setColor(Color.WHITE);
//         g.drawString("Combate", getWidth() / 2, getHeight() / 2);
//     }
// }

package main;

import entidades.npcs.Inimigos;
import entidades.personagem.PersonagemPadrao;
import itens.Inventario;
import itens.ItemPadrao;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.*;

public class TelaCombate extends JPanel implements ActionListener {
    private PersonagemPadrao personagem;
    private Inimigos inimigo;
    private Inventario inventario;
    private String[] itens = {"Morfina", "Colete", "Granada"};
    

    private boolean turnoPersonagem = true;

    public TelaCombate(PersonagemPadrao personagem, Inimigos inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
        this.inventario = new Inventario();


        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new CombateKeyAdapter());
        Timer timer = new Timer(1000 / 60, this); // Atualiza 60 vezes por segundo
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenharCombate(g);
    }

    private void desenharCombate(Graphics g) {
        // Desenha o personagem
        g.setColor(Color.RED);
        g.fillRect(personagem.getX(), personagem.getY(), 25, 25);

        // Desenha o inimigo (por exemplo, à direita do personagem)
        g.setColor(Color.BLUE);
        g.fillRect(inimigo.getX(), inimigo.getY(), 10, 10);

        // Desenha o quadrado menor 300x300
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 300, 300);

        // Desenha a tabela de "ITENS" na borda esquerda
        g.setColor(Color.WHITE);
        g.drawRect(10, 10, 80, 300); // Tabela
        g.drawString("ITENS", 35, 25);

        List<ItemPadrao> itens = inventario.getListaDeItens();

        int y = 50;
        for (ItemPadrao item : itens) {
            g.drawString(item.getNomeItem() + ": " + item.getQuantidadeItens(), 20, y); // Nome do item e quantidade
            y += 20;
        }

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private class CombateKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (turnoPersonagem) {
                switch (key) {
                    case KeyEvent.VK_I: // Usar item
                        //inventario.obterItem(0);
                        break;
                    case KeyEvent.VK_A: // Atacar
                        // Lógica para atacar
                        break;
                    case KeyEvent.VK_D: // Defender
                        // Lógica para defender
                        break;
                    case KeyEvent.VK_TAB: // Mudar turno
                        turnoPersonagem = false;
                        break;
                }
            } else {
                // Turno do inimigo (pode ser controlado por IA ou outra lógica)
                turnoPersonagem = true; // Após a ação do inimigo, volta para o turno do personagem
            }
        }
    }
}

