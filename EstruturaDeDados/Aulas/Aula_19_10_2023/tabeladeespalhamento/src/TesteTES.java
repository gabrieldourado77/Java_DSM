public class TesteTES {
    
    public static void main(String[] args) throws Exception {

        TabelaDeEspalhamentoSimples tb = new TabelaDeEspalhamentoSimples(100);

        try{
            tb.adiciona(100,11);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Estado da Tabela de Espalhamento\n" + tb.toString());

    }

}
