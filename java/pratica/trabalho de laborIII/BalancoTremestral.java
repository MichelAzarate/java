class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gasto do trimestre:"+ gastosTrimestre);
        int mediaPorMes = gastosTrimestre / 3;
        System.out.println("Média mensal" + mediaPorMes);
        if(gastosTrimestre>=50000){
            System.out.println("Estamos no bom caminho" +gastosTrimestre);
        }else{
            System.out.println("Estamos no mau caminho" + gastosTrimestre);
        }
    }
}