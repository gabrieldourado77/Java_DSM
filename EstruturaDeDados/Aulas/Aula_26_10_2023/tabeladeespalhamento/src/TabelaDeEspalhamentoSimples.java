public class TabelaDeEspalhamentoSimples {

    private int tabela[];

    public TabelaDeEspalhamentoSimples(int capMax){
        tabela = new int[capMax];
    }

    public int funcaoEspalha(int chave){
        return chave - 1;
    }

    public void adiciona(int chave, int quant) throws Exception{
        int indice = funcaoEspalha(chave);

        if(indice >= 0 && indice < tabela.length){
            tabela[indice] = quant;
        }
        else{
            throw new Exception("Código de Produto Inválido");
        }
    }

    public int remove(int chave) throws Exception{
        int indice = funcaoEspalha(chave);

        if(indice >= 0 && indice < tabela.length){
            int r = tabela[indice];
            tabela[indice] = 0;
            return r;
        }
        else{
            throw new Exception("Código de Produto Inválido");
        }
    }

    public String toString(){
        String s = "";
        
        for(int i = 0; i < tabela.length; i++){
                s = s + i + "\t=>" + tabela[i] + "\n";
        }

        return s;
    }
    
}
