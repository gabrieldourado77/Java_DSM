import java.util.Scanner;

public class App08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float cotacaoDolar = 0;
        float valorDolares = 0;
        float valorReais = 0;

        System.out.print("Cotação do dólar: ");
        cotacaoDolar = sc.nextFloat();
        System.out.print("Valor em dólares: US$ ");
        valorDolares = sc.nextFloat();
        valorReais = valorDolares * cotacaoDolar;

        System.out.println("US$ "+valorDolares+" equivalem a R$ "+valorReais);

    }
}
