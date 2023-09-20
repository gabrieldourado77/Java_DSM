public class TestaConta {
    
    public static void main(String[] args) throws Exception {
        
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        conta1.setNomeCorrentista("Fernando");
        conta1.setNumeroConta("1234");
        conta1.setFlagTipoConta("Nao");
        conta1.setSaldoConta(1500.00f);
        conta1.setSexoCorrentista("Masculino");
        conta1.setIdadeCorrentista(29);

        conta2.setNomeCorrentista("Maria");
        conta2.setNumeroConta("5312");
        conta2.setFlagTipoConta("Sim");
        conta2.setSaldoConta(530.31f);
        conta2.setSexoCorrentista("Feminino");
        conta2.setIdadeCorrentista(45);

        conta3.setNomeCorrentista("Joao");
        conta3.setNumeroConta("9621");
        conta3.setFlagTipoConta("Sim");
        conta3.setSaldoConta(4325.12f);
        conta3.setSexoCorrentista("Masculino");
        conta3.setIdadeCorrentista(54);

    }

}
