package itens;

import excecoes.ItemErradoException;
import personagem.PersonagemPadrao;

public class Item_Energetico extends ItemPadrao {

    public final int boostEnergetico = 2;
    
    public Item_Energetico(int x_item, int y_item, PersonagemPadrao player, Inventario inventario ) {
        super(x_item, y_item, player, inventario);
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Energetico){
          int novaVelocidade = super.player.getVelocidadePersonagem() + this.boostEnergetico;
          super.player.setVelocidadePersonagem(novaVelocidade);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }
    
}
