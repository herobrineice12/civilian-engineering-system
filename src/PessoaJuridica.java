package OOP;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
    }
}