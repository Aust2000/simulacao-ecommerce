public class PessoaJuridica extends Pessoa {
    private String cnpj;


    public PessoaJuridica(String nome, int idade, String endereco, String cnpj) {
        super(nome, idade, endereco);
        this.cnpj = cnpj;
        formatarCnpj();
    }

    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
        formatarCnpj();
    }

    private void formatarCnpj() {
        if (cnpj.charAt(2) != '.') {
            cnpj = inserirCaractereNoCnpj(cnpj, '.', 2);
        }
        if (cnpj.charAt(6) != '.') {
            cnpj = inserirCaractereNoCnpj(cnpj, '.', 6);
        }
        if (cnpj.charAt(10) != '/') {
            cnpj = inserirCaractereNoCnpj(cnpj, '/', 10);
        }
        if (cnpj.charAt(15) != '-') {
            cnpj = inserirCaractereNoCnpj(cnpj, '-', 15);
        }
    }

    // esse método está quebrando o princípio da responsabilidade única
    private String inserirCaractereNoCnpj(String string, char caractere, int index) {
        if (Character.isDigit(string.charAt(index))) {
            return string.substring(0, index) + caractere + string.substring(index, string.length());
        }
        return string.substring(0, index) + caractere + string.substring(index + 1, string.length());
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\n" +
               "Idade: " + super.getIdade() + "\n" +
               "Endereço: " + super.getEndereco() + "\n" +
               "CNPJ: " + cnpj;
    }
}