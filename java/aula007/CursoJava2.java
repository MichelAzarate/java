import java.util.Arrays;

public class CursoJava2{
    public static void main(String[] args) {
        // metodos s 

    // final int tam = 5;
    int[] num = {1,5,6,3,2,7,9,8,0};

  
    Arrays.sort(num); // sserve para ordenar os elementos de um array
    
    for( int n:num) // for especial para ler elementos do array
    {
        System.out.printf("%d-", n);
    }

    // System.out.printf("%nNota do Aluno: %d", );

    }
}