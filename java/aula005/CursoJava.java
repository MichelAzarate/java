import java.util.Scanner;

public class CursoJava {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int num = 0 ;

        try (Scanner sc = new Scanner(System.in)) {
            // loop for
            for(int cont = 0 ; cont < 5; cont++){
                System.out.println("Disgite um numero: ");
                num = cs.nextInt();
            }
        }    
    }
}