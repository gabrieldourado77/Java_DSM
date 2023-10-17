public class FilaLL {

    private No inicio;

    public FilaLL(){
        inicio = null;
    }

    public boolean vazia(){
        return inicio == null;
    }

    public void adiciona(int e){
        if(vazia()){
            inicio = new No(e);
        }
        else{
            No aux = inicio;

            while(aux.prox != null){
                aux = aux.prox;
            }
        }
    }

    public int remove() throws Exception{
        if(vazia()){
            throw new Exception("Erro! Fila vazia.");
        }
        else{
            int r = inicio.dado;
            inicio = inicio.prox;
            return r;
        }
    }

    public String toString(){
        String r = "";
        No aux =  inicio;

        while(aux != null){
            r = r + "\t" + aux.dado;
            aux = aux.prox;
        }

        return r;
    }

}
