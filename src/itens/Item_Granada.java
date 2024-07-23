package itens;

import entidades.personagem.PersonagemPadrao;

public class Item_Granada extends ItemPadrao{
    private int quantidade;
    private PersonagemPadrao personagem;
   

    
    public Item_Granada(int quantidade, PersonagemPadrao personagem) {
      super("Granada", quantidade);
      this.personagem = personagem;
    }

  @Override
    public void aplicarEfeitoItem(PersonagemPadrao personagem){
      personagem.setDanoPersonagem(personagem.getNivelAtual() + 1);
  }
    
  //   @Override
  //  public void usarItem(ItemPadrao item) throws ItemErradoException{
  //     if (item instanceof Item_Granada) {
  //         //ataqueEspecial(this.quantidadeGranadas);
          
  //     }
  //     else{
  //       throw new ItemErradoException("Item errado");
  //     }
  //  }

    
}


