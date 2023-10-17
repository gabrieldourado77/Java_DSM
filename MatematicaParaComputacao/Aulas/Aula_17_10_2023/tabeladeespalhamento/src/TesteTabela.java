public class TesteTabela {
    
    public static void main(String[] args) throws Exception {

        TabelaDeEspalhamento tb = new TabelaDeEspalhamento(3);

        tb.adiciona(1,2);
        tb.adiciona(1,3);
        tb.adiciona(2,1);
        tb.adiciona(3,2);

        System.out.println(tb.toString());

    }

}
