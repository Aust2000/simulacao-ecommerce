import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int ultimoIdNaoUtilizado = 1;
    
    private int idPedido;
    private String status;
    private List<Item> itens = new ArrayList<>();

    public Pedido(Produto produto, int quantidadeProdutoInicial) {
        idPedido = ultimoIdNaoUtilizado;
        ultimoIdNaoUtilizado++;

        status = "Aberto";

        itens.add(new Item(produto, quantidadeProdutoInicial));
    }


    public int getId() {
        return idPedido;
    }

    public String getStatus() {
        return status;
    }


    // implementar testes para ver se o status atualizado é valido
    public String atualizarStatus(String status) {
        this.status = status;
        return status;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new Item(produto, quantidade)); 
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (int i = 0; i < itens.size(); i++) {
            valorTotal += itens.get(i).calcularSubtotal();
        }
        return valorTotal;
    }


    @Override
    public String toString() {
        String resultado = "Id: " + idPedido + "\n" + 
                           "Status: " + status + "\n" +
                           "Valor total: " + calcularValorTotal() + "\n" +
                           "Itens: ";
        for (int i = 0; i < itens.size(); i++) {
            resultado += "\n- ";
            resultado += itens.get(i) + "\n";
        }
        
        return resultado;
    }
}