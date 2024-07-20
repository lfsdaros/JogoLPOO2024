package itens;

import excecoes.IndiceInvalidoException;
import excecoes.ItemNaoEncontradoException;
import java.util.ArrayList;
import java.util.List;  



public class Inventario {

    private List<ItemPadrao> listaDeItens;
    private final int capacidade = 16;
    private ItemPadrao itemPadrao;

    public Inventario() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(ItemPadrao item) {   
        if (listaDeItens.size() < capacidade && itemPadrao.achouItem() == true) {
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

    public boolean procurarItem(String nomeItem) {
        for (ItemPadrao item : listaDeItens) {
            if (item.getNomeItem().equals(nomeItem)) {
                return true;
            }
        }
        return false;
    }
   
    public int obterQuantidadeItemX(String nomeItem) {
        for (ItemPadrao item : listaDeItens) {
            if (item.getNomeItem().equals(nomeItem)) {
                return item.getQuantidadeItens();
            }
        }
        return 0;
    }

    public List<ItemPadrao> getListaDeItens() {
        return listaDeItens;
    }
    
}