import java.util.Scanner;

public class App09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float aux = 0;

        System.out.print("Digite o valor de A: ");
        a = sc.nextFloat();
        System.out.print("Digite o valor de B: ");
        b = sc.nextFloat();

        aux = a;
        a = b;
        b = aux;

        System.out.println("Os valores foram trocados");
        System.out.println("Valor de A: "+a+"\nValor de B: "+b);

    }
}
