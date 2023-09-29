public class MainProduto {
    
    public static void main(String[] args) throws Exception {

        String nome;
        float preco;
        int quantEstoque;
        float valorEstoque;

        Produto prod1 = new Produto("Pão", 0.70f, 15, 10.50f);

        nome = prod1.getNomeProduto();
        prod1.setPrecoUnitario(0.50f);
        preco = prod1.getPrecoUnitario();

        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço: R$ " + preco);

        quantEstoque = prod1.getQuantEstoque();

        System.out.println("Quantidade: " + quantEstoque);

        prod1.adicionarNoEstoque(15, 2);
        quantEstoque = prod1.getQuantEstoque();

        System.out.println("Quantidade (+2): " + quantEstoque);

        prod1.removerDoEstoque(15, 4);
        quantEstoque = prod1.getQuantEstoque();

        System.out.println("Quantidade (-4): " + quantEstoque);

        valorEstoque = prod1.getValorEstoque();

        System.out.println("Valor do Estoque: R$ " + valorEstoque);

    }

}
