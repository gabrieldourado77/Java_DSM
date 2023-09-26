public class FilaDeInteiros {
    
    private int dados[];
    private int tamanho;

    public FilaDeInteiros(int capMax){
        dados =  new int[capMax];
        tamanho = 0;
    }

    public void adiciona(int e) throws Exception{

        if(!cheia()){
            // A fila não está cheia
            dados[tamanho] = e;
            tamanho = tamanho + 1;
        }
        else{
            // A fila está cheia
            throw new Exception("Erro! Fila Cheia");
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

    public int obterPrimeiro() throws Exception{
        if(vazia()){
            throw new Exception("ERRO! Fila Vazia");
        }
        else{
            return dados[0];
        }
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public int remove() throws Exception{

        if(vazia()){
            throw new Exception("Erro! Fila Vazia");
        }
        else{
            // Guarda o elemento removido, para, depois, retorná-lo no final.
            int r = dados[0];
            
            // Move um elemento á esquerda, quando a fila possuir mais de um elemento.
            for(int i = 0; i < tamanho - 1; i++){
                dados[i] = dados[i+1];
            }

            // Decrementa o tamanho, para ajustá-lo á quantidade de elementos da fila.
            tamanho--;
            // Retorna o elemento que foi removido.
            return r;
        }

    }


}
