public class Circulo extends Figura {
    
    private double raio;

    public Circulo(double raio, String cor){
        this.raio = raio;
        this.setCor(cor);
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public double area(){
        return 3.14159 * this.raio * this.raio;
    }

    public double getDiametro(){
        return 2 * raio;
    }

    public String toString(){
        String msg = "Círculo" +
            "\nRaio: " + this.raio + 
            "\nDiâmetro: " + this.getDiametro() +
            "\nÁrea: " + this.area() +
            "\nCor: " + this.getCor();
        
        return msg;
    }

}
