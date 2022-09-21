import java.util.Scanner;

public class ParImPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 101, y = 0; 
        x = sc.nextInt();
        if(x % 2 == 0){
            y = x/2;
            System.out.println("Quando x eh par y eh " + y);

        }else if( x % 2 != 0){
            y = (3*x) + 1;
            System.out.println("Quando x eh impar y eh "+ y);

        }
        for(int a = y; a >=1; a-- ){
            System.out.print( " -> " + a);
        }         
    }
}