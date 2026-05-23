import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  
	//Declaração de variável
	String seuNome;
	byte anosIdade;
	float pretensaoSalario;
	
	//Objeto de entrada de dados
	Scanner entradaDados = new Scanner(System.in);
	
	//Entrada de dados
	System.out.print("Digite o seu nome: ");
	seuNome = entradaDados.nextLine();
	System.out.print("Digite sua idade em anos: ");
	anosIdade = entradaDados.nextByte();
	System.out.print("Digite sua pretensão salarial: ");
	pretensaoSalario = entradaDados.nextFloat();
	
	//Visualização
	System.out.println("Seu nome é " + seuNome + ".");
	System.out.println("Sua idade é: " + anosIdade + " anos.");
	System.out.println("Sua pretensão salarial é de: " + pretensaoSalario + ".");
	}
}
