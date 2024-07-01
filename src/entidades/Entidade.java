package entidades;

public abstract class Entidade {
    private int x, y;
    private int velocidade;
    public  int saudeAtual;
    private int protecaoAtual;
    private int nivelAtual;

    public Entidade(int x, int y, int velocidade, int saudeAtual, int protecaoAtual, int nivelAtual) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.saudeAtual = saudeAtual;
        this.protecaoAtual = protecaoAtual;
        this.nivelAtual = nivelAtual;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public abstract void setSaudeAtual(int saudeAtual);

    public int getProtecaoAtual() {
        return protecaoAtual;
    }

    public void setProtecaoAtual(int protecaoAtual) {
        this.protecaoAtual = protecaoAtual;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }




}
