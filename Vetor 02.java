import java.util.Scanner;
public class Main 
    {
        public static void main(String[] args) 
        {
            int vetor[] = {19, 8, 74, 6, 15, 45, 32, 12, 45};
            int tamanhoVetor = vetor.length;
            int idcVetor, j, eleito;
 
            for (idcVetor = 1; idcVetor < tamanhoVetor; idcVetor++)
            {
                eleito = vetor[idcVetor];  
                j = idcVetor - 1; 
 
                while ( (j >= 0) && ( eleito > vetor[j] ) ) 
                {
                    vetor[j+1] = vetor[j];  
                    j--;
                }
                
                vetor[j+1] = eleito;  
            }

            for (idcVetor = 0; idcVetor < tamanhoVetor; idcVetor++) 
            {
                System.out.println(vetor[idcVetor]);
            }
        }
    }