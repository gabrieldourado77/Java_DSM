public class Gerente extends Funcionario {

    private int senha = 1234;

    public boolean autentica(int senha){
        if(senha == this.senha){
            return true;
        }
        else{
            return false;
        }
    }

}
