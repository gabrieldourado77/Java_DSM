import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {

        int resultadoFatorial = 0;

        int[] a = new int[5];
        int[] b = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Preencha o Vetor A:");
        System.out.println("-----------------------------------------");

        for(int i = 0; i < a.length; i++){
            System.out.print((i+1) + "o Número: ");
            a[i] = sc.nextInt();

            resultadoFatorial = a[i];

            for(int c = a[i]; c > 1; c--){
                resultadoFatorial = resultadoFatorial * (c-1);
            }

            b[i] = resultadoFatorial;
        }

        sc.close();

        System.out.println("-----------------------------------------");
        System.out.print("Vetor A\nNúmeros: ");

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\n---------------------------------------------------");
        System.out.print("Vetor B\nNúmeros: ");

        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+" ");
        }
        
        System.out.println("\n---------------------------------------------------");

    }
}
