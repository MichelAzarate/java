class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.printf("%nGasto do trimestre: %d MZ", gastosTrimestre);
        int mediaPorMes = gastosTrimestre / 3;
        System.out.printf("%nMédia mensal: %d MZ", mediaPorMes);
    }
}