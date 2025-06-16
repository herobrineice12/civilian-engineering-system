package app.iterables.users;

import app.cfg.SwitchState;

public abstract class Pessoa {
    private String nome, telefone;
    private SwitchState funcionario, admin;

    public Pessoa(String nome, String email, String senha, String telefone, SwitchState funcionario, SwitchState admin) {
        this.nome = nome;
        this.telefone = telefone;
        this.funcionario = funcionario;
        this.admin = admin;
    }

    public String getNome() { 
        return nome; 
    }
   
    public String getTelefone() { 
        return telefone; 
    }

    public boolean getFuncionário() {
        return funcionario.getSwitch();
    }

    public boolean getAdmin() {
        return admin.getSwitch();
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }
    
    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }

    public void setFuncionario() {
        this.funcionario.toggleSwitch();
    }

    public void setAdmin() {
        this.funcionario.toggleSwitch();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}


