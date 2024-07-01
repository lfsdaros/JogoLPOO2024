package itens;


import excecoes.ItemErradoException;
import personagem.PersonagemPadrao;

public class Item_Colete extends ItemPadrao {
    private final int protecaoColete = 10 ;

    public Item_Colete(int x_item, int y_item, PersonagemPadrao player, Inventario inventario) {
        super(x_item, y_item, player, inventario);
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Colete){
            int novaProtecao = super.player.getProtecaoAtual() + this.protecaoColete;
            super.player.setProtecaoAtual(novaProtecao);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }


}
