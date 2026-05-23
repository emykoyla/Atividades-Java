import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    String nomePessoa;
    byte idadePessoa;

    Scanner entradaDados = new Scanner (System.in);

      System.out.print("Insira seu nome: ");
      nomePessoa = entradaDados.nextLine();
      System.out.print("Insira sua idade em anos: ");
      idadePessoa = entradaDados.nextByte();

    if (idadePessoa >= 18)

      {
	    System.out.println("Pessoa maior de idade.");
      }
      
    else 
    {
      System.out.println("Pessoa menor de idade.");
    }
  }
}
