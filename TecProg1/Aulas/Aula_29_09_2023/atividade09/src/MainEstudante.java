public class MainEstudante {
    
    public static void main(String[] args) throws Exception {

        Estudante est1 = new Estudante("José", 21, 9.75f, "Aprovado");

        est1.verificarStatus();
        est1.mostrarEstudante();
    }

}
