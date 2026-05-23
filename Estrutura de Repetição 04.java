public class Main
 {
   public static void main(String[] args)
   {
       int ctd, repeticaoLoop=0;

// Contagem de 0 ate -100

       ctd =0;
       while ( ctd >= -100)
        {
            System.out.println("Número de 0 até -100: " + ctd);
            ctd = ctd = ctd - 1;
            repeticaoLoop++;
        }
        
       System.out.println("Total de repetições de 0 até -100: " + repeticaoLoop);

// Contagem em 10 e 10 de 1.000 até 100

       repeticaoLoop=0;
       ctd = 1000;
       
     do
        {
            System.out.println("Número em 10 e 10: " + ctd);
            ctd = ctd - 10;
            repeticaoLoop++;
        }
        
     while ( ctd >= 100);
        System.out.println("Total de repetições em 10 e 10: " + repeticaoLoop);

// Contagem de número pares de 2 até 80

     repeticaoLoop=0;
     for (ctd = 2; ctd <= 80; ctd=ctd+2)
        {
            System.out.println("Número Par: " + ctd);
            repeticaoLoop++;
        }
        
    System.out.println("Total de repetições dos números pares: " + repeticaoLoop);
    }
 }