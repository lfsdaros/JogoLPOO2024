package itens;

import entidades.personagem.PersonagemPadrao;
import excecoes.ItemErradoException;

public abstract class ItemPadrao {
    
    //private int x_item, y_item; 
    protected PersonagemPadrao personagem;
    protected  Inventario inventario;
    //private String nomeItem;

    public ItemPadrao(PersonagemPadrao personagem, Inventario inventario){
        // this.x_item = x_item;
        // this.y_item = y_item;
        this.personagem = personagem;
      //  this.nomeItem = nomeItem;
        this.inventario = inventario;
    }

    // public boolean achouItem(){
    //     boolean retorno = (this.x_item == this.personagem.getX() && this.y_item == this.personagem.getY());
    //     System.out.println("Parabens! voce achou um item! ");
    //     return retorno;
    // }
                
    public abstract void usarItem(ItemPadrao item) throws ItemErradoException;
   
    public abstract int getQuantidadeItens();
                 
    // public int getX_item() {
    //                 return x_item;
    // }

    // public void setX_item(int x_item) {
    //     this.x_item = x_item;
    // }

    // public int getY_item() {
    //     return y_item;
    // }

    // public void setY_item(int y_item) {
    //     this.y_item = y_item;
    // }

    // public String getNomeItem() {
    //     return nomeItem;
    // }


}
