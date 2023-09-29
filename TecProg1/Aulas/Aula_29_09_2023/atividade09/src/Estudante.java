public class Estudante {

    private String nomeEstudante;
    private int idadeEstudante;
    private float mediaNotas;
    private String statusEstudante;

    public Estudante(String nome, int idade, float media, String status){
        this.nomeEstudante = nome;
        this.idadeEstudante = idade;
        this.mediaNotas = media;
        this.statusEstudante = status; 
    }

    public String getNomeEstudante(){
        return nomeEstudante;
    }

    public int getIdadeEstudante(){
        return idadeEstudante;
    }

    public float getMediaNotas(){
        return mediaNotas;
    }

    public String getStatusEstudante(){
        return statusEstudante;
    }

    public void setNomeEstudante(String nome){
        this.nomeEstudante = nome;
    }

    public void setIdadeEstudante(int idade){
        this.idadeEstudante = idade;
    }

    public void setMediaNotas(float media){
        this.mediaNotas = media;
    }

    public void setStatusEstudante(String status){
        this.statusEstudante = status;
    }

    public void mostrarEstudante(){
        System.out.println("Nome: " + this.nomeEstudante);
        System.out.println("Idade: " + this.idadeEstudante);
        System.out.println("Média: " + this.mediaNotas);
        System.out.println("Nome: " + this.nomeEstudante);
        System.out.println("Status: " + this.statusEstudante);
    }


    public void verificarStatus(){
        if(this.mediaNotas >= 7){
            this.statusEstudante = "Aprovado";
        }
        else{
            this.statusEstudante = "Reprovado";
        }
    }

}
