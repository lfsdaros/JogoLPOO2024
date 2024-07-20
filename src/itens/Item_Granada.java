package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Granada extends ItemPadrao{
    private int quantidade;
   

    
    public Item_Granada(int x_item, int y_item, PersonagemPadrao player, Inventario inventario, int quantidadeGranadas) {
      super(x_item, y_item, player, inventario, "Granadas");
      //his.quantidade = 0;
    }
    
    @Override
   public void usarItem(ItemPadrao item) throws ItemErradoException{
      if (item instanceof Item_Granada) {
          //ataqueEspecial(this.quantidadeGranadas);
          
      }
      else{
        throw new ItemErradoException("Item errado");
      }
   }

   @Override
   public int getQuantidadeItens() {
       return quantidade;
   }

    
}


