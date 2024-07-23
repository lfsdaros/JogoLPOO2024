package itens;

import entidades.personagem.PersonagemPadrao;



public abstract class ItemPadrao {
    private String nome;
    private int quantidade;

    public ItemPadrao(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract void aplicarEfeitoItem(PersonagemPadrao personagem); //throws ItemErradoException;

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

// import entidades.personagem.PersonagemPadrao;
// import excecoes.ItemErradoException;

// public abstract class ItemPadrao {
    
//     //private int x_item, y_item; 
//     private  PersonagemPadrao personagem;
//    // protected  Inventario inventario;
//     private String nomeItem;

  
//     public ItemPadrao(PersonagemPadrao personagem, Inventario inventario, String nomeItem){
//         this.personagem = personagem;
//         this.nomeItem = nomeItem;
//         this.inventario = inventario;
//     }
                
//     public abstract void usarItem(ItemPadrao item) throws ItemErradoException;
   
//     public abstract int getQuantidadeItens();
                 
//     public String getNomeItem() {
//         return nomeItem;
//     }


