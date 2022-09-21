public class Jogador {
   /*metodo construtor eh o metodo automaticamente excutado quando eh instaciado a classe */
   // o construtor nao vai ter retorno 

   private int num = 0;
   private int vidas=0;
   public Jogador(int num){
    this.num=num;
    System.out.printf(" Jogador numero %d criado %n", num);
   } 
}
