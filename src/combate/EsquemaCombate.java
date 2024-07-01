package combate;

import npcs.Inimigos;
import personagem.PersonagemPadrao;

public class EsquemaCombate {
    PersonagemPadrao personagem;
    Inimigos inimigo;

    public EsquemaCombate(PersonagemPadrao personagem, Inimigos inimigo){
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    public void entrarNoCombate(){

        int x_personagem = personagem.getX_personagem();
        int y_personagem = personagem.getY_personagem();
        int x_inimigo = inimigo.getX_inimigo();
        int y_inimigo = inimigo.getY_inimigo();

        if(x_personagem == x_inimigo && y_personagem == y_inimigo){
            startCombate();
        }

    }


    public void startCombate(){
        //personagem.

    }

    public void atacar(PersonagemPadrao player, Inimigos inimigo){
        player.setPatenteAtual(player.getNivelAtual());    //definindo o dano que P dará a partir da sua patente
        
        int saudeInimigo = inimigo.getSaudeAtual();
        int defesaInimigo = inimigo.getProtecaoAtual();

        if(defender() == 0){
            inimigo.setSaudeAtual(saudeInimigo - (player.getDanoPatente()));
        } else if (defender() == 1){
            System.out.println("O inimigo conseguiu defender ");

            inimigo.setSaudeAtual(saudeInimigo - (player.getDanoPatente() - inimigo.getProtecaoAtual()));
            
            inimigo.setProtecaoAtual(defesaInimigo - player.getDanoPatente());
        }
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
