import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

    String textoA, textoB;
    int nmrA, nmrB, nmrC, nmrD, nmrE;

    Scanner entradaDados = new Scanner (System.in);

      System.out.print ("Insira um texto: ");
      textoA = entradaDados.nextLine();
      System.out.print ("Insira um texto: ");
      textoB = entradaDados.nextLine();
      System.out.print ("Primeiro número inteiro: ");
      nmrA = entradaDados.nextInt ();
      System.out.print ("Segundo número inteiro: ");
      nmrB = entradaDados.nextInt ();
      System.out.print ("Terceiro número inteiro: ");
      nmrC = entradaDados.nextInt ();
      System.out.print ("Quarto número inteiro: ");
      nmrD = entradaDados.nextInt ();
      System.out.print ("Quinto número inteiro: ");
      nmrE = entradaDados.nextInt ();
      int somaTerceiroEQuarto = 0;
      int subtracaoSegundoETerceiro = 0;
      
    if (textoA.equals(textoB))

      {
	    System.out.println("Textos iguais.");
      }

    else
      {
	    System.out.println("Textos diferentes.");
      }
   
     if (nmrA == nmrE)
      {
        System.out.println("O primeiro número é igual ao quinto número.");  
      } 
      
    else
      {
	    System.out.println("O primeiro número é diferente do quinto número.");
      }
      
    if (nmrB>nmrA)
     {
	    System.out.println("Segundo número é maior que o primeiro número.");
	    somaTerceiroEQuarto = nmrC + nmrD;
	    
	    if (somaTerceiroEQuarto > nmrE)
	    
	    {
	        System.out.println("A soma do terceiro e quarto números é: " + somaTerceiroEQuarto);
	    }
	    
	   else 
	    {
	        System.out.println("O terceiro número é: " + nmrC);
        }
     }
     
    else
      {
	    System.out.println("Segundo número é menor ou igual ao primeiro número.");
      }
      
    subtracaoSegundoETerceiro = nmrB - nmrC;
    
    if (subtracaoSegundoETerceiro != nmrC)
    
    {
        System.out.println("Terceiro número é diferente da subtração do segundo e terceiro.");
    }
  }
}
