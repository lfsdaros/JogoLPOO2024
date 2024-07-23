package entidades.personagem;

import entidades.Entidade;
import entidades.npcs.Inimigos;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.ImageIcon;

public class PersonagemPadrao extends Entidade{

    private int danoPersonagem;
    private final int saudeMaxima = 300;

    private final Image ArtilhariaTile = new ImageIcon("resources\\images\\GIF_Artilharia.gif").getImage();
    private final Image CavalariaTile = new ImageIcon("resources\\images\\GIF_Cavalaria.gif").getImage();
    private final Image InfantariaTile = new ImageIcon("resources\\images\\GIF_Infantaria.gif").getImage();


    public PersonagemPadrao(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual){
      super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
    }


    public void setDanoPersonagem(int nivelAtual){    
      switch(nivelAtual){
        case 2:
          this.danoPersonagem = 50;
          break;
        case 3:
          this.danoPersonagem = 100;
          break;
        default:
          this.danoPersonagem = 50;
          break;
      }
    }

    public int getDanoPersonagem() {
      return this.danoPersonagem;
    }

    public void atacar(Inimigos inimigo){
      inimigo.setSaudeAtual(inimigo.getSaudeAtual() - this.danoPersonagem);
    }

    @Override
    public void setSaudeAtual(int saudeAtual){
      if(super.getSaudeAtual() > this.saudeMaxima){
        this.saudeAtual = this.saudeMaxima;
      } else if(super.getSaudeAtual() < 0){
        this.saudeAtual = 0;
      } else {
        this.saudeAtual = saudeAtual; 
      }
    }

    public void mover(String direcao, List<Rectangle> obstaculos) {
      int x = super.getX();
      int y = super.getY();
      int velocidade = super.getVelocidade();

      int novoX = x;
      int novoY = y;

      switch (direcao) {
          case "cima":
              novoY = y - velocidade;
              break;
          case "baixo":
              novoY = y + velocidade;
              break;
          case "esquerda":
              novoX = x - velocidade;
              break;
          case "direita":
              novoX = x + velocidade;
              break;
          default:
              break;
      }

      if (novoY >= 32 && novoY <= 436 && novoX >= 32 && novoX <= 936 && !colideComObstaculo(novoX, novoY, obstaculos)) {
          super.setX(novoX);
          super.setY(novoY);
      }
    }

    public boolean colideComObstaculo(int x, int y, List<Rectangle> obstaculos) {

      Rectangle personagemRect = new Rectangle(x, y, 32, 32); // Ajuste o tamanho conforme necessário
      
      for (Rectangle obstaculo : obstaculos) {
        
          if (personagemRect.intersects(obstaculo) == true) {
              return true;
          }
        }
      return false;
    }

    public void desenharPersonagem(Graphics g, PersonagemPadrao tipoPersonagem){
      if(tipoPersonagem instanceof Artilharia){
        g.drawImage(ArtilhariaTile, super.getX(), super.getY(), null);      
      } else if(tipoPersonagem instanceof Cavalaria){
        g.drawImage(CavalariaTile, super.getX(), super.getY(), null);
      } else if(tipoPersonagem instanceof Infantaria){
        g.drawImage(InfantariaTile, super.getX(), super.getY(), null);
      }
      
    }

}

