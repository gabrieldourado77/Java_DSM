import java.util.Scanner;

public class App07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int resultadoFatorial = 0;

        System.out.println("------------------------------------");
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        
        System.out.println("----------------------------------------------");
        System.out.println("Fatorial:");
        resultadoFatorial = num;

        for(int i = num; i > 1; i--){
            System.out.print(i+" x ");
            resultadoFatorial = resultadoFatorial * (i-1);
        }

        System.out.println("1 = "+resultadoFatorial);
        System.out.println("----------------------------------------------");

    }
}
