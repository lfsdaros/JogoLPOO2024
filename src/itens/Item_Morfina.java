package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Morfina extends ItemPadrao {
    
    public final int saudeMorfina = 10;
    private int quantidade;

    
    public Item_Morfina(int x_item, int y_item, PersonagemPadrao player, Inventario inventario) {
        super(x_item, y_item, player, inventario, "Morfina");
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Morfina){
          int novaSaude = super.personagem.getSaudeAtual() + this.saudeMorfina;
          super.personagem.setSaudeAtual(novaSaude);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }
    

    @Override
    public int getQuantidadeItens() {
        return quantidade;
    }
}
