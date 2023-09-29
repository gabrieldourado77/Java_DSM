public class Produto {

    private String nomeProduto;
    private float precoUnitario;
    private int quantEstoque;
    private float valorEstoque;

    public Produto(String nome, float preco, int quant, float valorEstoque){
        this.nomeProduto = nome;
        this.precoUnitario = preco;
        this.quantEstoque = quant;
        this.valorEstoque = valorEstoque;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public float getPrecoUnitario(){
        return precoUnitario;
    }

    public int getQuantEstoque(){
        return quantEstoque;
    }

    public float getValorEstoque(){
        return valorEstoque;
    }

    public void setNomeProduto(String nome){
        this.nomeProduto = nome;
    }

    public void setPrecoUnitario(float preco){
        this.precoUnitario = preco;
    }

    public void setQuantEstoque(int quant){
        this.quantEstoque = quant;
    }

    public void setValorEstoque(float valor){
        this.valorEstoque = valor;
    }

    public float calcularValorEstoque(float preco, int quant){
        this.valorEstoque = preco * quant;
        return valorEstoque;
    }

    public void adicionarNoEstoque(int quantEstoque, int produtos){
        this.quantEstoque = quantEstoque + produtos;
    }

    public void removerDoEstoque(int quantEstoque, int produtos){
        this.quantEstoque = quantEstoque - produtos;
    }

}
