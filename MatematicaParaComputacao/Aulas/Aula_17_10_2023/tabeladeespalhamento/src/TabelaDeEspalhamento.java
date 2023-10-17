public class TabelaDeEspalhamento {

    private ListaLigada tabela[];

    public TabelaDeEspalhamento(int quant){
        tabela = new ListaLigada[quant];
    }

    public int funcaoEspalha(int chave){
        return chave - 1;
    }

    public void adiciona(int origem, int destino){
        
        if(origem >= 1 && origem <= tabela.length && destino >= 1 && destino <= tabela.length){
            int indice = funcaoEspalha(origem);
            
            if(tabela[indice] == null){
                tabela[indice] = new ListaLigada();
            }

            tabela[indice].adicionaFinal(destino);
        }
        else{
            System.out.println("Erro! Origem ou destino inválido");
        }
    }

    public String toString(){
        String r = "Origem\t\t\tDestino\nVértice\tÍndice\n";
        
        for(int i = 0; i < tabela.length; i++){
            if(tabela[i] != null){
                r = r + i + "\t=>" + tabela[i].toString() + "\n";
            }
        }

        return r;
    }
    
}
