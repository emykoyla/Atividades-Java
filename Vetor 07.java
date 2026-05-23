import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Declaração de variáveis e vetores
        String[] vetorNome = new String[5];

        Scanner entradaDados = new Scanner(System.in);

        for (int indiceVetor = 0; indiceVetor < vetorNome.length; indiceVetor++)
        {
            System.out.print("Nome " + indiceVetor + ": ");
            vetorNome[indiceVetor] = entradaDados.nextLine();
        }

        for(int indiceVetor = (vetorNome.length - 1); indiceVetor >= 0; indiceVetor--)
        {
            System.out.println("O nome na posição (índice) " + indiceVetor + " do vetor nome é " + vetorNome[indiceVetor] );
        }
    }
}