public class Produto {
    public static void main(String[] args) {
        ProdutoE banana = new ProdutoE("Banana", 1.1, 13);

        banana.printProduto();
    }
}

public class ProdutoE {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoE(String nomeInicial, double precoInicial, int quantidadeInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        quantidade = quantidadeInicial;
    }

        public void printProduto() {
            System.out.println(nome + ", preço " + preco + ", " + quantidade + " peças");
        }
}
