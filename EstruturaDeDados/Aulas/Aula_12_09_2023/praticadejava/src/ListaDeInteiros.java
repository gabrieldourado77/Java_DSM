public class ListaDeInteiros{

    // Essa classe possui alguns atributos e métodos, que serão testados na classe Teste.

    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){

        dados = new int[capMax];

        if(dados.length != tamanho){
            dados[tamanho]=53;
            tamanho = tamanho +1;
        }
        else{
            System.out.println("Erro! Lista Cheia");
        }

    }

    public void adicionaFinal(int e) throws Exception{

        if(dados.length != tamanho){
            dados[tamanho]=e;
            tamanho = tamanho +1;
        }
        else{
            throw new Exception("Erro! Lista Cheia");
        }

    }

    public String toString(){

        String s = "Elementos: " ;

        for(int i = 0; i < tamanho; i++){
            s = s + " " + dados[i];
        }

        s = s + "\nTamanho: " + tamanho;
        return s;

    }

    public int removeFinal() throws Exception{

        int i = Integer.MAX_VALUE;

        if(tamanho != 0){
            tamanho = tamanho -1;
            return dados[tamanho];
        }
        else{
            throw new Exception("Erro! Lista Vazia");
        }

    }

}

