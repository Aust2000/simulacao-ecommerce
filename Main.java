public class Main {
    public static void main(String[] args) {
        Produto processador = new Produto("Processador", "Processador Intel Core i3 10 Geração", 379.99, 4);
        Produto placaDeVideo = new Produto("Placa de Vídeo", "Placa de Vídeo Nvidea GTX 1050 Ti", 849.99, 2);
        Produto memoria = new Produto("Memoria RAM", "Memória RAM Corsair Vengance 32GB",  959.99, 13);
        Produto hd = new Produto("HD", "HD Toshiba Surveillance 2TB", 449.99, 10);
        System.out.println(processador);
        System.out.println();
        System.out.println(placaDeVideo);
        System.out.println();
        System.out.println(memoria);
        System.out.println();
        System.out.println(hd);
        System.out.println();

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

        felipe.getConta().criarPedido(processador, 1);
        felipe.getConta().getPedido().adicionarItem(placaDeVideo, 1);
        felipe.getConta().getPedido().adicionarItem(hd, 2);
        felipe.getConta().getPedido().adicionarItem(memoria, 2);
        System.out.println(felipe.getConta().getPedido());
        System.out.println();

        felipe.getConta().concluirPedido();
        System.out.println(felipe.getConta());
        System.out.println();
    }
    
}