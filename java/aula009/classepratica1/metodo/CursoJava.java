package metodo;

public class CursoJava{
    public static void main(String[] args) {
        msg("Michel Azarate",2);
    }
    /*Para criar um metodo Sempre vou indica 
     * Modificador de acesso
     * Tipo de retorno 
     * Conjuntos de paramentros
     */
    public static void msg(String m, int l){
        for(int i=0; i<l; i++){
        System.out.println(m);
        }
    }
}