import java.util.Scanner;

public class Aluno {

    private String nomeAluno;
    private float notaPrimTri;
    private float notaSegTri;
    private float notaTerTri;
    private float mediaMinima = 60;
    private float mediaFinal;
    private String statusAluno;
    private float pontosFaltantes;


    public Aluno(){
    }

    public void calcularMedia(float nota1, float nota2, float nota3){
        this.mediaFinal = nota1 + nota2 + nota3;
    }

    public void verificarStatus(){
        if(this.mediaFinal >= this.mediaMinima){
            this.statusAluno = "APROVADO";
        }
        else{
            this.statusAluno = "REPROVADO";
            this.pontosFaltantes = this.mediaMinima - this.mediaFinal;
        }
    }

    public void mostrarMedia(){
        System.out.println("NOTA FINAL = " + this.mediaFinal);
        System.out.println(this.statusAluno);

        if(this.statusAluno == "REPROVADO"){
            System.out.println("FALTARAM " + this.pontosFaltantes + " PONTOS");   
        }
    }


    public static void main(String[] args) {

        Aluno a = new Aluno();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        a.nomeAluno = sc.nextLine();
        System.out.print("Nota do 1o trimestre: ");
        a.notaPrimTri = sc.nextFloat();
        System.out.print("Nota do 2o trimestre: ");
        a.notaSegTri = sc.nextFloat();
        System.out.print("Nota do 3o trimestre: ");
        a.notaTerTri = sc.nextFloat();

        sc.close();

        a.calcularMedia(a.notaPrimTri, a.notaSegTri, a.notaTerTri);
        a.verificarStatus();
        a.mostrarMedia();

    }

}
