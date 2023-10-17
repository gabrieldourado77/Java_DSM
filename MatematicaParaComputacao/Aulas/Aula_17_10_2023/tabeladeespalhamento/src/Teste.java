public class Teste {
    
    public static void main(String[] args) throws Exception {

        PilhaLL pilha1 = new PilhaLL();
        FilaLL fila1 = new FilaLL();

        int i = 1;


        while(i <= 5){
            fila1.adiciona(i*5);
            i = i + 1;
        }

        if(!fila1.vazia()){
            System.out.println("Elementos da Fila: " + fila1.toString());
        }
        else{
            System.out.println("Fila vazia.");
        }

        if(!pilha1.vazia()){
            System.out.println("Elementos da Pilha: " + fila1.toString());
        }
        else{
            System.out.println("Pilha vazia.");
        }

        
        while(!fila1.vazia()){
            pilha1.empilha(fila1.remove());
        }

        if(!fila1.vazia()){
            System.out.println("Elementos da Fila: " + fila1.toString());
        }
        else{
            System.out.println("Fila vazia.");
        }

        if(!pilha1.vazia()){
            System.out.println("Elementos da Pilha: " + fila1.toString());
        }
        else{
            System.out.println("Pilha vazia.");
        }
        
    }

}
