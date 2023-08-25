import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {

        float mediaProvas = 0;

        float[] primeiraProva = new float[5];
        float[] segundaProva = new float[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Notas da Primeira Prova");
        System.out.println("-----------------------------------------");

        for(int i = 0; i < primeiraProva.length; i++){
            System.out.print((i+1) + "o Aluno - Nota: ");
            primeiraProva[i] = sc.nextFloat();
        }

        System.out.println("-----------------------------------------");
        System.out.println("Notas da Segunda Prova");
        System.out.println("-----------------------------------------");

        for(int i = 0; i < segundaProva.length; i++){
            System.out.print((i+1) + "o Aluno - Nota: ");
            segundaProva[i] = sc.nextFloat();
        }

        sc.close();

        System.out.println("---------------------------------------------------");
        System.out.println("Média dos Alunos");
        System.out.println("---------------------------------------------------");

        for(int i = 0; i < 5; i++){
            mediaProvas = (primeiraProva[i] + segundaProva[i]) / 2;
            System.out.println((i+1) + "o Aluno: " + mediaProvas);
        }

        System.out.println("---------------------------------------------------");

    }
}
