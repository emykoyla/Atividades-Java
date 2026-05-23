import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] cadAluno = new String[100][4];
        String resultado, aluno;
        byte opcao = 0, qtdAlunos = 0;
        boolean alunosCad = false, continuaCad = true;

        Scanner entradaDados = new Scanner(System.in);

        do {
            System.out.println("1 - Cadastro de alunos");
            System.out.println("2 - Relatório de todos os alunos");
            System.out.println("3 - Relatório de alunos aprovados");
            System.out.println("4 - Calcular média das notas");
            System.out.println("5 - Sair do sistema");
            System.out.println("Digite a opção desejada: ");
            opcao = entradaDados.nextByte();
            entradaDados.nextLine();

            switch (opcao) {
                case 1:
                    do {
                        for (; qtdAlunos < cadAluno.length; qtdAlunos++) {
                            System.out.println("Digite a matrícula do aluno ou tecle enter para sair: ");
                            aluno = entradaDados.nextLine();
                            if (aluno.isEmpty()) {
                                continuaCad = false;
                                break;
                            } else {
                                cadAluno[qtdAlunos][0] = aluno;

                                System.out.println("Digite o nome do aluno : ");
                                cadAluno[qtdAlunos][1] = entradaDados.nextLine();
                                System.out.println("Digite a nota do aluno : ");
                                cadAluno[qtdAlunos][3] = entradaDados.nextLine();

                                System.out.println("Digite o resultado para o aluno ('A' para aprovado e 'R' para reprovado) : ");
                                resultado = entradaDados.nextLine();

                                while (!resultado.equalsIgnoreCase("A") && !resultado.equalsIgnoreCase("R")) {
                                    System.out.println("Opção inválida. Digite 'A' para aprovado e 'R' para reprovado : ");
                                    resultado = entradaDados.nextLine();
                                }

                                cadAluno[qtdAlunos][2] = resultado.toUpperCase();
                                alunosCad = true;
                            }
                        }
                    } while (continuaCad);
                    break;
                case 2:
                    if (alunosCad) {
                        System.out.println("====================================================");
                        System.out.println("Matrícula          Nome do Aluno           Resultado");
                        System.out.println("====================================================");
                        for (byte idc = 0; idc < qtdAlunos; idc++) {
                            System.out.printf("%-12s %15s %18s\n", cadAluno[idc][0], cadAluno[idc][1], cadAluno[idc][2]);
                        }
                        System.out.println("====================================================");
                    } else {
                        System.out.println("Não foi possível visualizar relatório, sem alunos cadastrados.");
                    }
                    break;
                case 3:
                    if (alunosCad) {
                        System.out.println("====================================================");
                        System.out.println("Matrícula          Nome do Aluno           Resultado");
                        System.out.println("====================================================");
                        for (byte idc = 0; idc < qtdAlunos; idc++) {
                            if (cadAluno[idc][2].equals("A")) {
                                System.out.printf("%-12s %15s %18s\n", cadAluno[idc][0], cadAluno[idc][1], cadAluno[idc][2]);
                            }
                        }
                        System.out.println("====================================================");
                    } else {
                        System.out.println("Não foi possível visualizar relatório, sem alunos cadastrados.");
                    }
                    break;
                case 4:
                    if (alunosCad) {
                        calcularMedia(cadAluno, qtdAlunos);
                    } else {
                        System.out.println("Não há alunos cadastrados para calcular a média.");
                    }
                    break;
                case 5:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 5);
    }

    public static void calcularMedia(String[][] cadAluno, byte qtdAlunos) {
        double somaNotas = 0;
        for (byte idc = 0; idc < qtdAlunos; idc++) {
            somaNotas += Double.parseDouble(cadAluno[idc][3]);
        }
        double media = somaNotas / qtdAlunos;
        System.out.println("A média das notas dos alunos cadastrados é: " + media);
    }
}
