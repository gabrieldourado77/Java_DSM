import java.util.Scanner;
import java.lang.Math;

public class App04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double volumeLata = 0;
        double pi = 3.14159;
        double raioLata = 0;
        double alturaLata = 0;

        System.out.println("Digite as medidas da lata:");
        System.out.print("Raio: ");
        raioLata = sc.nextDouble();
        System.out.print("Altura: ");
        alturaLata = sc.nextDouble();
        
        volumeLata = pi * (Math.pow(raioLata,2)) * alturaLata;

        System.out.println("Volume da lata de óleo: "+volumeLata);

    }
}
