import java.util.Scanner;

public class App07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float valorInicialPrestacao = 0;
        float taxaJuros = 0;
        int tempoMeses = 0;
        float valorFinalPrestacao = 0;

        System.out.print("Valor inicial da prestação: R$ ");
        valorInicialPrestacao = sc.nextFloat();
        System.out.print("Taxa de juros: ");
        taxaJuros = sc.nextFloat();
        System.out.print("Tempo de atraso (em meses): ");
        tempoMeses = sc.nextInt();

        valorFinalPrestacao = valorInicialPrestacao + (valorInicialPrestacao * (taxaJuros / 100) * tempoMeses);

        System.out.println("Valor final da prestação: R$ "+valorFinalPrestacao);

    }
}
