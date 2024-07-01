package itens;

import excecoes.ItemErradoException;
import personagem.PersonagemPadrao;

public abstract class ItemPadrao {
    
    private int x_item, y_item; 
    protected PersonagemPadrao player;
    protected  Inventario inventario;


    public ItemPadrao(int x_item, int y_item, PersonagemPadrao player, Inventario inventario){
        this.x_item = x_item;
        this.y_item = y_item;
        this.player = player;
        this.inventario = inventario;
    }

    public boolean  achouItem(int x_item, int y_item){
        boolean retorno = (x_item == this.player.getX_personagem() && y_item == this.player.getY_personagem());
        System.out.println("Parabens! voce achou um(a) ");
        return retorno;
    }
    
    public void pegarItem(int x_item, int y_item, ItemPadrao item){
       if(achouItem(x_item, y_item) == true){
            if (){  //tecla a definir
                this.inventario.adicionarItem(item);   
            }
            else if () { // tecla a definir
                usarItem(item);
            }
       }
            
    }
                
    public abstract void usarItem(ItemPadrao item) throws ItemErradoException;
   
                 
    public int getX_item() {
                    return x_item;
    }

    public void setX_item(int x_item) {
        this.x_item = x_item;
    }

    public int getY_item() {
        return y_item;
    }

    public void setY_item(int y_item) {
        this.y_item = y_item;
    }

}
