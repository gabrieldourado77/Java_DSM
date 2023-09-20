import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float grausCelsius = 0;
        float grausFah = 0;

        System.out.print("Temperatura em graus Celsius: ");
        grausCelsius = sc.nextFloat();
        grausFah = (9 * grausCelsius + 160) / 5;
        System.out.println("Temperatura em graus Fahrenheit: "+grausFah);

    }
}
