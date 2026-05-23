import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
      int numero;
      
      Scanner entradaNumero = new Scanner(System.in);
      
      System.out.print("Digite um número para saber se ele é par ou ímpar: ");
      numero = entradaNumero.nextInt();
      
      if (numero % 2 == 0)
        {
            System.out.println("O número " + numero + " é par.");
        }
        
    else 
        {
            System.out.println("O número" + numero + " é ímpar");
        }
    }
}