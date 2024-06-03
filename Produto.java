public class Produto {
    private static int ultimoIdNaoUtilizado = 1;
    
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;


    public Produto(String nome, String descricao, double preco, int estoqueInicial) {
        idProduto = ultimoIdNaoUtilizado;
        ultimoIdNaoUtilizado++;
        
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        estoque = estoqueInicial;
    }


    public int getId() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        estoque -= quantidade;
    }


    @Override
    public String toString() {
        return "Id: " + idProduto + "\n" +
               "Nome: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Preço: " + preco + "\n" +
               "Quantidade no Estoque: " + estoque;
    }
}