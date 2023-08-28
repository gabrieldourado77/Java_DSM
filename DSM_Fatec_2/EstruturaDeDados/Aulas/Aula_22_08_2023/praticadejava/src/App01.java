import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][];
        matriz = new int[3][];

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

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("matriz[%d][%d] = %d\t", l, c, matriz[l][c]);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

    }
}
