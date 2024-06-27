package personagem;

public class Cavalaria extends PersonagemPadrao {
    private int danoRevolver;  //padrao = ?
   
    public Cavalaria(int nivelAtual){
        super(nivelAtual);
    }

    public int getDanoRevolver(){
        return this.danoRevolver;
    }

    public void setDanoRevolver(double distancia){
        int danoPatente = super.getDanoPatente(); 

        if(distancia > 75){
            this.danoRevolver = 0;
        } else if (distancia > 38 && distancia < 74){
            this.danoRevolver = danoPatente*(3/4);
        } else if (distancia > 20 && distancia < 37){
            this.danoRevolver = danoPatente*(1/2);
        } else {
            this.danoRevolver = danoPatente;
        }
    }
}