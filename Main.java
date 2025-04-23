import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pessoa> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== MENU =====\n");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Fazer login");
            System.out.println("0 - Sair");
            System.out.print("\nOpção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    fazerLogin();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("\nEncerrando sistema. Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }

        scanner.close();
    }

    private static void cadastrarUsuario() {
        System.out.println("\n=== Cadastro de Usuário ===\n");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Funcionário");
        System.out.print("Tipo de usuário: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        String telefone;
        while (true) {
            System.out.print("Telefone (somente números): ");
            telefone = scanner.nextLine();
            if (telefone.matches("\\d{8,11}")) break;
            System.out.println("\nTelefone inválido. Digite entre 8 a 11 números.");
        }

        String cpf;
        while (true) {
            System.out.print("CPF (formato 000.000.000-00): ");
            cpf = scanner.nextLine();
            if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) break;
            System.out.println("\nCPF inválido. Formato esperado: 000.000.000-00");
        }

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        switch (tipo) {
            case 1:
                usuarios.add(new Aluno(nome, telefone, cpf, senha, endereco));
                System.out.println("\n=== Aluno cadastrado com sucesso!===\n");
                break;
            case 2:
                usuarios.add(new Professor(nome, telefone, cpf, senha, endereco));
                System.out.println("\n===Professor cadastrado com sucesso!===\n");
                break;
            case 3:
                System.out.print("Salário (use vírgula ou ponto): ");
                String salarioStr = scanner.nextLine().replace(",", ".");
                double salario = Double.parseDouble(salarioStr);

                System.out.print("Departamento (locação): ");
                String locacao = scanner.nextLine();

                System.out.print("Horas trabalhadas: ");
                int horas = scanner.nextInt();
                scanner.nextLine();

                usuarios.add(new Funcionario(nome, telefone, cpf, senha, endereco, salario, locacao, horas));
                System.out.println("\n===Funcionário cadastrado com sucesso!===\n");
                break;
            default:
                System.out.println("Tipo inválido.");
        }
    }

    private static void fazerLogin() {
        System.out.println("\n=== Login de Usuário ===");
        System.out.print("Digite o nome: ");
        String nomeLogin = scanner.nextLine();

        Pessoa usuario = null;
        for (Pessoa p : usuarios) {
            if (p.getNome().equalsIgnoreCase(nomeLogin)) {
                usuario = p;
                break;
            }
        }

        if (usuario == null) {
            System.out.println("\nUsuário não encontrado!");
            return;
        }

        System.out.print("Digite a senha: ");
        String senhaLogin = scanner.nextLine();

        if (usuario.autenticar(senhaLogin)) {
            usuario.realizarLogin();
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
