package npcs;

public class Inimigos {
    private int x_inimigo;
    private int y_inimigo;

    private int nivelAtual;
    private int saudeAtual;
    private int protecaoAtual;


    public Inimigos(int x_inimigo, int y_inimigo, int nivelAtual) {
        this.x_inimigo = x_inimigo;
        this.y_inimigo = y_inimigo;
        this.nivelAtual = nivelAtual;
        this.saudeAtual = 50 * nivelAtual;   //level 1 = 50hp ; level 5 = 250hp
    }

    public int getX_inimigo() {
        return x_inimigo;
    }

    public void setX_inimigo(int x_inimigo) {
        this.x_inimigo = x_inimigo;
    }

    public int getY_inimigo() {
        return y_inimigo;
    }

    public void setY_inimigo(int y_inimigo) {
        this.y_inimigo = y_inimigo;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public int getProtecaoAtual() {
        return protecaoAtual;
    }

    public void setProtecaoAtual(int protecaoAtual) {
        this.protecaoAtual = protecaoAtual;
    }



    


}

