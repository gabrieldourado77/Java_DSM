import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("------------------------------------");
        System.out.println("Digite três números inteiros:");
        System.out.println("------------------------------------");
        System.out.print("Primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Terceiro número: ");
        num3 = sc.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Números em ordem crescente:");
        System.out.println("------------------------------------");

        if(num1 < num2 && num1 < num3){
            System.out.print(num1+" - ");

            if(num2 < num3){
                System.out.println(num2+" - "+num3);
            }
            else{
                System.out.println(num3+" - "+num2);
            }
        }
        else if(num2 < num1 && num2 < num3){
            System.out.print(num2+" - ");

            if(num1 < num3){
                System.out.println(num1+" - "+num3);
            }
            else{
                System.out.println(num3+" - "+num1);
            }
        }
        else{
            System.out.print(num3+" - ");

            if(num1 < num2){
                System.out.println(num1+" - "+num2);
            }
            else{
                System.out.println(num2+" - "+num1);
            }
        }

        System.out.println("------------------------------------");

    }
}
