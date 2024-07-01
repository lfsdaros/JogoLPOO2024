package entidades.npcs;

import entidades.Entidade;
import itens.ItemPadrao;

public class Aliados extends Entidade {
    
    private ItemPadrao itemAliado;


    public Aliados(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual, ItemPadrao itemAliado){
        super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
        this.itemAliado = itemAliado;
    }

    
    @Override
    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
    }

    public ItemPadrao getItemAliado() {
        return itemAliado;
    }

    public void setItemAliado(ItemPadrao itemAliado) {
        this.itemAliado = itemAliado;
    }


}
