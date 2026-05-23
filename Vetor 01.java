import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
  {
    int vetor[] = {19, 8, 74, 6, 15, 45, 32, 12, 45};
    int tamanhoVetor = vetor.length;
    int idcVetor, j, idcMaiorValor, aux;
 
    /*Scanner entradaNumeros = new Scanner(System.in);
    System.out.println("Digite 15 números inteiros: ");
    nomeAluno = entradaNomes.nextLine();*/
    
    for (idcVetor = 0; idcVetor < tamanhoVetor; idcVetor++) 
    {
        idcMaiorValor = idcVetor;  
        for (j = (idcVetor+1); j < tamanhoVetor; j++) 
    {
        if(vetor[j] > vetor[idcMaiorValor]) 
        {
            idcMaiorValor = j;
        }
    }
    
    if (idcVetor != idcMaiorValor) 
    {
        aux = vetor[idcVetor]; 
        vetor[idcVetor] = vetor[idcMaiorValor]; 
        vetor[idcMaiorValor] = aux; 
    }
    } 
 
    for (idcVetor = 0; idcVetor < tamanhoVetor; idcVetor++) 
    {
        System.out.println(vetor[idcVetor]);
    }
  }
}