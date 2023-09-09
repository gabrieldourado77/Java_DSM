import java.util.Scanner;
import java.text.DecimalFormat;

public class Funcionario {

    private String nome = "";
    private double salarioBruto = 0.0;
    private double salarioLiquido = 0.0;
    private double salarioAumentado = 0.0;
    private double desconto = 0.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("#.##");      

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Desconto: ");
        func.desconto = sc.nextDouble();

        func.calcularSalarioLiquido();
        func.salarioLiquido = Double.valueOf(df1.format(func.salarioLiquido));

        System.out.println("Dados do Funcionário: " + func.nome + ", R$ " + func.salarioLiquido);
        
        System.out.print("Deseja aumentar o salário em qual porcentagem? ");
        func.aumentarSalario(sc.nextDouble());

        sc.close();

    }

    public double calcularSalarioLiquido(){

        this.salarioLiquido = this.salarioBruto - this.desconto;
        return this.salarioLiquido;

    }

    public void aumentarSalario(double porcentagem){

        DecimalFormat df2 = new DecimalFormat("#.##");    

        this.salarioAumentado = this.salarioBruto + (this.salarioBruto * (porcentagem / 100));
        this.salarioAumentado = Double.valueOf(df2.format(this.salarioAumentado));

        System.out.println("Dados do Funcionário: " + this.nome + ", R$ " + this.salarioAumentado);

    }

}
