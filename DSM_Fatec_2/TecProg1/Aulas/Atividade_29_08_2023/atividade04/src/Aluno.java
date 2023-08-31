import java.util.Scanner;

public class Aluno {

    private String numeroRA = "";
    private String nomeAluno = "";
    private String enderecoAluno = "";
    private String cursoAluno = "";
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Informe os dados do aluno:");
        System.out.println("-------------------------------------------------------------");

        System.out.print("Nome do aluno: ");
        aluno.nomeAluno = sc.nextLine();
        System.out.print("Número do RA: ");
        aluno.numeroRA = sc.nextLine();
        System.out.print("Endereço: ");
        aluno.enderecoAluno = sc.nextLine();
        System.out.print("Curso: ");
        aluno.cursoAluno = sc.nextLine();

        sc.close();
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Informações do Aluno");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Nome do aluno: " + aluno.nomeAluno);
        System.out.println("Número do RA: " + aluno.numeroRA);
        System.out.println("Endereço: " + aluno.enderecoAluno);
        System.out.println("Curso: " + aluno.cursoAluno);
        System.out.println("-------------------------------------------------------------");

        aluno.mostrarNomeAluno();
        aluno.mostrarNumeroRA();

        System.out.println("-------------------------------------------------------------");

    }

    public void mostrarNomeAluno(){
        System.out.println("Nome do aluno: " + this.nomeAluno);
    }

    public void mostrarNumeroRA(){
        System.out.println("Número do RA: " + this.numeroRA);
    }

}
