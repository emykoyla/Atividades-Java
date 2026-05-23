import java.util.Scanner;
public class Main 
  {
    public static void main(String[]args)
    {
      String nomeCliente, sexoCliente, feminino = "F";
      String masculino = "M";
      float valorContaFinal = 0f, valorCompra = 0f, somaContas = 0f, somaDescontoFeminino = 0f, somaDescontoMasculino = 0f;
      final float DESCONTO_MULHER = 0.05f;
      final float DESCONTO_HOMEM = 0.03f;
      short qtdFeminino = 0, qtdMasculino = 0, qtdClientesAtendidos = 0;
      
      
    
      Scanner entradaDados = new Scanner(System.in);
    
    		
		for(;;)
		{
            System.out.print("Digite seu nome ou sair para sair: ");
            nomeCliente = entradaDados.nextLine();
            if(nomeCliente.equals("sair"))
            {
              System.out.println("Quantidade de clientes atendidos: " + (qtdFeminino + qtdMasculino));
              System.out.println("Quantidade do sexo feminino: " + qtdFeminino);
              System.out.println("Quantidade do sexo masculino: " + qtdMasculino);
              System.out.printf("Soma da contas do dia: %,.2f\n", somaContas);
              System.out.printf("Soma dos descontos do sexo Feminino: %,.2f\n", somaDescontoFeminino);
              System.out.printf("Soma dos descontos do sexo Masculino: %,.2f\n", somaDescontoMasculino);
              System.out.printf("Soma das contas totais: %,.2f\n ", (somaContas - (somaDescontoFeminino + somaDescontoMasculino)));
              break;
            }
            System.out.print("Insira o valor da compra no restaurante: ");
            valorCompra = entradaDados.nextFloat();
            entradaDados.nextLine();
            somaContas += valorCompra;
            do
             {
               System.out.print("Insira seu gênero (F para Feminino e M para masculino): ");
               sexoCliente = entradaDados.nextLine();
               
               if(sexoCliente.equals(feminino))
                {
                   qtdFeminino++;
                   System.out.println("Desconto de 5% na refeição.");
                   valorContaFinal = valorCompra - (valorCompra * DESCONTO_MULHER);
                   somaDescontoFeminino += DESCONTO_MULHER;
                   System.out.printf("(+) Valor da conta R$: %,.2f\n ", valorCompra);
                   System.out.printf("(-) Desconto R$: %,.2f\n", (valorCompra * DESCONTO_MULHER));
                   System.out.printf("(=) A pagar R$: %,.2f\n", valorContaFinal);
                   
                   break;
                }
             
            else 
            { 
                if (sexoCliente.equals(masculino))
                {
                   qtdMasculino++;
                   System.out.println("Desconto de 3% na refeição.");
                   somaDescontoMasculino += DESCONTO_HOMEM;
                   valorContaFinal = valorCompra - (valorCompra * DESCONTO_HOMEM);
                   System.out.printf("(+) Valor da conta R$: %,.2f\n ", valorCompra);
                   System.out.printf("(-) Desconto R$: %,.2f\n", (valorCompra * DESCONTO_HOMEM));
                   System.out.printf("(=) A pagar R$: %,.2f\n", valorContaFinal);
                   break;
                }
                
                else 
                 {
                   System.out.println("Digitação incorreta! Favor digitar somente ''F'' ou ''M''.");
                 }
            }
         }
         while (true);
      }
    }   
  }