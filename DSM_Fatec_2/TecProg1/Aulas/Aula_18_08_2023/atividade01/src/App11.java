import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int resultadoDivisao = 0;
        int restoDivisao = 0;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        resultadoDivisao = num / 6;
        restoDivisao = num % 6;

        System.out.println(num+" dividido por 6 é igual a "+resultadoDivisao);
        System.out.println("O resto dessa divisão é "+restoDivisao);

    }
}
