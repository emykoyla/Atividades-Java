import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    String nomeCliente, sexoCliente, feminino = "F";

    Scanner entradaDados = new Scanner (System.in);

      System.out.print("Insira seu nome: ");
      nomeCliente = entradaDados.nextLine();
      System.out.print("Insira seu gênero (F para feminino e M para Masculino): ");
      sexoCliente = entradaDados.nextLine();

    if (sexoCliente.equals(feminino))

      {
	    System.out.println("Desconto de 5% na refeição!");
      }
      
    System.out.println("Bem vindo(a) " + nomeCliente + ".");
  }
}
