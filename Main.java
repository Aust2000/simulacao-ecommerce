import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaDeProdutos = ProdutoFileHandler.lerProdutos("./produtos.txt");
        for (Produto produto : listaDeProdutos) {
            System.err.println(produto);
        }

        Pessoa felipe = new PessoaFisica("Felipe", 18, "Rua Tietê 71 Vila Celeste", "12345678901", "1234567890");
        felipe.criarConta(9500, "felipeuberaba10@gmail.com");
        Pessoa colegioOpcao = new PessoaJuridica("Colégio Opção", 29, "Rua dos Eucaliptos", "12345678901234");
        System.out.println(felipe);
        System.out.println();
        System.out.println(colegioOpcao);
        System.out.println();

        felipe.getConta().adicionarSaldo(500);
        System.out.println(felipe.getConta());
        System.out.println();

        felipe.getConta().criarPedido(listaDeProdutos.get(0), 1);
        felipe.getConta().getPedido().adicionarItem(listaDeProdutos.get(1), 1);
        felipe.getConta().getPedido().adicionarItem(listaDeProdutos.get(2), 2);
        felipe.getConta().getPedido().adicionarItem(listaDeProdutos.get(3), 2);
        System.out.println(felipe.getConta().getPedido());
        System.out.println();

        felipe.getConta().concluirPedido();
        System.out.println(felipe.getConta());
        System.out.println();
    }
    
}