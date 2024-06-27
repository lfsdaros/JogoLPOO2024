package personagem;

public class Artilharia extends PersonagemPadrao {
    private int danoSniper = 50;

    public Artilharia(int nivelAtual){
        super(nivelAtual);
    }

    public int getDanoSniper(){
        return this.danoSniper;
    }

    public void setDanoSniper(double distancia){
        int danoPatente = super.getDanoPatente();

    // DANO COM DISTANCIA
        if(distancia > 100){
            this.danoSniper = 0;
        } else if (distancia > 50 && distancia < 99){
            this.danoSniper = danoPatente*(3/4);
        } else if (distancia > 25 && distancia < 49){
            this.danoSniper = danoPatente*(1/2);
        } else {
            this.danoSniper = danoPatente;
        }
    }

}
