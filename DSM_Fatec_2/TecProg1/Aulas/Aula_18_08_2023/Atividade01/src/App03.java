import java.util.Scanner;

public class App03 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float celsius = 0;
        float fah = 0;

        System.out.print("Temperatura em graus Fahrenheit: ");
        fah = sc.nextFloat();
        celsius = (fah - 32) * (5/9);
        System.out.println("Temperatura em graus Celsius: "+celsius);

    }
}
