import java.util.Scanner;

public class App01{
    public static void main(String args[]){
    
        int idades[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 4; i++){
            System.out.print("Digite a "+(i+1)+"o. idade: ");
            idades[i] = sc.nextInt();
        }

        System.out.println("--- Idades informadas ---");

        for(int i = 0; i <= 4; i++){
            System.out.print(idades[i] + "\t");
        }

    }
}