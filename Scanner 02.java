import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  
	//Declaração de variável
	double raioCirculo;
	final float VLR_PI = 3.1416f;
    double areaCirculo = 0;
	
	//Objeto de entrada de dados
	Scanner entradaDados = new Scanner(System.in);
	
	//Entrada de dados
	System.out.print("Digite o Raio do círculo: ");
	raioCirculo = entradaDados.nextFloat();
	
	areaCirculo = VLR_PI * (raioCirculo * raioCirculo);
	
	//Visualização
	System.out.println ("Resultado da Area do Circulo: " + areaCirculo + "cm².");
  }
}
