import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

final int TAMANHO_TURMA = 100;
String[] alunos = new String[TAMANHO_TURMA];
int quantidadeAlunos = 0;

Scanner scanner = new Scanner(System.in);

    System.out.println("====================================");
    System.out.println("NOME DO ALUNO");
    System.out.println("====================================");

    while (true) {
        System.out.print("Digite o nome do aluno ou pressione Enter para encerrar: ");
        String nome = scanner.nextLine();

        if (nome.isEmpty()) {
            break;
                    } else {
                        alunos[quantidadeAlunos] = nome;
                        quantidadeAlunos++;

        if (quantidadeAlunos == TAMANHO_TURMA) {
        System.out.println("Tamanho máximo da turma atingido.");
                break;
                        }
                        }
                        }

                        System.out.println("====================================");
    System.out.println("Alunos Digitados:");
    for (int i = 0; i < quantidadeAlunos; i++) {
        System.out.println(alunos[i]);
    }

            System.out.println("====================================");
    System.out.println("Quantidade de alunos: " + quantidadeAlunos);
    }
}