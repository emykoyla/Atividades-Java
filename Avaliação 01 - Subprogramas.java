import java.util.Scanner;

public class Main {
    static final byte MAX_USUARIOS = 100;
    static String[][] usuario = new String[MAX_USUARIOS][4];
    static int totalUsuarios = 0;
    static boolean autorizaOpcaoMenu = false;
    static Scanner entradaDados = new Scanner(System.in);

    public static void main(String[] args) {
        byte opcao;

        do {
            exibirMenu();
            opcao = entradaDados.nextByte();

            switch (opcao) {
                case 1:
                    cadastroUsuarios();
                    autorizaOpcaoMenu = true;
                    break;
                case 2:
                    if (!autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    } else {
                        imprimirTodos();
                    }
                    break;
                case 3:
                    if (!autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    } else {
                        imprimirCategoria();
                    }
                    break;
                case 4:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 4);
    }

    public static void exibirMenu() {
        System.out.println("1 - Cadastro de usuários");
        System.out.println("2 - Imprimir todos os usuários");
        System.out.println("3 - Imprimir por tipo de usuário");
        System.out.println("4 - Sair do sistema");
        System.out.println("Digite a opção desejada: ");
    }

    public static void cadastroUsuarios() {
        if (totalUsuarios < MAX_USUARIOS) {
            System.out.println("Digite a conta do login: ");
            String contaLogin = entradaDados.next();
            System.out.println("Digite o seu nome de usuário: ");
            String nomeUsuario = entradaDados.next();
            System.out.println("Digite sua senha de usuário: ");
            String senhaUsuario = entradaDados.next();
            System.out.println("Digite o tipo de usuário (PF para Pessoa Fisíca e PJ para Pessoa Jurídica): ");
            String tipoUsuario;
            do {
                tipoUsuario = entradaDados.next();
                if (!tipoUsuario.equals("PF") && !tipoUsuario.equals("PJ")) {
                    System.out.println("Digitação incorreta. Tente novamente");
                }
            } while (!tipoUsuario.equals("PF") && !tipoUsuario.equals("PJ"));
            usuario[totalUsuarios][0] = contaLogin;
            usuario[totalUsuarios][1] = nomeUsuario;
            usuario[totalUsuarios][2] = senhaUsuario;
            usuario[totalUsuarios][3] = tipoUsuario;
            totalUsuarios++;

            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Limite de usuários atingido");
        }
    }

    public static void imprimirTodos() {
        System.out.println("Lista de todos os usuários: ");
        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println("Conta de login: " + usuario[i][0]);
            System.out.println("Nome do usuário: " + usuario[i][1]);
            System.out.println("Senha do usuário: " + usuario[i][2]);
            System.out.println("Tipo de usuário: " + usuario[i][3]);
            System.out.println("--------------------------------------");
        }
    }

    public static void imprimirCategoria() {
        System.out.println("Digite a categoria desejada (PF ou PJ): ");
        String tipoUsuario;
        do {
            tipoUsuario = entradaDados.next();
            if (!tipoUsuario.equals("PF") && !tipoUsuario.equals("PJ")) {
                System.out.println("Digitação incorreta. Tente novamente");
            }
        } while (!tipoUsuario.equals("PF") && !tipoUsuario.equals("PJ"));
        System.out.println("Lista de usuários do tipo " + tipoUsuario + ":");
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuario[i][3].equalsIgnoreCase(tipoUsuario)) {
                System.out.println("Conta de login: " + usuario[i][0]);
                System.out.println("Nome do usuário: " + usuario[i][1]);
                System.out.println("Senha do usuário: " + usuario[i][2]);
            }
        }
    }
}
