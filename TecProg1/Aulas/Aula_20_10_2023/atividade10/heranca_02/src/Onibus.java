public class Onibus extends Veiculo {

    private int assentos;

    public Onibus(String placa, int ano, int assentos){
        this.setPlaca(placa);
        this.setAno(ano);
        this.assentos = assentos;
    }

    public int getAssentos(){
        return this.assentos;
    }

    public void setAssentos(int assentos){
        this.assentos = assentos;
    }

    public void exibirDados(){
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Assentos: " + this.assentos);
    }

}
