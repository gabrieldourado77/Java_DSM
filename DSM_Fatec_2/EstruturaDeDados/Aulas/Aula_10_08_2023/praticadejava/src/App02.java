import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {

        float num1 = 0;
        float num2 = 0;
        float mult = 0;

        Scanner sc =  new Scanner(System.in);
        
        System.out.println("--------------------------------------");
        System.out.println("Digite dois números:");
        System.out.println("--------------------------------------");

        System.out.print("1o Número: ");
        num1 = sc.nextFloat();
        System.out.print("2o Número: ");
        num2 = sc.nextFloat();
        
        sc.close();

        mult = num1 * num2;

        System.out.println("--------------------------------------");
        System.out.println(num1 + " x " + num2 + " = " + mult);
        System.out.println("--------------------------------------");

    }
}
