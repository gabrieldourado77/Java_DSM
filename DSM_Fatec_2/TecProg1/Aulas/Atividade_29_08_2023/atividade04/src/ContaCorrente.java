import java.util.Scanner;

public class ContaCorrente {

    private String numeroConta = "";
    private String nomeCliente = "";
    private String numeroCPFCliente = "";
    private float saldoConta = 0.0f;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("--------------------------------------------");
        System.out.println("Informe os dados da conta corrente:");
        System.out.println("--------------------------------------------");

        System.out.print("Nome do cliente: ");
        contaCorrente.nomeCliente = sc.nextLine();
        System.out.print("Número da conta: ");
        contaCorrente.numeroConta = sc.nextLine();
        System.out.print("CPF: ");
        contaCorrente.numeroCPFCliente = sc.nextLine();
        System.out.print("Saldo disponível: ");
        contaCorrente.saldoConta = sc.nextFloat();

        sc.close();
        
        System.out.println("--------------------------------------------");
        System.out.println("Informações da Conta");
        System.out.println("--------------------------------------------");

        System.out.println("Nome do cliente: " + contaCorrente.nomeCliente);
        System.out.println("Número da conta: " + contaCorrente.numeroConta);
        System.out.println("CPF: " + contaCorrente.numeroCPFCliente);
        System.out.println("Saldo disponível: " + contaCorrente.saldoConta);
        System.out.println("--------------------------------------------");

        contaCorrente.mostrarNomeCliente();
        contaCorrente.mostrarNumeroConta();

        System.out.println("--------------------------------------------");

    }

    public void mostrarNomeCliente(){
        System.out.println("Nome do cliente: " + this.nomeCliente);
    }

    public void mostrarNumeroConta(){
        System.out.println("Número da conta: " + this.numeroConta);
    }
   
}
