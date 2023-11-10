public class Produto {

    private int codProduto;
    private int quantProdutos;
    
    public Produto(int codProduto, int quantProdutos) {
        this.codProduto = codProduto;
        this.quantProdutos = quantProdutos;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantProdutos() {
        return quantProdutos;
    }

    public void setQuantProdutos(int quantProdutos) {
        this.quantProdutos = quantProdutos;
    }

    @Override
    public String toString() {
        return "Código: " + this.codProduto + " - Quantidade: " + quantProdutos + "\n";
    }

}
