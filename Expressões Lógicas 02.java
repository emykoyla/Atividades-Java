import java.util.Scanner;
public class Main 
{
public static void main (String[] args) 
  {
    String numero;
    
    Scanner entradaDados = new Scanner(System.in);

    System.out.print("Digite um número de 1 a 7 para o dia da semana ou enter para sair: ");
    numero = entradaDados.nextLine();

switch (numero)
    {
            
        case "1":
        System.out.println("1- Domingo.");
        break;

        case "2":
        System.out.println("2- Segunda-Feira.");
        break;

        case "3":
        System.out.println("3- Terça-Feira.");
        break;
        
        case "4":
        System.out.println("4- Quarta-Feira.");
        break;
        
        case "5":
        System.out.println("5- Quinta-Feira.");
        break;
        
        case "6":
        System.out.println("6- Sexta-Feira.");
        break;
        
        case "7":
        System.out.println("7- Sábado.");
        break;
        
        case "":
        break;
            
        default:
        System.out.println("Opção inválida.");
    }
  }
}