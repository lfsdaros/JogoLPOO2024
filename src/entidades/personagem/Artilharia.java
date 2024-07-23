package entidades.personagem;

public class Artilharia extends PersonagemPadrao {
    private int danoArtilharia = 50;

    public Artilharia(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual){
        super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
    }

    public int getDanoArtilharia(){
        return this.danoArtilharia;
    }

    public void setDanoArtilharia(int nivelAtual){
        super.setDanoPersonagem(nivelAtual);
        this.danoArtilharia += super.getDanoPersonagem(); 

    }

}
