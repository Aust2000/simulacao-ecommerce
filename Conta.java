public class Conta {
    public static int ultimoIdNaoUtilizado = 1;
    
    private int idConta;
    private double saldo;
    private String email;
    private Pedido pedido;


    public Conta (double saldoInicial, String email) {
        idConta = ultimoIdNaoUtilizado;
        ultimoIdNaoUtilizado++;

        saldo = saldoInicial;
        this.email = email;
    }

    
    public int getId() {
        return idConta;
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }


    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public double resgatarSaldo(double valor) {
        double temporario;
        if (saldo - valor < 0) {
            temporario = saldo;
            saldo = 0;
            return temporario;
        }
        saldo -= valor;
        return valor;
    }

    public void criarPedido(Produto produto, int quantidade) {
        pedido = new Pedido(produto, quantidade);
    }

    public void concluirPedido() {
        double valorTotal = pedido.calcularValorTotal();
        if (valorTotal > saldo) {
            // adicionar catcher para caso não tenha saldo na conta para realizar o pedido
            return;
        } else {
            saldo -= valorTotal;
            pedido = null;
        }
    }


    @Override
    public String toString() {
        String resultado = "Id: " + idConta + "\n" + 
                           "Saldo: " + saldo + "\n" +
                           "Email: " + email;
        if (pedido != null) {
            resultado += "\n" + "Id Pedido: " + pedido.getId();
        }
        
        return resultado;
    }
    // fazer validação do email
}