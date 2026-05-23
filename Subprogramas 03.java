import java.util.Scanner;

public class Main {

    static String[][] produtos = new String[100][4];
    static boolean autorizaOpcaoMenu = false;
    static short qtdProduto = 0;
    static String nomeProduto, verificaCategoria = "";
    static boolean continuaCadastro, produtosCadastrados = false;
    static Scanner entradaDados = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoMenu;
        do {
            System.out.println("\nMenu ");
            System.out.println("1 – Cadastro de produtos");
            System.out.println("2 – Corrigir o valor de todos os produtos");
            System.out.println("3 – Corrigir o valor por categoria");
            System.out.println("4 – Imprimir todos os produtos");
            System.out.println("5 – Imprimir por categoria");
            System.out.println("6 – Sair do sistema");
            System.out.println("Entre com a opção desejada: ");
            opcaoMenu = entradaDados.nextInt();
            entradaDados.nextLine();

            switch (opcaoMenu) {
                case 1:
                    cadastraProduto();
                    autorizaOpcaoMenu = true;
                    break;
                case 2, 3:
                    if (!autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    } else {
                        corrigeValor(opcaoMenu);
                    }
                    break;
                case 4, 5:
                    if (!autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    } else {
                        imprimeProdutos(opcaoMenu);
                    }
                    break;
                case 6:
                    System.out.println("O sistema será encerrado.");
                    break;
                default:
                    System.out.println("Opção Inválida!\nTecle Enter para continuar.");
                    entradaDados.nextLine();
            }
        } while (opcaoMenu != 6);
    }

    public static void cadastraProduto() {
        for (; qtdProduto < produtos.length; qtdProduto++) {
            System.out.println("Digite o nome do produto ou tecle enter para terminar o cadastro de produtos : ");
            nomeProduto = entradaDados.nextLine();
            if (nomeProduto.isEmpty()) {
                continuaCadastro = false;
                break;
            } else {
                produtos[qtdProduto][0] = nomeProduto;
                System.out.println("Digite o código do produto : ");
                produtos[qtdProduto][1] = entradaDados.nextLine();
                produtos[qtdProduto][2] = verificaCategoria();
                System.out.println("Digite o valor do produto : ");
                produtos[qtdProduto][3] = entradaDados.nextLine();
                produtosCadastrados = true;
            }
        }
    }

    public static void corrigeValor(int opcao) {
        float ajuste = 0f;
        System.out.println("Digite o quanto quer corrigir o valor dos produtos (em %% Ex: 5.0 ): ");
        ajuste = entradaDados.nextFloat();
        entradaDados.nextLine();

        if (opcao == 2) {
            for (short i = 0; i < qtdProduto; i++) {
                float valorFinal = Float.parseFloat(produtos[i][3]) * (1 + (ajuste / 100));
                produtos[i][3] = Float.toString(valorFinal);
            }
            System.out.println("Produtos ajustados com sucesso");
        } else if (opcao == 3) {
            verificaCategoria();
            for (short i = 0; i < qtdProduto; i++) {
                if (produtos[i][2].equalsIgnoreCase(verificaCategoria)) {
                    float valorFinal = Float.parseFloat(produtos[i][3]) * (1 + (ajuste / 100));
                    produtos[i][3] = Float.toString(valorFinal);
                }
            }
            System.out.println("Produtos ajustados com sucesso");
        }
    }

    public static void imprimeProdutos(int opcao) {
        if (opcao == 5) {
            String filterCategoria = verificaCategoria();
            imprimeCabecalho();
            for (short i = 0; i < qtdProduto; i++) {
                if (produtos[i][2].equalsIgnoreCase(filterCategoria)) {
                    System.out.printf("%-12s %18s %25s %25s \n", produtos[i][1], produtos[i][0], produtos[i][2], produtos[i][3]);
                }
            }
        } else if (opcao == 4) {
            imprimeCabecalho();
            for (short i = 0; i < qtdProduto; i++) {
                System.out.printf("%-12s %18s %25s %25s \n", produtos[i][1], produtos[i][0], produtos[i][2], produtos[i][3]);
            }
        }
        System.out.println("==============================================================================================================");
    }

    public static String verificaCategoria() {
        System.out.println("Digite a categoria que gostaria de escolher ('P' para perecível e 'N' para não perecível) : ");
        verificaCategoria = entradaDados.nextLine();
        while (!verificaCategoria.equalsIgnoreCase("P") && !verificaCategoria.equalsIgnoreCase("N")) {
            System.out.println("Opção errada. Digite 'P' para perecível e 'N' para não perecível : ");
            verificaCategoria = entradaDados.nextLine();
        }
        return verificaCategoria.toUpperCase();
    }

    public static void imprimeCabecalho() {
        System.out.println("==============================================================================================================");
        System.out.println("Código do Produto        Nome do Produto       Categoria do Produto         Valor do Produto     ");
        System.out.println("==============================================================================================================");
    }
}


