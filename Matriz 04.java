import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {

        String[][] clientes = new String[100][4];
        int numClientes = 0;
        String nome;
        float valorConta, valorFinal = 0f, desconto = 0f;
        char sexo;
        boolean encontrado = false;
        Scanner entradaDados = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 – Gerar conta do cliente");
            System.out.println("2 – Imprimir conta de um cliente");
            System.out.println("3 – Imprimir contas de todos clientes");
            System.out.println("4 – Sair");
            System.out.println("Escolha uma opção: ");
            opcao = entradaDados.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    nome = entradaDados.nextLine();
                    entradaDados.nextLine();

                    System.out.println("Digite o valor da conta do cliente: ");
                    valorConta = entradaDados.nextFloat();
                    do {
                        System.out.print("Digite o sexo do cliente (F/M): ");
                        sexo = Character.toUpperCase(entradaDados.nextLine().charAt(0));
                        if (sexo == 'F')
                        {
                            desconto = valorConta * 0.05f;
                            valorFinal = valorConta - desconto;
                        }
                        else if (sexo == 'M')
                        {
                            desconto =  valorConta * 0.03f;
                            valorFinal = valorConta - desconto;
                        }
                    }
                    while (sexo != 'F' && sexo != 'M');

                    clientes[numClientes][0] = nome;
                    clientes[numClientes][1] = String.valueOf(valorConta);
                    clientes[numClientes][2] = String.valueOf(desconto);
                    clientes[numClientes][3] = String.valueOf(valorFinal);
                    numClientes++;

                    System.out.println("Conta gerada com sucesso!");

                    break;

                case 2:
                    if (numClientes == 0)
                    {
                        System.out.println("Nenhuma conta foi gerada ainda.");
                        break;
                    }
                    else {
                        System.out.print("Digite o nome do cliente: ");
                        nome = entradaDados.nextLine();
                    }
                    for (int i = 0; i < numClientes; i++)
                    {
                        if (clientes[i][0].equalsIgnoreCase(nome))
                        {
                            System.out.println("Nome: " + clientes[i][0]);
                            System.out.println("Valor da conta: " + clientes[i][1]);
                            System.out.println("Desconto: " + clientes[i][2]);
                            System.out.println("Valor final: " + clientes[i][3]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado)
                    {
                        System.out.println("Cliente não encontrado.");
                    }

                    break;

                case 3:
                    if (numClientes == 0)
                    {
                        System.out.println("Nenhuma conta foi gerada ainda.");
                        break;
                    }

                    System.out.println("Contas de todos os clientes:");
                    for (int i = 0; i < numClientes; i++)
                    {
                        System.out.println("Nome: " + clientes[i][0]);
                        System.out.println("Valor da conta: " + clientes[i][1]);
                        System.out.println("Desconto: " + clientes[i][2]);
                        System.out.println("Valor final: " + clientes[i][3]);
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        while (opcao != 4);
    }
}