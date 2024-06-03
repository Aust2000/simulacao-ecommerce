public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;


    public PessoaFisica(String nome, int idade, String endereco, String cpf, String rg) {
        super(nome, idade, endereco);
        this.cpf = cpf;
        formatarCpf();
        this.rg = rg;
        formatarRg();   
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
        formatarCpf();
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
        formatarRg();
    }

    public String getRg() {
        return rg;
    }


    private void formatarCpf() {
        if (cpf.charAt(3) != '.') {
            cpf = inserirCaractere(cpf, '.', 3);
        }
        if (cpf.charAt(7) != '.') {
            cpf = inserirCaractere(cpf, '.', 7);
        }
        if (cpf.charAt(11) != '-') {
            cpf = inserirCaractere(cpf, '-', 11);
        }
    }

    private void formatarRg() {
        if (rg.charAt(2) != '.') {
            rg = inserirCaractere(rg, '.', 2);
        }
        if (rg.charAt(6) != '.') {
            rg = inserirCaractere(rg, '.', 6);
        }
        if (rg.charAt(10) != '-') {
            rg = inserirCaractere(rg, '-', 10);
        }
    }
    
    // esse método está quebrando o princípio da responsabilidade única
    private String inserirCaractere(String string, char caractere, int index) {
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
               "IdConta: " + super.getConta().getId() + "\n" +
               "CPF: " + cpf + "\n" + 
               "RG: " + rg;
    }
}