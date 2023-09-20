import java.util.Scanner;

public class App02 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String nomes[] = new String[5];
        int idades[] = new int[5];
        float alturas[] = new float[5];
        float pesos[] = new float[5];
        float imc[] = new float[5];

        for(int i=0; i <= 4; i++){
            System.out.println("------------------------");
            System.out.println((i+1)+"a. pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextFloat();
            System.out.print("Peso: ");
            pesos[i] = sc.nextFloat();

            imc[i] = pesos[i] / (alturas[i] * alturas[i]);

            sc.nextLine();
        }

        for(int i=0; i <= 4; i++){
            System.out.println("----------------------------------------------");
            System.out.println("Dados da "+(i+1)+"a. pessoa");
            System.out.println(nomes[i]+" - "+idades[i]+" anos - "+"IMC: "+imc[i]+" kg/m2");
        }

        System.out.println("----------------------------------------------");

    }

}
