/*Explicação da lógica: Um matemático precisa de um algoritimo para fazer alguns calculos baseados em PI.*/

public class Main
{
	public static void main(String[] args) {
	  
	  //Declaração de constantes e variáveis
		
	float nmrExemplo1 = 45.67f;
    byte nmrExemplo2 = 70;
    byte nmrExemplo3 = 9;
    byte nmrExemplo4 = 93;
    float nmrExemplo5 = 194.87f;
    byte nmrExemplo6 = 1;
    byte nmrExemplo7 = 52;
    int nmrExemplo8 = 240;
	final double PI = 3.14159;
	
	  //Operações 
		
	double resultado1 = (nmrExemplo1 * nmrExemplo2) + (nmrExemplo3 * nmrExemplo4);
    double resultado2 = ((nmrExemplo5 * nmrExemplo6) - (nmrExemplo7 * nmrExemplo8)) / PI;
    double resultado3 = (((nmrExemplo1 + nmrExemplo2) * (nmrExemplo3 + nmrExemplo4)) - 
    ((nmrExemplo5 + nmrExemplo6) * (nmrExemplo7 + nmrExemplo8))) / PI;
    double resultado4 = (((((nmrExemplo1 + nmrExemplo2) * (nmrExemplo3 + nmrExemplo4)) - 
    ((nmrExemplo5 + nmrExemplo6) * (nmrExemplo7 + nmrExemplo8))) / PI) + 1);

       //visualização dos resultados
      
    System.out.println("Resultado1 = " + resultado1);
    System.out.println("Resultado2 = " + resultado2);
    System.out.println("Resultado3 = " + resultado3);
    System.out.println("Resultado4 = " + resultado4);
    
	}
}