public class Triangulo extends Figura {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        this.setCor(cor);
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public double area(){
        return (this.base + this.altura) / 2;
    }

    public String toString(){
        String msg = "Triângulo" + 
            "Base: " + this.base +
            "Altura: " + this.altura + 
            "Área: " + this.area();

        return msg;
    }

}
