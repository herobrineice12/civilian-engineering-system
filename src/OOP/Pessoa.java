package OOP;

public class Pessoa {
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}