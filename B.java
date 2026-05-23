import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    String nome;
	    String vogal[] = {"A", "E", "I", "O", "U"};
	    int qtdLetras = 0, qtdVogal = 0;
	    Scanner entradaNome = new Scanner (System.in);
		System.out.println("Digite seu nome completo: ");
		nome = entradaNome.nextLine();
		qtdLetras = nome.length();
		qtdLetras++;
		    for (int i = 0; i<vogal.length; i++)
		    {
		        if (nome.toUpperCase().contains(vogal[i]))
		        {
		            qtdVogal++;
		        }
		    }
		System.out.println("A quantidade de letras (contando espaços) é: " + qtdLetras);
		System.out.println("A quantidade de vogais é: " + qtdVogal);
	}
}
