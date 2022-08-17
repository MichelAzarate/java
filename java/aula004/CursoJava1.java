import java.util.Scanner;

public class CursoJava1{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int  n1 = 0, n2 = 0, res = 0 ;
            String nome ="";

            System.out.println("Digite o seu nome: ");
            nome=scan.nextLine();
            System.out.println("Digite um numero: ");
            n1=scan.nextInt();
            System.out.println("Digite outro numero: ");
            n2=scan.nextInt();
            res = n1+n1;
            System.out.printf("%s a Soma de %d com %d eh igual a %d",nome,n1,n2,res);
        }

    }

}