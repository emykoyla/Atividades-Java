import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    
	int nroA, nroB, nroC;
	
	Scanner entradaDados = new Scanner(System.in);
	
	System.out.print("Digite o número A: ");
	nroA = entradaDados.nextInt();
	System.out.print("Digite o número B: ");
	nroB = entradaDados.nextInt();
	
	if (nroA != nroB) 
	    {
	        if (nroB == 0)
	        {
	            System.out.println("Não pode dividir por zero!");
	        }
	        
	        else
	        {
	        nroC = nroA / nroB;
	        System.out.println("Resultado de A / B: " + nroC);
	        }
	    }
	    
	    
	else
	    {
	        nroC = nroA * nroA;
	        System.out.println("Resultado de número A²: " + nroC);
	    }
	    
	System.out.println("Final do Algoritmo.");
	
    }
}
