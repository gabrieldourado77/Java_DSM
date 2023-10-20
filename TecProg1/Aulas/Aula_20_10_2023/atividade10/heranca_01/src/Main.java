public class Main {
    
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Gerente g = new Gerente();

        f.setNome("Gabriel Dourado");
        f.setCPF("123.456.789-0");
        f.setSalario(2500);

        System.out.println("Nome: " + f.getNome());
        System.out.println("CPF: " + f.getCPF());
        System.out.println("Salário: " + f.getSalario());
        System.out.println("Verificação: " + g.autentica(123));

    }

}
