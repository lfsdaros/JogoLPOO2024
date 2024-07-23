package entidades.personagem;

public class Cavalaria extends PersonagemPadrao {
    private int danoCavalaria = 30;  
   
    public Cavalaria(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual){
        super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
      }

    public int getDanoCavalaria(){
        return this.danoCavalaria;
    }

    public void setDanoCavalaria(int nivelAtual){
        super.setDanoPersonagem(nivelAtual);
        this.danoCavalaria += super.getDanoPersonagem(); 
    }
}