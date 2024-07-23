package entidades.npcs;

import entidades.Entidade;
import entidades.personagem.PersonagemPadrao;

public class Inimigos extends Entidade {

    private int danoInimigo;

    public Inimigos(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual){
        super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
    }

    @Override
    public void setSaudeAtual(int saudeAtual) {
        if(saudeAtual < 0){
            this.saudeAtual = 0;
        }else {
            this.saudeAtual = saudeAtual; 
        }
    }

    public int getDanoInimigo() {
        return danoInimigo;
    }

    public void setDanoInimigo(int nivelAtual) {
        this.danoInimigo = nivelAtual*50 ;
    }

    public void atacar(PersonagemPadrao personagem){
        if(personagem.getProtecaoAtual() > danoInimigo ){
            personagem.setProtecaoAtual(personagem.getProtecaoAtual() - danoInimigo);
        } else {
            personagem.setSaudeAtual((personagem.getSaudeAtual()+personagem.getProtecaoAtual()) - this.danoInimigo);
            personagem.setProtecaoAtual(0);
        }
    }
}

