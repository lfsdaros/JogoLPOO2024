package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Energetico extends ItemPadrao {

    public final int boostEnergetico = 2;
    private int quantidade;
    
    public Item_Energetico(PersonagemPadrao personagem, Inventario inventario ) {
        super(personagem, inventario);
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
