import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar um vetor com 250.000 números inteiros aleatórios

        int[] vlrVetor = new int[250000];
        int numeroVerificar = 508848610;
        boolean encontrado = false;

        Random random = new Random();

        for (int i = 0; i < vlrVetor.length; i++) {
            vlrVetor[i] = random.nextInt();
        }

        System.out.println("Números ímpares:");
        for (int num : vlrVetor) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        for (int num : vlrVetor) {
            if (num == numeroVerificar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número " + numeroVerificar + " está no Vetor");
        } else {
            System.out.println("Número " + numeroVerificar + " não está no Vetor");
 }
 }
}