package itens;

import personagem.PersonagemPadrao;

public abstract class ItemPadrao {
    private int x_item, y_item;  

    PersonagemPadrao player = new PersonagemPadrao(0);

    public ItemPadrao(int x_item, int y_item){
        this.x_item = x_item;
        this.y_item = y_item;
    }
    
    public int pegarItem(int x_item, int y_item){
        if(x_item == player.getX_personagem() && y_item == player.getY_personagem()) 
        {
            System.out.println("Parabens! voce achou um(a) ");
            return 1;
        } else {
            return 0;
        }
    }
                
    public abstract void usarItem();
                
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
