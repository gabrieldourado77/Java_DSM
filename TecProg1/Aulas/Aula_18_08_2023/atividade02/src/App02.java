import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float nota4 = 0;
        float mediaFinal = 0;

        System.out.println("------------------------------------");
        System.out.println("Digite as notas do aluno:");
        System.out.println("------------------------------------");
        System.out.print("1a nota: ");
        nota1 = sc.nextFloat();
        System.out.print("2a nota: ");
        nota2 = sc.nextFloat();
        System.out.print("3a nota: ");
        nota3 = sc.nextFloat();
        System.out.print("4a nota: ");
        nota4 = sc.nextFloat();
        sc.close();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4; 

        System.out.println("------------------------------------");
        System.out.print("O aluno foi ");
        
        if(mediaFinal >= 7){
            System.out.println("aprovado");
        }
        else{
            System.out.println("reprovado");
        }

        System.out.println("------------------------------------");
        System.out.println("Média final: "+mediaFinal);
        System.out.println("------------------------------------");

    }
}
