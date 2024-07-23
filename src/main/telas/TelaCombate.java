package main.telas;

import entidades.npcs.Inimigos;
import entidades.personagem.PersonagemPadrao;
import itens.Inventario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaCombate extends JFrame {

    private final int larguraTelaCombate = 500;
    private final int alturaTelaCombate = 400;

    private final PersonagemPadrao personagem;
    private final Inimigos inimigo;
    private Inventario inventario;
    private final TelaJogo telaJogo;

    private int nivelAtual;
    private int personagemGridX = 0, personagemGridY = 0;
    private int inimigoGridX = 9, inimigoGridY = 9;
    private boolean turnoPersonagem = true;

    public TelaCombate(PersonagemPadrao personagem, int nivelAtual, TelaJogo telaJogo, Inventario inventario) {
        
        
        this.personagem = personagem;
        this.inventario = inventario;
        
        this.inimigo = new Inimigos(100, 100, 5, 150, 0, 1);
        inimigo.setDanoInimigo(nivelAtual); 
        
        this.nivelAtual = nivelAtual;
        this.telaJogo = telaJogo;
        

        setTitle("Tela de Combate");
        setUndecorated(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); 

        CombatePanel painel = new CombatePanel();
        painel.setLayout(null); 
        add(painel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        addKeyListener((KeyListener) new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (turnoPersonagem) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_M:
                            usarItem("Morfina");
                            break;
                        case KeyEvent.VK_C:
                            usarItem("Colete");
                            break;
                        case KeyEvent.VK_G:
                            usarItem("Granada");
                            break;
                        default:
                            break;
                    }
                }
            }
        });
    }
        
    private void usarItem(String nomeItem) {
        inventario.usarItem(nomeItem, personagem);
        repaint();
    }

    private void moverPersonagemCombate(int x, int y) {
        if (turnoPersonagem) {
            personagemGridX = x;
            personagemGridY = y;
            checarCombate();
            turnoPersonagem = false;
            moveInimigoCombate();
        }
        repaint();
    }

    private void moveInimigoCombate() {
        if (!turnoPersonagem) {
           
            if (inimigoGridY > personagemGridY) { 
                inimigoGridY--;
            }
            else if (inimigoGridY < personagemGridY) {
                inimigoGridY++;
            }
            else if (inimigoGridX > personagemGridX) {
                inimigoGridX--;
            }
            else if (inimigoGridX < personagemGridX) {
                inimigoGridX++;
            }
            
            checarCombate();
            turnoPersonagem = true;
            repaint();
        }
    }

    public void checarCombate(){
        if(personagemGridX == inimigoGridX && personagemGridY == inimigoGridY){
            iniciarAtaque();
           }   
    }

    private void iniciarAtaque() {
        System.out.println("Combate iniciado!");
        personagem.setDanoPersonagem(nivelAtual);
    
        if (turnoPersonagem) {
            
            personagem.atacar(inimigo);
            System.out.println("Inimigo saúde: " + inimigo.getSaudeAtual());
    
            if (inimigo.getSaudeAtual() <= 0) {
                System.out.println("Inimigo derrotado!");
                encerrarCombate(true);
            }
    
            turnoPersonagem = false;

        } else {
            inimigo.atacar(personagem);
            System.out.println("Personagem saúde: " + personagem.getSaudeAtual());
    
            if (personagem.getSaudeAtual() <= 0) {
                encerrarCombate(false);
            }
    
            turnoPersonagem = true;
        }
    

        repaint();
    }
    

    public void encerrarCombate(boolean personagemVenceu) {
    
        dispose();

        if (personagemVenceu) {
            nivelAtual += 1;

            if (nivelAtual > 3) {
                new TelaGameWin().setVisible(true);
                dispose();
            }

        //PRÓXIMO NÍVEL
            personagem.setX(50);
            personagem.setY(50);
            telaJogo.setMapaAtual(nivelAtual);
        }   
        //GAME OVER
         else { 
            new TelaGameOver().setVisible(true);
            dispose();
        }
    }

    private class CombatePanel extends JPanel {

        public CombatePanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (turnoPersonagem) {
                        int larguraQuadradoGrid = larguraTelaCombate / 10;
                        int alturaQuadradoGrid = alturaTelaCombate / 10;
                        int x = e.getX() / larguraQuadradoGrid;
                        int y = e.getY() / alturaQuadradoGrid;
                        if (x >= 0 && x < 10 && y >= 0 && y < 10) {
                            moverPersonagemCombate(x, y);
                        }
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Define a cor do retângulo principal com base no nivelAtual
            switch (nivelAtual) {
                case 1:
                    g.setColor((new Color(0, 100, 0))); 
                    break;
                case 2:
                    g.setColor(new Color(194, 178, 128));  
                    break;
                case 3:
                    g.setColor(Color.WHITE); // Mapa 3
                    break;
                default:
                break;
            }

        //RETANGULO PRINCIPAL (500x400)
            g.fillRect(0, 0, larguraTelaCombate, alturaTelaCombate);

        //BOX PARA LEGENDAS (500x100)   
            g.setColor(Color.BLACK);
            g.fillRect(0, alturaTelaCombate, larguraTelaCombate, 100);
            
        //LEGENDAS
            g.setColor(Color.WHITE);
            g.drawString("(M)ORFINA: " + inventario.verQuantidadeItens("Morfina"), 300, 425);
            g.drawString("(C)OLETE: " + inventario.verQuantidadeItens("Colete"), 300, 450);
            g.drawString("(G)RANADA: " + inventario.verQuantidadeItens("Granada"), 300, 475);

            
            g.drawString(("SAÚDE PERSONAGEM: " + personagem.getSaudeAtual()), 10, 425);
            g.drawString(("SAÚDE INIMIGO: " + inimigo.getSaudeAtual()), 10, 450);

        //GRID DE COMBATE
            g.setColor(Color.BLACK);
            int qtdColunasGrid = 10; 
            int qtdLinhasGrid = 10; 
            int larguraQuadradoGrid = larguraTelaCombate / qtdColunasGrid;
            int alturaQuadradoGrid = alturaTelaCombate / qtdLinhasGrid;
         
        //LINHAS HORIZONTAIS - GRID
            for (int i = 0; i <= qtdLinhasGrid; i++) {
                g.drawLine(0, i * alturaQuadradoGrid, 500, i * alturaQuadradoGrid);
            }
        //LINHAS VERTICAIS - GRID
            for (int i = 0; i <= qtdColunasGrid; i++) {
                g.drawLine(i * larguraQuadradoGrid, 0, i * larguraQuadradoGrid, 400);
            }

        //PERSONAGEM
            g.setColor(Color.BLACK);
            g.drawString("$", personagemGridX * larguraQuadradoGrid + larguraQuadradoGrid / 2, personagemGridY * alturaQuadradoGrid + alturaQuadradoGrid / 2);

        //INIMIGO
            g.setColor(Color.MAGENTA);
            g.drawString("X", inimigoGridX * larguraQuadradoGrid + larguraQuadradoGrid / 2, inimigoGridY * alturaQuadradoGrid + alturaQuadradoGrid / 2);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }
        
    }
    
}

