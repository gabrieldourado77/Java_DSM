public class Main {
    
    public static void main(String[] args) throws Exception {

        Circulo c = new Circulo(5, "vermelho");
        Triangulo t = new Triangulo(5, 4, "amarelo");
        Retangulo r = new Retangulo(4, 3, "roxo");
        Quadrado q = new Quadrado(4, "branco");

        System.out.println("---------------------------------");
        System.out.println("Cor do Círculo: " + c.getCor());
        System.out.println("Cor do Triângulo: " + t.getCor());
        System.out.println("Cor do Retângulo: " + r.getCor());
        System.out.println("Cor do Quadrado: " + q.getCor());
        System.out.println("---------------------------------");

    }

}
