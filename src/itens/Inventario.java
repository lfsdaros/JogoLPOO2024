// package itens;

// import excecoes.IndiceInvalidoException;
// import excecoes.ItemNaoEncontradoException;
// import java.util.ArrayList;
// import java.util.List;  



// public class Inventario {

//     private List<ItemPadrao> listaDeItens;
//     private final int capacidade = 16;
//     private ItemPadrao itemPadrao;

//     public Inventario() {
//         this.listaDeItens = new ArrayList<>();
//     }

//     public void adicionarItem(ItemPadrao item) {   
//         if (listaDeItens.size() < capacidade ) {
//             listaDeItens.add(item);
//         }
//     }

//     public void removerItem(ItemPadrao item) throws ItemNaoEncontradoException {
//         if(!listaDeItens.remove(item)){
//             throw new ItemNaoEncontradoException(item+" nao esta no inventario"); 
//         }
//     }


//     public ItemPadrao obterItem(int indice) throws IndiceInvalidoException {

//         if (indice >= 0 && indice < listaDeItens.size()) {
//             return listaDeItens.get(indice);
//         } else {
//             throw new IndiceInvalidoException("Indice "+indice+" nao existe no inventario");
//         }
//     }



//     public List<ItemPadrao> getInventario() {
//         return new ArrayList<>(listaDeItens); 
//     }


//     public void setListaDeItens(List<ItemPadrao> itens) {
//         if (itens.size() <= capacidade) {
//             this.listaDeItens = new ArrayList<>(itens);
//         } else {
//             this.listaDeItens = new ArrayList<>(itens.subList(0, capacidade));
//         }
//     }

//     public boolean procurarItem(String nomeItem) {
//         for (ItemPadrao item : listaDeItens) {
//             if (item.getNomeItem().equals(nomeItem)) {
                
//                 return true;
//             }
//         }
//         return false;
//     }
   
//     public int obterQuantidadeItemX(String nomeItem) {
//         for (ItemPadrao item : listaDeItens) {
//             if (item.getNomeItem().equals(nomeItem)) {
//                 return item.getQuantidadeItens();
//             }
//         }
//         return 0;
//     }

//     public List<ItemPadrao> getListaDeItens() {
//         return listaDeItens;
//     }
    
// }


package itens;


import entidades.personagem.PersonagemPadrao;
import java.util.HashMap;
import java.util.Map;


public class Inventario {

    private Map<String, ItemPadrao> inventario;
    private final int capacidade;

    public Inventario(int capacidade) {
        this.capacidade = capacidade;
        this.inventario = new HashMap<>();
    }

    // Função para adicionar item
    public void adicionarItem(ItemPadrao item) {
        if (inventario.size() < capacidade) {
            String nomeItem = item.getNome();
            if (inventario.containsKey(nomeItem)) {
                ItemPadrao itemExistente = inventario.get(nomeItem);
                itemExistente.setQuantidade(itemExistente.getQuantidade() + item.getQuantidade());
            } else {
                inventario.put(nomeItem, item);
            }
        } else {
            System.out.println("Inventário está cheio!");
        }
    }

    // Função para remover item
    public void removerItem(ItemPadrao item) {
        String nomeItem = item.getNome();
        if (inventario.containsKey(nomeItem)) {
            ItemPadrao itemExistente = inventario.get(nomeItem);
            int novaQuantidade = itemExistente.getQuantidade() - item.getQuantidade();
            if (novaQuantidade > 0) {
                itemExistente.setQuantidade(novaQuantidade);
            } else {
                inventario.remove(nomeItem);
            }
        } else {
            System.out.println(nomeItem + " não está no inventário!");
        }
    }

    // Função para mostrar a quantidade de itens presentes no inventário
    public int verQuantidadeItens(String nomeItem) {
        ItemPadrao item = inventario.get(nomeItem);
        return (item != null) ? item.getQuantidade() : 0;
        
    }

    public boolean estaVazio(){
        return  inventario.isEmpty();
    }


    // Função para usar um item
    public void usarItem(String nomeItem, PersonagemPadrao personagem) {
        ItemPadrao item = inventario.get(nomeItem);
        if (item != null) {
            // Aplicar o efeito do item ao personagem
            item.aplicarEfeitoItem(personagem);
            // Remover o item do inventário
            removerItem(item);
        } else {
            System.out.println("Item não encontrado no inventário!");
        }
    }
    
}
