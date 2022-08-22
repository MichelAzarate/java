import java.util.Arrays;

public class CursoJava3{
    public static void main(String[] args) {
        // metodos 

        final int tam = 10 ;
        int[] num ={4,5,2,6,8,7,9,0,1};
        int[] numeros = new int[tam];

        // Arrays.fill(numeros,10); // o metodo fill, prenche o array com o valor idicado
        //System.arraycopy(num, 0, numeros, 0, tam);

        System.out.printf("Arrays sso iguais:%d", Arrays.equals(num, numeros) ? "Sim" : "Nao");

        // for(int n:numeros)
        // {
        //     System.out.printf("%d-", n);
        // }

    }
}