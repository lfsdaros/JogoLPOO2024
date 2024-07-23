package itens;

import entidades.personagem.PersonagemPadrao;

public class Item_Morfina extends ItemPadrao {
    
    private  final int saudeMorfina = 75;
    private int quantidade;
    private PersonagemPadrao personagem;

    
    public Item_Morfina(int quantidade, PersonagemPadrao personagem) {
        super("Morfina", quantidade);
        this.personagem = personagem;
    }

    @Override
    public void aplicarEfeitoItem(PersonagemPadrao personagem){
        int novaSaude = this.personagem.getSaudeAtual() + this.saudeMorfina;
          this.personagem.setSaudeAtual(novaSaude);
    }
    
}
