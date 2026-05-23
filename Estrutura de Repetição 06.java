import java.util.Scanner;
public class Main
 {
public static void main (String[] args) 
   {
    int numeros;
    int somaNumeros = 0;
    Scanner entradaNumeros = new Scanner(System.in);
    
    System.out.print("Insira qualquer número inteiro: ");
    numeros = entradaNumeros.nextInt();
    
    somaNumeros = numeros;
    
    for (int ctd = 1; ctd <= 10; ctd++)
        {
            System.out.println("Acumulação: " + somaNumeros);
            somaNumeros += somaNumeros;
        }
 
   }
 }