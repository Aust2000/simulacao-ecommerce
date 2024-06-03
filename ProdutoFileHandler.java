import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class ProdutoFileHandler {
    public static List<Produto> lerProdutos(String caminhoArquivo) {
        List<Produto> listaProdutos = new ArrayList<Produto>();

        BufferedReader buffer = pegarBufferArquivo(caminhoArquivo);

        String stringDeInformacoesDeProduto;
        try {
            while ((stringDeInformacoesDeProduto = buffer.readLine()) != null) {
                listaProdutos.add(criarProdutoDeStringDeInformações(stringDeInformacoesDeProduto));
            }
        } catch (Exception e) {
            System.err.println("Erro de E/S");
        }

        return listaProdutos;
    }

    private static BufferedReader pegarBufferArquivo(String caminhoArquivo) {
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(caminhoArquivo));
        } catch (Exception e) {
            System.err.println("Arquivo não encontrado");
        }

        return buffer;
    }

    private static Produto criarProdutoDeStringDeInformações(String informacoesString) {
        String nomeProduto;
        String descricaoProduto;
        double precoProduto;
        int estoqueProduto;

        String[] informacoesVetor;
        informacoesVetor = informacoesString.split(",");
        nomeProduto = informacoesVetor[0];
        descricaoProduto = informacoesVetor[1];
        precoProduto = Double.parseDouble(informacoesVetor[2]);
        estoqueProduto = Integer.parseInt(informacoesVetor[3]);

        return new Produto(nomeProduto, descricaoProduto, precoProduto, estoqueProduto);
    }
}