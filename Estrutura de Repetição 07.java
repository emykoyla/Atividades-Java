import java.util.Scanner;
public class Main 
 { 
     public static void main(String[] args)
     { 
        float baseCalculoFinal, aliquota, deducao, ctd = 1;
        byte faixa = 0;
        
        Scanner entradaDados = new Scanner(System.in);
		
		for(ctd=1; ctd>0; ctd++)
		{
		    faixa++;
		    System.out.println("Faixa - " + faixa);
            System.out.println("Insira o valor da Base de Cálculo final ou 1 para sair: ");
            baseCalculoFinal = entradaDados.nextFloat();
            if(baseCalculoFinal == (1))
             {
                break;
             }
            System.out.println("Insira o valor da Aliquota: ");
            aliquota = entradaDados.nextFloat();
            System.out.println("Insira o valor da Dedução: ");
            deducao = entradaDados.nextFloat();
		}
	}
}