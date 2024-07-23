package itens;


import entidades.personagem.PersonagemPadrao;

public class Item_Colete extends ItemPadrao {
    private final int protecaoColete = 75 ;
    private int quantidade;
    private PersonagemPadrao personagem;

    public Item_Colete(int quantidade, PersonagemPadrao personagem) {
        super("Colete", quantidade);
        this.personagem = personagem;
    }

    @Override
    public void aplicarEfeitoItem(PersonagemPadrao personagem){
        int novaProtecao = this.personagem.getProtecaoAtual() + this.protecaoColete;
        this.personagem.setProtecaoAtual(novaProtecao);
    }

    // @Override
    // public void usarItem(ItemPadrao item) throws ItemErradoException{
    //     if(item instanceof Item_Colete){
    //         int novaProtecao = this.personagem.getProtecaoAtual() + this.protecaoColete;
    //         this.personagem.setProtecaoAtual(novaProtecao);
    //     } else{
    //         throw new ItemErradoException("Item errado");
    //     }
    // }

}
