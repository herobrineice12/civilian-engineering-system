package OOP;

import java.util.ArrayList;

public class SistemaCRUD {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static int contadorId = 1;
    private static InterfaceUsuario ui = new InterfaceUsuario();

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = ui.exibirMenu();

            switch (opcao) {
                case 1 -> incluir();
                case 2 -> consultar();
                case 3 -> alterar();
                case 4 -> excluir();
                case 5 -> listar();
                case 0 -> ui.exibirMensagem("Encerrando...");
                default -> ui.exibirMensagem("Opção inválida.");
            }
        } while (opcao != 0);

        ui.fecharScanner();
    }

    private static void incluir() {
        int tipo = ui.lerTipoPessoa();
        String nome = ui.lerNome();

        if (tipo == 1) {
            String cpf = ui.lerCpf();
            pessoas.add(new PessoaFisica(contadorId++, nome, cpf));
        } else if (tipo == 2) {
            String cnpj = ui.lerCnpj();
            pessoas.add(new PessoaJuridica(contadorId++, nome, cnpj));
        } else {
            ui.exibirMensagem("Tipo inválido.");
        }
    }

    private static void consultar() {
        int id = ui.lerId("Digite o ID: ");
        for (Pessoa p : pessoas) {
            if (p.getId() == id) {
                p.exibirDados();
                return;
            }
        }
        ui.exibirMensagem("Pessoa não encontrada.");
    }

    private static void alterar() {
        int id = ui.lerId("Digite o ID para alterar: ");
        for (Pessoa p : pessoas) {
            if (p.getId() == id) {
                String novoNome = ui.lerNovoNome();
                p.setNome(novoNome);
                ui.exibirMensagem("Nome alterado com sucesso.");
                return;
            }
        }
        ui.exibirMensagem("Pessoa não encontrada.");
    }

    private static void excluir() {
        int id = ui.lerId("Digite o ID para excluir: ");
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == id) {
                pessoas.remove(i);
                ui.exibirMensagem("Pessoa removida com sucesso.");
                return;
            }
        }
        ui.exibirMensagem("Pessoa não encontrada.");
    }

    private static void listar() {
        if (pessoas.isEmpty()) {
            ui.exibirMensagem("Nenhum registro.");
        } else {
            for (Pessoa p : pessoas) {
                p.exibirDados();
                System.out.println("------------");
            }
        }
    }
}