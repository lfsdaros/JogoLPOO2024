package combate;

import entidades.npcs.Inimigos;
import entidades.personagem.PersonagemPadrao;

public class EsquemaCombate {
    PersonagemPadrao personagem;
    Inimigos inimigo;

    public EsquemaCombate(PersonagemPadrao personagem, Inimigos inimigo){
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    public void entrarNoCombate(){

        int x_personagem = personagem.getX();
        int y_personagem = personagem.getY();
        int x_inimigo = inimigo.getX();
        int y_inimigo = inimigo.getY();

        if(x_personagem == x_inimigo && y_personagem == y_inimigo){
            startCombate();
        }

    }


    public void startCombate(){
        //personagem.

    }

    public void personagem(PersonagemPadrao personagem, Inimigos inimigo){
        personagem.setPatenteAtual(personagem.getNivelAtual());    //definindo o dano que P dará a partir da sua patente
        int danoPersonagem = personagem.getDanoPatente();
        int saudeInimigo = inimigo.getSaudeAtual();
        //int defesaInimigo = inimigo.getProtecaoAtual();

       // if(defender() == 0){
            inimigo.setSaudeAtual(saudeInimigo - danoPersonagem);
        // } else if (defender() == 1){
        //     System.out.println("O inimigo conseguiu defender ");

        //     inimigo.setSaudeAtual(saudeInimigo - (personagem.getDanoPatente() - inimigo.getProtecaoAtual()));
            
        //     inimigo.setProtecaoAtual(defesaInimigo - personagem.getDanoPatente());
        // }
    }

    public void ataqueEspecial(int quantidadeGranadas){
        if(quantidadeGranadas >= 10){
            int danoGranada = 70;
            int saudeInimigo = this.inimigo.getSaudeAtual();
            this.inimigo.setSaudeAtual(saudeInimigo - danoGranada); 
        }
    }

    public int defender(){
        return 10;
    }

}
