import java.text.DecimalFormat;

public class Aluno {

    private String nomeAluno;
    private String matriculaAluno;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;
    private double mediaAluno;

    public Aluno(){
    }

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){

        this.nomeAluno = nome;
        this.matriculaAluno = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;

    }

    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public String toString() {

        this.nota1 = Double.valueOf(df.format(this.nota1));
        this.nota2 = Double.valueOf(df.format(this.nota2));
        this.mediaAluno = Double.valueOf(df.format(this.mediaAluno));

        return "Nome: " + nomeAluno + 
            "Matrícula: " + matriculaAluno + 
            "Nota 1: " + nota1 + "Nota 2: " + nota2 + 
            "Nota da Reavaliação: " + notaReavaliacao + 
            "Média Final: " + mediaAluno;

    }

    public double calcularMedia(){

        this.mediaAluno = (nota1 + nota2) / 2;
        return this.mediaAluno;

    }

    public double calcularMediaFinal(){

        if(this.mediaAluno >= 6){
            return this.mediaAluno;
        }
        else{
            this.mediaAluno = (this.mediaAluno + this.notaReavaliacao) / 2;
            return this.mediaAluno;
        }

    }

}
