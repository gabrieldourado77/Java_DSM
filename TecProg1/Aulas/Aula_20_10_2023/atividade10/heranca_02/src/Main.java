public class Main {
    
    public static void main(String[] args) {
        
        Veiculo v = new Veiculo("123BGWT", 2023);
        Caminhao c = new Caminhao("123TWGB", 2018, 10);
        Onibus o = new Onibus("7654WJTG", 2019, 24);

        v.exibirDados();
        c.exibirDados();
        o.exibirDados();

    }

}
