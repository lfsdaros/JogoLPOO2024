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
        //Tela nova na Interface Gráfica

    }

    public void atacar(PersonagemPadrao player, Inimigos inimigo){

        player.setPatenteAtual(player.getNivelAtual());    //definindo o dano que P dará a partir da sua patente
        
        int saudeInimigo = inimigo.getSaudeAtual();
        int defesaInimigo = inimigo.getProtecaoAtual();

        int danoPlayer = player.getDanoPatente();

        if(defender() == false){

            inimigo.setSaudeAtual(saudeInimigo - (danoPlayer));

        } else if (defender() == true){

            System.out.println("O inimigo conseguiu defender ");

            inimigo.setSaudeAtual(saudeInimigo - (danoPlayer - defesaInimigo));
            
            inimigo.setProtecaoAtual(defesaInimigo - danoPlayer);
        }
    }

    public void ataqueEspecial(int quantidadeGranadas){
        if(quantidadeGranadas >= 10){
            int danoGranada = 70;
            int saudeInimigo = this.inimigo.getSaudeAtual();
            this.inimigo.setSaudeAtual(saudeInimigo - danoGranada); 
        }
    }

    public boolean defender(){
        return true; //integrar com KeyHandler depois
    }

}
