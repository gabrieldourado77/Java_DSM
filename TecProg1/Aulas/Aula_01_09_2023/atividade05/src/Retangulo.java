import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Retangulo {

    private double largura = 0;
    private double altura = 0;
    private double area = 0;
    private double perimetro = 0;
    private double diagonal = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");      

        Retangulo ret = new Retangulo();

        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        sc.close();

        ret.calcularArea();
        ret.calcularPerimetro();
        ret.calcularDiagonal();

        ret.area = Double.valueOf(df.format(ret.area));
        ret.perimetro = Double.valueOf(df.format(ret.perimetro));
        ret.diagonal = Double.valueOf(df.format(ret.diagonal));

        System.out.println("AREA = " + ret.area);
        System.out.println("PERIMETRO = " + ret.perimetro);
        System.out.println("DIAGONAL = " + ret.diagonal);

    }

    public double calcularArea(){
        this.area = this.largura * this.altura;
        return this.area;
    }

    public double calcularPerimetro(){
        this.perimetro = (this.largura + this.altura) * 2;
        return this.perimetro;
    }

    public double calcularDiagonal(){
        this.diagonal = Math.sqrt((Math.pow(this.largura, 2)) + (Math.pow(this.altura, 2)));
        return this.diagonal;
    }

}
