package entidades.personagem;

public class Infantaria extends PersonagemPadrao{

    private int danoInfantaria = 75; 

    public Infantaria(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual){
        super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
      }

    public int getDanoInfantaria(){
        return this.danoInfantaria;
    }

    public void setDanoInfantaria(int nivelAtual){
        super.setDanoPersonagem(nivelAtual);
        this.danoInfantaria += super.getDanoPersonagem();
    }
    
}
