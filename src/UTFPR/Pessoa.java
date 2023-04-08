package UTFPR;

public class Pessoa {

    private int cpf;
    private String nome;

    private Endereco endereco = new Endereco();

    public Pessoa() {

    }

    public Pessoa(int cpf, String nome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nPessoa Registrada:\n" +
                "CPF: " + cpf +
                "\n" + "NOME: " + nome +
                "\n" + "ENDEREÇO: " + "Rua " + getEndereco().getRua() + ", nº" + getEndereco().getNum() +", "
                + getEndereco().getRegiao().getCidade() + " - " + getEndereco().getRegiao().getUf() + " - " + getEndereco().getRegiao().getCodReg();
    }
}
