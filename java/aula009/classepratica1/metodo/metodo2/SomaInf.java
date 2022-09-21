package metodo.metodo2;

public class SomaInf {
    public static void main(String[] args) {
       System.out.println(somainf(3,3,4,5)); 
        
    }

    public static int somainf(/*lista de parametros*/int... numeros){
        int res = 0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }
}
