import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("------------------------------------");
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        System.out.println("------------------------------------");

        if(num % 2 == 0){
            System.out.println("O número "+num+" é par");
        }
        else{
            System.out.println("O número "+num+" é ímpar");
        }

        System.out.println("------------------------------------");

    }
}
