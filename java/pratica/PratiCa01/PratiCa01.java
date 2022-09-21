import java.util.Scanner;

public class PratiCa01{
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num0 ,num1, num2, resul ;
            String nome ;

            System.out.println("Digita o seu nome: ");
            nome = sc.nextLine();

            System.out.println("Digite um numero: ");
            num0 = sc.nextInt();

            System.out.println("Digite outro numero: ");
            num1 = sc.nextInt();

            System.out.println("Digite o ultimo numero: ");
            num2 = sc.nextInt();

            resul = (num0 + num1 + num2)/3;

            if(resul >= 14){
                System.out.println(nome + " Você está de parabens, despensou "+ resul);
            }else if(resul >= 10){
                System.out.println(nome + " Aprovado com a media: " + resul);
            }else {
                System.out.println(nome + " Reprovaste com a media: " + resul);
            }
        }
    }
}