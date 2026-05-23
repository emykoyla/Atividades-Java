import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
        {
            Float[][] vlrIRFF = new Float[5][3];
            short nroFaixa = 0;
 
            Scanner entradaDados = new Scanner(System.in);
 
            for (int i = 0; i < vlrIRFF.length; i++)
                {
                    System.out.print("Valor base de cálculo limite da faixa " + ++nroFaixa + ": ");
                    vlrIRFF[i][0] = entradaDados.nextFloat();
                    System.out.print("Percentual da faixa " + nroFaixa + ": ");
                    vlrIRFF[i][1] = (entradaDados.nextFloat())/100;
                    entradaDados.nextLine();
                    System.out.print("Valor dedução da faixa " + nroFaixa + ": ");
                    vlrIRFF[i][2] = entradaDados.nextFloat();
                    entradaDados.nextLine();
 
                }
                System.out.println("============================================================================");
                System.out.println("Base de Cálculo             Alíquota               Dedução");
                System.out.println("============================================================================");
                for (int i = 0; i < vlrIRFF.length; i++)
                {
                    if (i == 0)
                    {
                        System.out.println("0.00 até " + vlrIRFF[i][0] + "                " + vlrIRFF[i][1]*100 + "                " + vlrIRFF[i][2]);
                        System.out.println("De " + vlrIRFF[i][0] + 0.01 + " até " + vlrIRFF[1][0] + "       " + vlrIRFF[1][1]*100 + "          " + vlrIRFF[1][2]);
                        System.out.println("De " + vlrIRFF[1][0] + 0.01 + " até " + vlrIRFF[2][0] + "       " + vlrIRFF[2][1]*100 + "   " + vlrIRFF[2][2]);
                        System.out.println("De " + vlrIRFF[2][0] + 0.01 + " até " + vlrIRFF[3][0] + "       " + vlrIRFF[3][1]*100 + "          " + vlrIRFF[3][2]);
                        System.out.println("Acima de " + vlrIRFF[3][0] +  "                " + vlrIRFF[4][1]*100 + "                " + vlrIRFF[4][2]);
                            
                    }
                }
        }
}

