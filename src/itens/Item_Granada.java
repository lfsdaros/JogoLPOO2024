package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Granada extends ItemPadrao{
    private int quantidadeGranadas;

    
    public Item_Granada(int x_item, int y_item, PersonagemPadrao player, Inventario inventario, int quantidadeGranadas) {
      super(x_item, y_item, player, inventario);
      this.quantidadeGranadas = 0;
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

    public int getQuantidadeGranadas(){
      return quantidadeGranadas;
    }

    public void setQuantidadeGranadas(int quantidadeGranadas) {
      this.quantidadeGranadas = quantidadeGranadas;
    }
    
}


