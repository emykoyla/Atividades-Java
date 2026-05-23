import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
  {
	   
	String nomePessoa;
	float salarioPessoa;
	final float BASE_CALCULO_1 = 2112.00f;
	final float BASE_CALCULO_2 = 2826.65f;
	final float BASE_CALCULO_3 = 3751.05f;
	final float BASE_CALCULO_4 = 4664.68f;
	final byte ISENTO = 0;
	final float ALIQUOTA_1 = 0.075f;
	final float ALIQUOTA_2 = 0.15f;
	final float ALIQUOTA_3 = 0.225f;
	final float ALIQUOTA_4 = 0.275f;
	final byte ISENTO_2 = 0;
	final float DEDUCAO_1 = 158.40f;
	final float DEDUCAO_2 = 370.40f;
	final float DEDUCAO_3 = 651.73f;
	final float DEDUCAO_4 = 884.96f;
	float vlrIRRF = 0f;
	
	Scanner entradaDados = new Scanner (System.in);
	
      System.out.print ("Digite seu nome: ");
      nomePessoa = entradaDados.nextLine();
      System.out.print ("Digite seu salário: ");
      salarioPessoa = entradaDados.nextFloat();
      
    if (salarioPessoa <= BASE_CALCULO_1)
      {
        vlrIRRF = (salarioPessoa * ISENTO) - ISENTO_2;
      }
      
    if (salarioPessoa > BASE_CALCULO_1)
      {
        vlrIRRF = (salarioPessoa * ALIQUOTA_1) - DEDUCAO_1;
      }
    
    if (salarioPessoa > BASE_CALCULO_2)  
      {
          vlrIRRF = (salarioPessoa * ALIQUOTA_2) - DEDUCAO_2;
      }
      
    if (salarioPessoa > BASE_CALCULO_3)  
      {
          vlrIRRF = (salarioPessoa * ALIQUOTA_3) - DEDUCAO_3;
      } 
      
    if (salarioPessoa > BASE_CALCULO_4) 
      {
          vlrIRRF = (salarioPessoa * ALIQUOTA_4) - DEDUCAO_4;
      }

    System.out.println("Valor da taxa IRRF: " + vlrIRRF);
  }
}
