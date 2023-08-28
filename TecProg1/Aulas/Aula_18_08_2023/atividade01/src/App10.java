import java.util.Scanner;
import java.lang.Math;

public class App10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = 0;
        double numAoQuadrado = 0;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextDouble();
        numAoQuadrado = Math.pow(num,2);

        System.out.println(num+" ao quadrado é igual a "+numAoQuadrado);

    }
}
