import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float fah = 0;
        float celsius = 0;

        System.out.print("Temperatura em graus Celsius: ");
        celsius = sc.nextFloat();
        fah = (9 * celsius + 160) / 5;
        System.out.println("Temperatura em graus Fahrenheit: "+fah);

    }
}
