package app.iterables.users.staff;

import app.cfg.SwitchState;
import app.iterables.users.Pessoa;

public class Administrador extends Pessoa{
    private double salario;
    
    public Administrador(String nome, String email, String senha, String telefone, double salario) {
        super(nome, email, senha, telefone, SwitchState.ON, SwitchState.OFF);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
