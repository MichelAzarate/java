import java.util.Scanner;

public class CursoJava1{
    public static void main(String[] args) {
        
        // Array
    Scanner sc = new Scanner(System.in);

    final int tam = 5;
    char[] gabarito = {'a','a','d','b','c'};
    char[] respostas = new char[tam];
    int nota = 0;

    // respostas[0] = 'a'; respostas[1]='b'; respostas[2]='c';
    // respostas[3] = 'b'; respostas[4] = "c";

    for(int i = 0; i<tam; i++){
        System.out.printf("Imforma a nota %d:", i);
        respostas[i] = sc.nextLine().charAt(0);
    }

    for(int i=0; i<tam; i++){
        if( respostas[i] == gabarito[i]){
            nota++;
        }
        

    }

    System.out.printf("Nota do Aluno: %d");

    }
}