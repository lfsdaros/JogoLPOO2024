package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Energetico extends ItemPadrao {

    public final int boostEnergetico = 2;
    private int quantidade;
    
    public Item_Energetico(int x_item, int y_item, PersonagemPadrao player, Inventario inventario ) {
        super(x_item, y_item, player, inventario, "Energetico");
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Energetico){
          int novaVelocidade = super.personagem.getVelocidade() + this.boostEnergetico;
          super.personagem.setVelocidade(novaVelocidade);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }
    

    @Override
    public int getQuantidadeItens() {
        return quantidade;
    }
}
