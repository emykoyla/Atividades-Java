import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        String nomeCliente, sexoCliente, feminino = "F";
        String masculino = "M";
        float valorContaFinal = 0f, valorCompra = 0f, somaContas = 0f, somaDescontoFeminino = 0f, 
        somaDescontoMasculino = 0f;
        final float DESCONTO_MULHER = 0.05f;
        final float DESCONTO_HOMEM = 0.03f;
        short qtdFeminino = 0, qtdMasculino = 0, qtdClientesAtendidos = 0;
        byte formaPagamento, parcelas;
        int clientesDinheiro = 0, clientesPix= 0, clientesDebito = 0, clientesCredito = 0, 
        clientesTicket = 0, parcela1 = 0, parcela2 = 0, parcela3 = 0;

        Scanner entradaDados = new Scanner(System.in);


        for(;;)
        {
            System.out.print("Digite seu nome ou sair para sair: ");
            nomeCliente = entradaDados.nextLine();
            entradaDados.nextLine();
            if(nomeCliente.equals("sair"))
            {
                System.out.println("Quantidade de clientes atendidos: " + (qtdFeminino + qtdMasculino));
                System.out.println("Quantidade do sexo feminino: " + qtdFeminino);
                System.out.println("Quantidade do sexo masculino: " + qtdMasculino);
                System.out.printf("Soma da contas do dia: %,.2f\n", somaContas);
                System.out.printf("Soma dos descontos do sexo Feminino: %,.2f\n", 
                somaDescontoFeminino);
                System.out.printf("Soma dos descontos do sexo Masculino: %,.2f\n", 
                somaDescontoMasculino);
                System.out.printf("Soma das contas totais: %,.2f\n ", 
                (somaContas - (somaDescontoFeminino + somaDescontoMasculino)));
                System.out.println("O valor total, de clientes com o pagamento em dinheiro, foi de: " + clientesDinheiro);
                System.out.println("O valor total de clientes com o pagamento em PIX foi de:  " + clientesPix);
                System.out.println("O valor total de clientes com o pagamento em Cartão de Crédito foi de : " + clientesCredito + " Sendo: " + 
                parcela1 + "em uma Parcela. " + parcela2 + "em duas Parcelas. E "  + parcela3 + " em três Parcelas");
                System.out.println("O valor total de clientes com o pagamento em Cartão de Débito foi de : " + clientesDebito);
                System.out.println("O valor total de clientes com o pagamento em Ticket foi de : " + clientesTicket);
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
                }



                else if (sexoCliente.equals(masculino))
                    {
                        qtdMasculino++;
                        System.out.println("Desconto de 3% na refeição.");
                        somaDescontoMasculino += DESCONTO_HOMEM;
                        valorContaFinal = valorCompra - (valorCompra * DESCONTO_HOMEM);
                        System.out.printf("(+) Valor da conta R$: %,.2f\n ", valorCompra);
                        System.out.printf("(-) Desconto R$: %,.2f\n", (valorCompra * DESCONTO_HOMEM));
                        System.out.printf("(=) A pagar R$: %,.2f\n", valorContaFinal);
                    }

                    else
                    {
                        System.out.println("Digitação incorreta! Favor digitar somente ''F'' ou ''M''.");
                    }
                }while (!feminino.equals("F") && !masculino.equals("M"));
                
                    do {
                    System.out.print("Insira sua forma de pagamento (1- Dinheiro, 2- PIX, 3- Débito, 4- Crédito, ou 5- Ticket): ");
                formaPagamento = entradaDados.nextByte();
                } while (formaPagamento != 1 && formaPagamento != 2 && formaPagamento != 3 && formaPagamento 
                != 4 && formaPagamento != 5);
                switch (formaPagamento) {
                    case 1:
                        clientesDinheiro++;
                        System.out.println("1 – Dinheiro.");
                        break;

                    case 2:
                        clientesPix++;
                        System.out.println("2 – PIX");
                        break;

                    case 3:
                        clientesDebito++;
                        System.out.println("3 – Débito.");
                        break;

                    case 4:
                        System.out.println("4 – Crédito.");
                        clientesCredito++;
                        do {
                        System.out.println("Insira a quantidade de parcelas (1 – Uma parcela, 2 – Duas parcelas e 3 – Três parcelas)");
                        parcelas = entradaDados.nextByte();

                    } while (parcelas != 1 && parcelas != 2 && parcelas != 3);

                            switch (parcelas) {
                                case 1:
                                    parcela1++;
                                    System.out.println("1– Uma parcela.");
                                    break;

                                case 2:
                                    parcela2++;
                                    System.out.println("2– Duas Parcelas");
                                    break;

                                case 3:
                                    parcela3++;
                                    System.out.println("3– Três Parcelas.");
                                    break;

                                default:
                                    System.out.println("Opção inválida.");
                            }
                        
                        break;

                    case 5:
                        clientesTicket++;
                        System.out.println("5 – Ticket.");
                        break;
    
                    default:
                        System.out.println("Opção inválida.");
                }
        }
    }
}
            