import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final int MAX_ALUNOS = 100;
        int[] matriculas = new int[MAX_ALUNOS];
        String[] nomes = new String[MAX_ALUNOS];
        char[] resultados = new char[MAX_ALUNOS];
        int numAlunosCadastrados = 0;
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1 – Cadastro de Alunos");
            System.out.println("2 – Relatório de todos alunos");
            System.out.println("3 – Relatório de alunos aprovados");
            System.out.println("4 – Sair do sistema");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (numAlunosCadastrados < MAX_ALUNOS) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int matricula = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o nome do aluno: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o resultado (A para aprovado, R para reprovado): ");
                        char resultado = scanner.next().charAt(0);
                        while (resultado != 'A' && resultado != 'R') {
                            System.out.println("Resultado inválido. Digite apenas A ou R.");
                            System.out.print("Digite o resultado (A para aprovado, R para reprovado): ");
                            resultado = scanner.next().charAt(0);
                        }

                        matriculas[numAlunosCadastrados] = matricula;
                        nomes[numAlunosCadastrados] = nome;
                        resultados[numAlunosCadastrados] = resultado;
                        numAlunosCadastrados++;
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de alunos atingido. Impossível cadastrar mais alunos.");
                    }
                    break;

                case 2:
                    System.out.println("=================================================================");
                    System.out.println("MATRICULA        NOME DO ALUNO            RESULTADO");
                    System.out.println("=================================================================");
                    for (int i = 0; i < numAlunosCadastrados; i++) {
                        System.out.printf("%-15d%-30s%-15s%n", matriculas[i], nomes[i], resultados[i] == 'A' ? "A" : "R");
                    }
                    break;

                case 3:
                    System.out.println("=================================================================");
                    System.out.println("MATRICULA        NOME DO ALUNO            RESULTADO");
                    System.out.println("=================================================================");
                    for (int i = 0; i < numAlunosCadastrados; i++) {
                        if (resultados[i] == 'A') {
                            System.out.printf("%-15d%-30s%-15s%n", matriculas[i], nomes[i], "A");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }
}
