package itens;

public class Item_Energetico extends ItemPadrao {
    public int boostEnergetico;
    
    public Item_Energetico(int x_item, int y_item) {
        super(x_item, y_item);
        this.boostEnergetico = 2;
    }

    
    @Override
    public void usarItem(){
      if(super.pegarItem(super.getX_item(), super.getY_item()) == 1)
      {
        System.out.println("VOCE ACHOU UM ENERGÉTICO!");
        //usar item ou guardar no inventario
        System.out.println("VOCÊ QUER USAR(e) ou GUARDAR(i) NO INVENTÁRIO? ");
        //if (e apertado) -> aumentar velocidade em 2  e boost ++ 
        //else if (i apertado) -> guardar no inventario
      }
    }

    public int getBoostEnergetico() {
      return boostEnergetico;
    }


    public void setBoostEnergetico(int boostEnergetico) {
      this.boostEnergetico = boostEnergetico;
    }

    
}
