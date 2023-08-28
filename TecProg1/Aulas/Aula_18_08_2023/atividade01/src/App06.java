import java.util.Scanner;
import java.lang.Math;

public class App06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = 0;
        double areaCircunferencia = 0;

        System.out.print("Digite o raio da circunferência em cm: ");
        raio = sc.nextDouble();
        areaCircunferencia = pi * (Math.pow(raio,2));
        System.out.println("Área da Circunferência: "+areaCircunferencia+" cm2");

    }
}
