import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProdutoFileHandler {
    public static List<Produto> lerProdutos(String caminhoArquivo) {
        List<String> linhas = new ArrayList<String>();
        try {
            linhas = Files.readAllLines(Path.of(caminhoArquivo), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Produto> produtos = new ArrayList<Produto>();
        String[] atributosProdutoAtual = new String[5];
        int IdProduto;
        String nomeProduto;
        String descricaoProduto;
        double preco;
        int estoque;
        for (int i = 0; i < linhas.size(); i++) {
            atributosProdutoAtual = linhas.get(i).split(",");

            idProduto = Integer.valueOf(atributosProdutoAtual[0]);
        }

        return produtos;
    }
}