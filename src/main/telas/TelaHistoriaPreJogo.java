package main.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaHistoriaPreJogo extends JFrame {

        public TelaHistoriaPreJogo() {

            setUndecorated(true);
            setSize(1000, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel historiaPanel = new JPanel();
            historiaPanel.setBackground(new Color(121, 0, 0)); 
            JLabel historiaText = new JLabel("<html><h1>I</h1><p>The War</p><p>Quando líderes se revoltam, guerras acontecem.</p><p>Ao comando de seus generais, soldados são enviados aos</p><p>mais remotos e adversos cenários que um humano pode vivenciar.</p><p>Por sua bravura e coragem, você foi escolhido para defender os ideais de seu povo, </p><p>então seja um verdadeiro guerreiro no front. Boa sorte, combatente, não fracasse...</p>Ao apertar a tecla G, você iniciará sua jornada em busca da glória, está pronto?</html>");
            historiaText.setFont(new Font("Serif", Font.BOLD, 18));
            historiaText.setForeground(new Color(255,255,255));



            historiaPanel.add(historiaText);
            
            
            
            add(historiaPanel);



            addKeyListener((KeyListener) new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_G) {
                        new TelaEscolha().setVisible(true); 
                        dispose(); 
                    }
                }
            });
    
            setFocusable(true);
            requestFocusInWindow();
        }


        }
