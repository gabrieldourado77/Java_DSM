public class Quadrado extends Retangulo {

    public Quadrado(double lado, String cor){
        this.setLado1(lado);
        this.setCor(cor);
    }

    public String toString(){
        String msg = "Quadrado" +
            "\nLado: " + this.getLado1() + 
            "\nCor: " + this.getCor();

        return msg;
    }

}
