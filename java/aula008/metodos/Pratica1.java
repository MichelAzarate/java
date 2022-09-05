import java.util.Scanner;
public class Pratica1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome ="";
        int quant = 0;
        String nnome = nome;
        
        System.out.println("Digite o teu nome");
        nome = sc.nextLine();

        System.out.println("Quantas veses quer mostrar");
        quant = sc.nextInt();

        msg(nome, quant);
        System.out.println(nnome);
        

    }
    public static void msg(String m, int l)       
    {
        for(int i=0; i<l; i++)
        {
            System.out.println(m);
        }
    }
}
