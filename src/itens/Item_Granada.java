package itens;

public class Item_Granada extends ItemPadrao{
    private int quantidadeGranadas;

    
    public Item_Granada(int x_item, int y_item, int quantidadeGranadas) {
      super(x_item, y_item);
      this.quantidadeGranadas = 0;
    }
    
    @Override
    public void usarItem(){
      
      if(super.pegarItem(super.getX_item(), super.getY_item()) == 1)
      {
        System.out.println("VOCE ACHOU UMA GRANADA!");
        //usar item ou guardar no inventario
        System.out.println("VOCÊ QUER USAR(e) ou GUARDAR(i) NO INVENTÁRIO? ");
        //if (e apertado) -> usar granada ( especial ? )
        //else if (i apertado) -> guardar no inventario e this.quantidadeGranadas += 1
        //if this.quantidadeGranadas >= 10 --> ESPECIAL
      }
    }

    


      public int getQuantidadeGranadas(){
        return quantidadeGranadas;
      }

      public void setQuantidadeGranadas(int quantidadeGranadas) {
        this.quantidadeGranadas = quantidadeGranadas;
      }
      
}


