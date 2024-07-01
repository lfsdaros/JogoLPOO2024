package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Energetico extends ItemPadrao {

    public final int boostEnergetico = 2;
    
    public Item_Energetico(int x_item, int y_item, PersonagemPadrao player, Inventario inventario ) {
        super(x_item, y_item, player, inventario);
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Energetico){
          int novaVelocidade = super.player.getVelocidade() + this.boostEnergetico;
          super.player.setVelocidade(novaVelocidade);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }
    
}
