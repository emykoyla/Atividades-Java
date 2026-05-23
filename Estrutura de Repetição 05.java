import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int numero1, numero2, numeroEntreEles = 0;
	    
 		Scanner entradaNumeros = new Scanner(System.in);
 		
	    System.out.println("Digite o primeiro número");
        numero1 = entradaNumeros.nextInt();
		
	    System.out.println("Digite o segundo número");
        numero2 = entradaNumeros.nextInt();
        
        numeroEntreEles = numero1 + 1;
		
	    while ((numeroEntreEles > numero1) && (numeroEntreEles < numero2))
	    
	    {
            System.out.println("Os números entre " + numero1 + " e " + numero2 + " são " + numeroEntreEles);
            numeroEntreEles++;
	    }
	}
}