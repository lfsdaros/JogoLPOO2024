package personagem;

public class PersonagemPadrao {
    private int nivelAtual;
    private int saudeAtual;
    private int protecaoAtual;

    private String patenteAtual;
    private int danoPatente;

    private final int danoBacamarte = 100;  //arma p todos
    private final int saudeMaxima = 100;

    private int x_personagem;
    private int y_personagem;
    private int velocidadePersonagem;




   public PersonagemPadrao(int nivelAtual){       // }, int saudeAtual){
    this.nivelAtual = nivelAtual;
    this.saudeAtual = saudeMaxima; //inicio == saude maxima
    this.protecaoAtual = 0;        // inicio == 0 de protecao
    this.x_personagem = 100;      //Posicao inicial
    this.y_personagem = 100;      //Posicao inicial
    this.velocidadePersonagem = 5;

    //this.saudeAtual = saudeAtual;
    setPatenteAtual(nivelAtual);
    
   }

    public void setSaudeAtual(int saudeAtual){
      if(saudeAtual >= this.saudeMaxima){
        this.saudeAtual = this.saudeMaxima;
      }else{
      this.saudeAtual = saudeAtual;
      }
    }

    public int getSaudeAtual(){
        return saudeAtual;
    }

    public void setProtecaoAtual(int protecaoAtual){
      this.protecaoAtual = protecaoAtual;
    }

    public int getProtecaoAtual(){
      return this.protecaoAtual;
    }


    public void setNivelAtual(int nivelAtual){
        // switch(nivelAtual){
        //     case 2:
        //     this.patenteAtual = "Cabo";
        //     break;
        //     case 3:
        //     this.patenteAtual = "Tenente";
        //     break;
        //     case 4:
        //     this.patenteAtual = "Capitão";
        //     break;
        //     case 5: 
        //     this.patenteAtual = "General";
        //     break;

        //     default:
        //     this.patenteAtual = "Recruta";  //nivel basico     
        // }   

        this.nivelAtual = nivelAtual;
    }

    public int getNivelAtual(){
        return nivelAtual;
    }

    public void setPatenteAtual(int nivelAtual){    
        switch(nivelAtual){
          case 2:
            this.patenteAtual = "Cabo";
            this.danoPatente = 10;
            break;
          case 3:
            this.patenteAtual = "Tenente";
            this.danoPatente = 25;
            break;
          case 4:
            this.patenteAtual = "Capitão";
            this.danoPatente = 50;
            break;
          case 5: 
            this.patenteAtual = "General";
            this.danoPatente = danoBacamarte;
            break;
          default:
            this.patenteAtual = "Recruta";  //nivel basico 
            this.danoPatente = 5;
            break;    
        }   
    }

    public String getPatenteAtual(){
      return this.patenteAtual;
    }

    public int getDanoPatente(){
        return this.danoPatente;
    }
    
    

    // public void setDanoPatente(String patenteAtual){  // dano padrao de cada patente
    //     switch (patenteAtual) {
    //       case "Cabo": 
    //         this.danoPatente = 10;
    //         break;
    //       case "Tenente":
    //         this.danoPatente = 25;
    //         break;
    //       case "Capitão": 
    //         this.danoPatente = 50;
    //         break;
    //       case "General":
    //         this.danoPatente = danoBacamarte;
    //         break;
    //       default:
    //         this.danoPatente = 5;
    //         break;
    //     }
    // }

    public int getX_personagem() {
      return x_personagem;
    }

    public void setX_personagem(int x_personagem) {
      this.x_personagem = x_personagem;
    }

    public int getY_personagem() {
      return y_personagem;
    }

    public void setY_personagem(int y_personagem) {
      this.y_personagem = y_personagem;
    }

    public int getVelocidadePersonagem() {
      return velocidadePersonagem;
    }

    public void setVelocidadePersonagem(int velocidadePersonagem) {
      this.velocidadePersonagem = velocidadePersonagem;
    }


}
