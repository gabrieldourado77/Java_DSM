import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int soma = 0;

        Scanner sc =  new Scanner(System.in);
        
        System.out.println("--------------------------------------");
        System.out.println("Digite dois números inteiros:");
        System.out.println("--------------------------------------");

        System.out.print("1o Número: ");
        num1 = sc.nextInt();
        System.out.print("2o Número: ");
        num2 = sc.nextInt();
        
        sc.close();

        soma = num1 + num2;

        System.out.println("--------------------------------------");
        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println("--------------------------------------");

    }
}
