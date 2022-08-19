import java.util.Scanner;

public  class CursoJava1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int max = sc.nextInt();

            int cont = 0;

            while(cont < max){
                System.out.println(cont + " Michel Azarate");
                cont++;
            }
        }
        
        // Loop while

        System.out.println("Fim do programa");
    }
    
}