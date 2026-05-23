import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        String txt;
        int qtdCaracteres = 0;
        int qtdVogalA = 0, qtdVogalE = 0, qtdVogalI = 0, qtdVogalO = 0, qtdVogalU = 0;

        Scanner entradaTexto = new Scanner(System.in);

        System.out.print("Texto: ");
        txt = entradaTexto.nextLine();
        for(int ctd = 0 ; ctd<txt.length(); ctd++)
        {
            if (txt.charAt (ctd) == 'a')
            {
                qtdVogalA++;
            }
            else
            {
                if(txt.charAt(ctd) == 'A')
                {
                    qtdVogalA++;
                }
            }

            if (txt.charAt(ctd) == 'e')
            {
                qtdVogalE++;
            }

            else
            {
                if(txt.charAt(ctd) == 'E')
                {
                    qtdVogalE++;
                }
            }

            if (txt.charAt(ctd) == 'i')
            {
                qtdVogalI++;
            }

            else
            {
                if(txt.charAt(ctd) == 'I')
                {
                    qtdVogalI++;
                }
            }

            if (txt.charAt(ctd) == 'o')
            {
                qtdVogalO++;
            }

            else
            {
                if(txt.charAt(ctd) == 'O')
                {
                    qtdVogalO++;
                }
            }

            if (txt.charAt(ctd) == 'u')
            {
                qtdVogalU++;
            }

            else
            {
                if(txt.charAt(ctd) == 'U')
                {
                    qtdVogalU++;
                }
            }
        }

        qtdCaracteres = txt.length();
        System.out.println("Total de caracteres: " + qtdCaracteres);
        System.out.println("Total de vogal 'a' no texto: " + qtdVogalA);
        System.out.println("Total de vogal 'e' no texto: " + qtdVogalE);
        System.out.println("Total de vogal 'i' no texto: " + qtdVogalI);
        System.out.println("Total de vogal 'o' no texto: " + qtdVogalO);
        System.out.println("Total de vogal 'u' no texto: " + qtdVogalU);
    }
}