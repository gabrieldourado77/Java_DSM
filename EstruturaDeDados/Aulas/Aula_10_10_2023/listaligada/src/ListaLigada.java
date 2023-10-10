public class ListaLigada {

    private No inicio;
    
    public ListaLigada(){
        inicio = null;
    }

    public void adicionaInicio(int e){
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }

    public void adicionaFinal(int e){
        if(inicio == null){
            inicio = new No(e);
        }
        else{
            No aux = inicio;

            while(aux.prox != null){
                aux = aux.prox;
            }

            No novo = new No(e);
            aux.prox = novo;
        }
    }

    public int removeInicio() throws Exception{
        if(inicio == null){
            throw new Exception("Erro! Lista Vazia."); 
        }
        else{
            int r = inicio.dado;
            inicio = inicio.prox;
            return r;
        }
    }

    public int removeFinal() throws Exception{
        int r = -1;

        if(inicio == null){
            throw new Exception("Erro! Lista Vazia.");
        }
        else{
            if(inicio.prox == null){
                r = inicio.dado;
                inicio =  null;
            }
            else{
                No aux = inicio;

                while(aux.prox.prox != null){
                    aux = aux.prox;
                }

                r = aux.prox.dado;
                aux.prox = null;
            }
        }

        return r;
    }

    public String toString(){
        String r = "";
        No aux = inicio;

        while(aux != null){
            r = aux.dado + "\t";
            aux = aux.prox;
        }

        return r;
    }

}
