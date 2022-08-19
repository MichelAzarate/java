

public class CursoJava{
    public static void main(String[] args) {
        
        // Array

        int[] num = new int[5];
        int[] numeros ={10,20,30,40,50};

        num[0] = 10;
        num[1] = 4;
        num[2] = 9;
        num[3] = 11;
        num[4] = 8;

        for(int i=0; i < num.length ; i++){
            System.out.printf("%d - ", num[i]);
        }

        System.out.printf("%d",numeros[3]);
    }
}