public class Aluno {
    
    private String nomeAluno;
    private String raAluno;

    public String getNomeAluno(){
        return this.nomeAluno;
    }

    public void setNomeAluno(String nome){
        this.nomeAluno = nome;
    }

    public String getRAAluno(){
        return this.raAluno;
    }

    public void setRAAluno(String ra){
        this.raAluno = ra;
    }

    @Override
    public String toString() {
        return "Aluno [nomeAluno=" + nomeAluno + ", raAluno=" + raAluno + "]";
    }

    

}
