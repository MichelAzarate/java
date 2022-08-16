import javax.swing.table.DefaultTableCellRenderer;

public class CursoJava2{
    public static void main(String[] args) {
        int pos =5;
        switch(pos){
            case 1:
                System.out.println("Primeiro Logar");
                break;
            case 2:
                System.out.println("Segundo Logar");
                break;
            case 3:
                System.out.println("Terceiro Logar");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de participacao");
                break;
            default:
                System.out.println("Foi desclasseficado");
                break;


        }
    }
}