public class Veiculo {

    private String placa;
    private int ano;


    public Veiculo(){
    }

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setAno(String ano){
        this.ano = Integer.parseInt(ano);
    }

    public void exibirDados(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
    }

}
