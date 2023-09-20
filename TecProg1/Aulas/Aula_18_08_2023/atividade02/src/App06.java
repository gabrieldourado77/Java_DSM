import java.util.Scanner;

public class App06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoLanche = 0;
        int quantLanches = 0;
        float precoLanche = 0;
        float valorTotal = 0;

        System.out.println("------------------------------------");
        System.out.print("Código do lanche: ");
        codigoLanche = sc.nextInt();
        System.out.print("Quantidade de lanches: ");
        quantLanches = sc.nextInt();
        sc.close();

        System.out.println("------------------------------------");
        System.out.print("Pedido: ");

        if(codigoLanche == 100){
            System.out.println(quantLanches + " Cachorro(s) Quente(s)");
            precoLanche = 1.20f;
        }
        else if(codigoLanche == 101){
            System.out.println(quantLanches + " Bauru(s) Simples");
            precoLanche = 1.30f;
        }
        else if(codigoLanche == 102){
            System.out.println(quantLanches + " Bauru(s) com Ovo");
            precoLanche = 1.50f;
        }
        else if(codigoLanche == 103){
            System.out.println(quantLanches + " Hambúrguer(es)");
            precoLanche = 1.20f;
        }
        else if(codigoLanche == 104){
            System.out.println(quantLanches + " Cheeseburguer(s)");
            precoLanche = 1.30f;
        }
        else if(codigoLanche == 105){
            System.out.println(quantLanches + " Refrigerante(s)");
            precoLanche = 1;
        }

        valorTotal = quantLanches * precoLanche;

        System.out.println("Valor Total: R$ "+valorTotal);
        System.out.println("----------------------------------------------");

    }
}
