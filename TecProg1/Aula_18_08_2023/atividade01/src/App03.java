import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float grausFah = 0;
        float grausCelsius = 0;

        System.out.print("Temperatura em graus Fahrenheit: ");
        grausFah = sc.nextFloat();
        grausCelsius = (grausFah - 32) / 1.8f;
        System.out.println("Temperatura em graus Celsius: "+grausCelsius);

    }
}
