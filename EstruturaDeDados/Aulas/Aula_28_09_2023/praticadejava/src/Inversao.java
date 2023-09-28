import java.util.Scanner;

public class Inversao {
    public static void main(String args[]){

        FilaDeInteiros fila2 = new FilaDeInteiros(5);
        PilhaDeInteiros pilha2 = new PilhaDeInteiros(5);

        Scanner sc = new Scanner(System.in);

        int valor;
        
        try{
            while(!fila2.cheia()){
                System.out.println("Digite um número: ");
                valor = sc.nextInt();
                fila2.adiciona(valor);
            }

            while(!pilha2.cheia()){
                valor = fila2.remove();
                pilha2.empilha(valor);
            }
            
            while(!pilha2.vazia()){
                valor = pilha2.desempilha();
                fila2.adiciona(valor);
            }

            sc.close();

            System.out.println("Elementos: " + fila2.toString());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
