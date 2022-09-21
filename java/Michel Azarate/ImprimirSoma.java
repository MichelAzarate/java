public class ImprimirSoma {
    public static void main(String[] args) {
        final int a = 1;
        int soma = 0;
        System.out.println("Soma de 1 ate 1000");
        for(int i=1; i <=999; i++){
        soma = a + i;
        System.out.println("A soma "+ i +" + " + a +" = " + soma);
       }
    }  
}
