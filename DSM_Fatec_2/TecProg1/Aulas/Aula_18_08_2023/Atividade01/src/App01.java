import java.util.Scanner;

public class App01 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float numeros[] = new float[2];
        float mult = 0;

        for(int i=0; i < 2; i++){
            System.out.print("Digite o "+(i+1)+"o. número: ");
            numeros[i] = sc.nextFloat();
        }

        mult = numeros[0] * numeros[1];

        System.out.println("Resultado: "+mult);

    }
}
