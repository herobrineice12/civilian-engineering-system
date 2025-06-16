package app.iterables.service;

import java.util.Date;
import java.util.List;

import app.iterables.Cadastravel;
import app.iterables.users.Pessoa;
import app.iterables.users.staff.Funcionario;

public class Obra implements Cadastravel {
    private int id;
    private String nome, endereco, status;
    private Date dataInicio, dataFim;
    private Pessoa cliente;
    private List<Funcionario> funcionarios;

    public Obra(int id, String nome, String endereco, Date dataInicio, Date dataFim, String status, Pessoa cliente, List<Funcionario> funcionarios) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.cliente = cliente;
        this.funcionarios = funcionarios;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Obra: " + nome + ", Endereço: " + endereco + ", Cliente: " + cliente.getNome() +
               ", Início: " + dataInicio + ", Fim: " + dataFim + ", Status: " + status;
    }

    public void cadastrar() { /* implementação futura */ }
    public void editar() { /* implementação futura */ }
    public void excluir() { /* implementação futura */ }
    public void listar() { /* implementação futura */ }
}

