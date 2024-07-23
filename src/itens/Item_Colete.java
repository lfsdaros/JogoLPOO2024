package itens;


import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public class Item_Colete extends ItemPadrao {
    private final int protecaoColete = 10 ;
    private int quantidade;

    public Item_Colete(PersonagemPadrao personagem, Inventario inventario) {
        super(personagem, inventario);
    }

    @Override
    public void usarItem(ItemPadrao item) throws ItemErradoException{
        if(item instanceof Item_Colete){
            int novaProtecao = super.personagem.getProtecaoAtual() + this.protecaoColete;
            super.personagem.setProtecaoAtual(novaProtecao);
        } else{
            throw new ItemErradoException("Item errado");
        }
    }


    @Override
    public int getQuantidadeItens() {
        return quantidade;
    }

}
