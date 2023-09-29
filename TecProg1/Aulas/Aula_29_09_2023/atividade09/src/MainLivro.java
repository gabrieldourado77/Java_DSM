public class MainLivro {
    
    public static void main(String[] args) throws Exception {

        String titulo;
        String autor;

        Livro livro1 = new Livro("Desastre Natural","George Smith", 2023);

        titulo = livro1.getTituloLivro();
        livro1.setAutorLivro("Michael Smith");
        autor = livro1.getAutorLivro();

        System.out.println("Título do Livro: " + titulo);
        System.out.println("Autor: " + autor);

    }

}
