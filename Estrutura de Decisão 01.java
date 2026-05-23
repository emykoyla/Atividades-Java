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
	
	if (nroA >= nroB) 
	    {
	        nroC = nroA + nroB;
	        System.out.println("Resultado de número C: " + nroC);
	    }
	System.out.println("Final do Algoritmo.");
    }
}
