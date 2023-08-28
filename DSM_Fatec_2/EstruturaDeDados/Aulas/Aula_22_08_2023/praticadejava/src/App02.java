import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {

        /*
         * Exercício passado na lousa.
        */

        Scanner sc = new Scanner(System.in);

        int matriz[][];
        matriz = new int[3][];
        int somatoriaLinhaMatriz = 0;
        float mediaLinhaMatriz = 0;

        System.out.println("------------------------------------");
        System.out.println("Preencha as posições da matriz:");
        System.out.println("------------------------------------");

        for(int l = 0; l < matriz.length; l++){
            matriz[l] = new int[3];

            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("Linha %d - Coluna %d: ", l, c);
                matriz[l][c] = sc.nextInt();
            }
        }

        System.out.println("------------------------------------------------------------------------");

        // Mostrar a transposta (não consegui resolver isso).

        // Mostrar a somatória dos elementos, de cada linha da matriz.

        System.out.println("Somatória da matriz: ");

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                somatoriaLinhaMatriz = somatoriaLinhaMatriz + matriz[l][c];
            }
            System.out.printf("Linha %d: %d",l, somatoriaLinhaMatriz);
            mediaLinhaMatriz += somatoriaLinhaMatriz;
            System.out.println();
            somatoriaLinhaMatriz = 0;
        }

        // Mostrar a média dos elementos, de cada linha da matriz.

        System.out.println("------------------------------------------------------------------------");
        mediaLinhaMatriz = mediaLinhaMatriz / 9;
        System.out.printf("Média dos valores da matriz: %.2f", mediaLinhaMatriz);
        System.out.println();
        System.out.println("------------------------------------------------------------------------");

    }
}
