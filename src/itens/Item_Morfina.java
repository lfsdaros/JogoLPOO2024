package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Morfina extends ItemPadrao {

    public final int saudeMorfina = 10;
    
    public Item_Morfina(int x_item, int y_item, PersonagemPadrao player, Inventario inventario ) {
        super(x_item, y_item, player, inventario);
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Morfina){
          int novaSaude = super.player.getSaudeAtual() + this.saudeMorfina;
          super.player.setSaudeAtual(novaSaude);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }
    
}
