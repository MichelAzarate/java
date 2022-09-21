import java.util.Scanner;

public class CursoJava {
    public static void main(String[] args) {
        int num=0 ;
        String nomejog = "";
        int idadejog = 0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        new Jogadore(++num, nomejog, idadejog);
        nomejog=sc1.nextLine();
        idadejog=sc2.nextInt();
        new Jogadore(++num, nomejog, idadejog);
        new Jogadore(++num, nomejog, idadejog);




    }
}