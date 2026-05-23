import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] numeros = new int[100];
    static boolean gerados = false;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1 – Gerar 100 números inteiros aleatórios de 0 a 50");
            System.out.println("2 – Imprimir todos os números gerados na opção 1");
            System.out.println("3 – Imprimir todos os números gerados na opção 1 em ordem inversa");
            System.out.println("4 – Imprimir os números gerados intercalados em 2 em 2");
            System.out.println("5 – Pesquisar um determinado número entre os números gerados");
            System.out.println("6 – Imprimir qual foi o maior número gerado");
            System.out.println("7 – Sair do sistema");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    gerarNumeros();
                    System.out.println("Números gerados com sucesso!");
                    gerados = true;
                    break;
                case 2:
                    if (gerados)
                        imprimirNumeros();
                    else
                        System.out.println("Erro: Números não gerados ainda!");
                    break;
                case 3:
                    if (gerados)
                        imprimirOrdemInversa();
                    else
                        System.out.println("Erro: Números não gerados ainda!");
                    break;
                case 4:
                    if (gerados)
                        imprimirInterpolados();
                    else
                        System.out.println("Erro: Números não gerados ainda!");
                    break;
                case 5:
                    if (gerados)
                        pesquisarNumero();
                    else
                        System.out.println("Erro: Números não gerados ainda!");
                    break;
                case 6:
                    if (gerados)
                        imprimirMaiorNumero();
                    else
                        System.out.println("Erro: Números não gerados ainda!");
                    break;
                case 7:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);
        
        entrada.close();
    }

    static void gerarNumeros() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            numeros[i] = rand.nextInt(51); // Gera um número aleatório entre 0 e 50
        }
    }

    static void imprimirNumeros() {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    static void imprimirOrdemInversa() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    static void imprimirInterpolados() {
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    static void pesquisarNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número que deseja pesquisar: ");
        int numero = entrada.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                System.out.println("O número " + numero + " foi encontrado na posição " + i + ".");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado.");
        }
    }

    static void imprimirMaiorNumero() {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número gerado foi: " + maior);
    }
}
