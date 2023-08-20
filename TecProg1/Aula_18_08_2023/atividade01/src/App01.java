import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float mult = 0;

        System.out.print("Digite o 1o número: ");
        num1 = sc.nextFloat();
        System.out.print("Digite o 2o número: ");
        num2 = sc.nextFloat();

        mult = num1 * num2;

        System.out.println(num1+" x "+num2+" = "+mult);

    }
}
