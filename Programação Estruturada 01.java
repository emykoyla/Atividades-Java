import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    String nome;
	    int qtdLetras = 0;
	    Scanner entradaNome = new Scanner (System.in);
		System.out.println("Digite seu nome completo: ");
		nome = entradaNome.nextLine();
		qtdLetras = nome.length();
		qtdLetras++;
		System.out.println("A quantidade de letras (contando espaços) é: " + qtdLetras);
	}
}
