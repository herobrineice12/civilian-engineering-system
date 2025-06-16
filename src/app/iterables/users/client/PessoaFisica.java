package app.iterables.users.client;

import app.cfg.SwitchState;
import app.iterables.users.Pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf, endereco, projetoContratado;

    public PessoaFisica(String nome, String cpf, String email, String senha, String telefone, String endereco, String projetoContratado) {
        super(nome, email, senha, telefone, SwitchState.OFF, SwitchState.OFF);
        this.cpf = cpf;
        this.endereco = endereco;
        this.projetoContratado = projetoContratado;
    }

    public String getCPF() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getProjetoContratado() {
        return projetoContratado;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setProjetoContratado(String projetoContratado) {
        this.projetoContratado = projetoContratado;
    }
}