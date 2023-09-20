import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade = 0;
        int dias = 0;

        System.out.print("Quantos anos você tem? ");
        idade = sc.nextInt();
        dias = idade * 365;
        System.out.println("Você possui, aproximadamente, "+dias+" dias de vida.");

    }
}
