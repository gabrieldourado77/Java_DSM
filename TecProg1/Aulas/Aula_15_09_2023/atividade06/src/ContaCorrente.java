import java.text.DecimalFormat;

public class ContaCorrente {

    private String nomeCorrentista = " ";
    private String sexoCorrentista = " ";
    private int idadeCorrentista = 0;
    private String numeroConta = " ";
    private String flagTipoConta = " ";
    private float saldoConta = 0.00f;

    DecimalFormat df = new DecimalFormat("#.##");

    public String getNomeCorrentista(){
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nome){
        this.nomeCorrentista = nome;
    }

    public String getSexoCorrentista(){
        return sexoCorrentista;
    }

    public void setSexoCorrentista(String sexo){
        this.sexoCorrentista = sexo;
    }

    public int getIdadeCorrentista(){
        return idadeCorrentista;
    }

    public void setIdadeCorrentista(int idade){
        this.idadeCorrentista = idade;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numero){
        this.numeroConta = numero;
    }

    public String getFlagTipoConta(){
        return flagTipoConta;
    }

    public void setFlagTipoConta(String flag){
        this.flagTipoConta = flag;
    }

    public float getSaldoConta(){
        return saldoConta;
    }

    public void setSaldoConta(float saldo){
        this.saldoConta = saldo;
    }

    public float realizarSaque(float valor){

        if(this.saldoConta > 0){
            this.saldoConta = this.saldoConta - valor;
        }

        return this.saldoConta;
    }

    public void consultarSaldo(){

        this.saldoConta = Float.valueOf(df.format(this.saldoConta));

        System.out.println("Nome: " + this.nomeCorrentista);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Conta Conjunta: " + this.flagTipoConta);
        System.out.println("Saldo Disponível: " + this.saldoConta);
        
    }

    public void realizarDeposito(float deposito){
        this.saldoConta = this.saldoConta + deposito;
    }

}
