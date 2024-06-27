package itens;

import excecoes.IndiceInvalidoException;
import excecoes.ItemNaoEncontradoException;
import java.util.ArrayList;
import java.util.List;  



public class Inventario {

    private List<ItemPadrao> listaDeItens;
    private final int capacidade = 16;

    public Inventario() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(ItemPadrao item) {   
        if (listaDeItens.size() < capacidade) {
            listaDeItens.add(item);
        }
    }

    public void removerItem(ItemPadrao item) throws ItemNaoEncontradoException {
        if(!listaDeItens.remove(item)){
            throw new ItemNaoEncontradoException(item+" nao esta no inventario"); 
        }
    }


    public ItemPadrao obterItem(int indice) throws IndiceInvalidoException {

        if (indice >= 0 && indice < listaDeItens.size()) {
            return listaDeItens.get(indice);
        } else {
            throw new IndiceInvalidoException("Indice "+indice+" nao existe no inventario");
        }
    }


    // public boolean estaCheio() {
    //     return listaDeItens.size() >= capacidade;
    // }


    public List<ItemPadrao> getInventario() {
        return new ArrayList<>(listaDeItens); 
    }


    public void setListaDeItens(List<ItemPadrao> itens) {
        if (itens.size() <= capacidade) {
            this.listaDeItens = new ArrayList<>(itens);
        } else {
            
            this.listaDeItens = new ArrayList<>(itens.subList(0, capacidade));
        }
    }

   
    
}