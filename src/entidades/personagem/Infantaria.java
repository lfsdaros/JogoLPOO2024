package entidades.personagem;

public class Infantaria extends PersonagemPadrao{
    private int danoEscopeta = 50 ;  // escopeta é a arma base da infantaria

//    public Infantaria(int nivelAtual){
//     super(nivelAtual);
//    }

    public Infantaria(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual){
        super(x, y, velocidade, saudeAtual, protecaoAtual, nivelAtual);
      }

    public int getDanoEscopeta(){
        return this.danoEscopeta;
    }

    public void setDanoEscopeta(double distancia){
        int danoPatente = super.getDanoPatente();
    
    // DANO COM DISTANCIA
        if(distancia > 50){
            this.danoEscopeta = 0;
        } else if (distancia > 25 && distancia < 49){
            this.danoEscopeta = danoPatente*(3/4);
        } else if (distancia > 10 && distancia < 24){
            this.danoEscopeta = danoPatente*(1/2);
        } else {
            this.danoEscopeta = danoPatente;
        }
    }
}
