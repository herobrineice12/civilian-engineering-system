package app;

import java.util.Scanner;

public class InterfaceUsuario {
    private final Scanner sc;

    public InterfaceUsuario() {
        sc = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\n==== MENU ====");
        System.out.println("1 - Incluir");
        System.out.println("2 - Consultar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Listar");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    public int lerTipoPessoa() {
        System.out.print("Tipo (1-Física, 2-Jurídica): ");
        return sc.nextInt();
    }

    public String lerNome() {
        sc.nextLine(); // limpa buffer
        System.out.print("Nome: ");
        return sc.nextLine();
    }

    public String lerCpf() {
        System.out.print("CPF: ");
        return sc.nextLine();
    }

    public String lerCnpj() {
        System.out.print("CNPJ: ");
        return sc.nextLine();
    }

    public int lerId(String mensagem) {
        System.out.print(mensagem);
        return sc.nextInt();
    }

    public String lerNovoNome() {
        sc.nextLine();
        System.out.print("Novo nome: ");
        return sc.nextLine();
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public void fecharScanner() {
        sc.close();
    }
}