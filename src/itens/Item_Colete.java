package itens;

public class Item_Colete extends ItemPadrao {
    private final int protecaoColete = 10 ;

    


    public Item_Colete(int x_item, int y_item) {
        super(x_item, y_item);
    }

    
    @Override
    public void usarItem(){
      if(super.pegarItem(super.getX_item(), super.getY_item()) == 1)
      {
        System.out.println("VOCE ACHOU UM COLETE!");
        //usar item ou guardar no inventario
        System.out.println("VOCÊ QUER USAR(e) ou GUARDAR(i) NO INVENTÁRIO? ");
        //if (e apertado) -> super.player.setProtecao(super.player.getProtecao() + 10) 
        //else if (i apertado) -> guardar no inventario e this.quantidadeGranadas += 1
            //if this.quantidadeGranadas >= 10 --> ESPECIAL
        }
    }


    public int getProtecaoColete() {
        return protecaoColete;
    }

}
