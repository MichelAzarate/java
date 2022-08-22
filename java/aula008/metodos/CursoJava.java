public class CursoJava {
    public static void main(String[] args) {
        // System.out.println("Olá, Mundo");
        int r;

        msg("Michel Azarate",1);
        msg("Fazendo o curso de Java",1);
        msg("Azarate",1);

        r = soma2(19, 1);
        System.out.println(soma2(10, 4));
        System.out.println(r);

        System.out.println(soma(1,3,5,7,2,8));
        System.out.println(soma(1.3,4.6));
    }
    // lista de valore
    public static int soma(int... numeros)  
    {
        int res=0;
        for( int n:numeros)
        {
            res+=n;
        }
        return res;
    }

    // Sobre carga de metodos
    public static Double soma(Double... numero)
    {
        Double res=0.0;
        for(Double n:numero)
        {
            res+=n;
        }
        return res;
    }
    

    public static int soma2(int n1,int n2){
        int res = n1 + n2;
        return  res;
    }

    public static void msg(String m, int l){
        for(int i=0; i<l ;i++){
            System.out.println(m);
        }
    }
}