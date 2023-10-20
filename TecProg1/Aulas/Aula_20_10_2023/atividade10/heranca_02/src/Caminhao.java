public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, int ano, int eixos){
        this.setPlaca(placa);
        this.setAno(ano);
        this.eixos = eixos;
    }

    public int getEixos(){
        return this.eixos;
    }

    public void setEixos(int eixos){
        this.eixos = eixos;
    }

    public void exibirDados(){
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Eixos: " + this.getEixos());
    }

}
