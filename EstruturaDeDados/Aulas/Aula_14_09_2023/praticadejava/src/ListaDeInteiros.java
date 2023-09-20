public class ListaDeInteiros{

    // Essa classe possui alguns atributos e métodos, que serão testados na classe Teste.

    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){

        dados = new int[capMax];

    }

    public void adicionaFinal(int e) throws Exception{

        if(!cheia()){
            // A lista não está cheia
            dados[tamanho] = e;
            tamanho = tamanho + 1;
        }
        else{
            // A lista está cheia
            throw new Exception("Erro! Lista Cheia");
        }

    }

    public boolean cheia(){
        return tamanho == dados.length;
    }

    public String toString(){

        String s = "Elementos: " ;

        for(int i = 0; i < tamanho; i++){
            s = s + " " + dados[i];
        }

        s = s + "\nTamanho: " + tamanho;
        return s;

    }

    public int obterUltimo() throws Exception{
        if(vazia()){
            throw new Exception("Erro! Lista Vazia");
        }
        else{
            return dados[tamanho - 1];
        }
    }

    public int obterPrimeiro() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Lista Vazia");
        }
        else{
            return dados[0];
        }
    }

    public int removeFinal() throws Exception{

        if(!vazia()){
            // A lista não está vazia.
            tamanho = tamanho - 1;
            return dados[tamanho];
        }
        else{
            // A lista está vazia.
            throw new Exception("Erro! Lista Vazia");
        }

    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public int removeInicio() throws Exception{

        if(vazia()){
            throw new Exception("Erro! Lista Vazia");
        }
        else{
            // Guarda o elemento removido, para, depois, retorná-lo no final.
            int r = dados[0];
            
            // Move um elemento á esquerda, quando a lista possuir mais de um elemento.
            for(int i = 0; i < tamanho - 1; i++){
                dados[i] = dados[i+1];
            }

            // Decrementa o tamanho, para ajustá-lo á quantidade de elementos da lista.
            tamanho--;
            // Retorna o elemento que foi removido
            return r;
        }

    }

}
