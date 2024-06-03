public class Item {
    private static int ultimoIdNaoUtilizado = 1;
    
    private int idItem;
    private int quantidade;
    private Produto produto;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    
    public int getId() {
        return idItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void mudarQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }


    @Override
    public String toString() {
        return produto.getNome() + " x " + quantidade;
    }
}