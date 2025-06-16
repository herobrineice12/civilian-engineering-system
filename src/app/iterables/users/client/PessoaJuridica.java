package app.iterables.users.client;

import app.cfg.SwitchState;
import app.iterables.users.Pessoa;

public class PessoaJuridica extends Pessoa {
    private String nomeEmpresa, cnpj, enderecoEmpresa, projetoContratado;

    public PessoaJuridica(String nome, String nomeEmpresa, String cnpj, String email, String senha, String telefoneEmpresa, String enderecoEmpresa, String projetoContratado) {
        super(nome, email, senha, telefoneEmpresa, SwitchState.OFF, SwitchState.OFF);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.enderecoEmpresa = enderecoEmpresa;
        this.projetoContratado = projetoContratado;
    }

    public String getNome() {
        return nomeEmpresa;
    }
    
    public String getCNPJ() {
        return cnpj;
    }
    
    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }
    
    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }
    
    public String getProjetoContratado() {
        return projetoContratado;
    }
    
    public void setNome(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setProjetoContratado(String projetoContratado) {
        this.projetoContratado = projetoContratado;
    }
}