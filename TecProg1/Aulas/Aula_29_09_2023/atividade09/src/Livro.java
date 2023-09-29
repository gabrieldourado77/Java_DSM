public class Livro {

    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int ano){
        this.tituloLivro = titulo;
        this.autorLivro = autor;
        this.anoPublicacao = ano;
    }

    public String getTituloLivro(){
        return tituloLivro;
    }

    public String getAutorLivro(){
        return autorLivro;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setTituloLivro(String titulo){
        this.tituloLivro = titulo;
    }

    public void setAutorLivro(String autor){
        this.autorLivro = autor;
    }

    public void setAnoPublicacao(int ano){
        this.anoPublicacao = ano;
    }

}
