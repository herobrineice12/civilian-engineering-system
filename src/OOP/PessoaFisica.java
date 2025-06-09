package OOP;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + cpf);
    }
}