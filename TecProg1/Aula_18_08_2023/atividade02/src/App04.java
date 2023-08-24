import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        System.out.println("------------------------------------");
        System.out.println("Digite 5 números inteiros:");
        System.out.println("------------------------------------");
        System.out.print("1o número: ");
        num1 = sc.nextInt();
        System.out.print("2o número: ");
        num2 = sc.nextInt();
        System.out.print("3o número: ");
        num3 = sc.nextInt();
        System.out.print("4o número: ");
        num4 = sc.nextInt();
        System.out.print("5o número: ");
        num5 = sc.nextInt();
        sc.close();

        System.out.println("------------------------------------");
        System.out.print("Maior número: ");

        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println(num1);
        }
        else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println(num2);
        }
        else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println(num3);
        }
        else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println(num4);
        }
        else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
            System.out.println(num5);
        }

        System.out.println("------------------------------------");
        System.out.print("Menor número: ");

        if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println(num1);
        }
        else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.println(num2);
        }
        else if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println(num3);
        }
        else if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println(num4);
        }
        else if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
            System.out.println(num5);
        }

        System.out.println("------------------------------------");

    }
}
