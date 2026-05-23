import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
{
	//Declaração de variável
	float receitaTotal;
    float custosVariaveis;
	float despesasOperacionais;
	float custosTotais;
	float despesasTotais;
	float impostos;
	float ebitda;
    double margemLucro;
    float lucroLiquido;
	
	//Objeto de entrada de dados
	Scanner entradaDados = new Scanner(System.in);
	
	//Entrada de dados
	System.out.print("Informe a Receita Total da empresa: ");
	receitaTotal = entradaDados.nextFloat();
	System.out.print("Informe os Custos Variaveis da Empresa: ");
	custosVariaveis = entradaDados.nextFloat();
	System.out.print("Informe as despesas Operacionais da empresa: ");
	despesasOperacionais = entradaDados.nextFloat();
	System.out.print("Insira o valor de Custos Totais da empresa: ");
	custosTotais = entradaDados.nextFloat();
	System.out.print("insira o valor de Despesas totais da empresa: ");
	despesasTotais = entradaDados.nextFloat();
	System.out.print("Insira o valor dos Impostos pendentes: ");
	impostos = entradaDados.nextFloat();
	
 
	ebitda = receitaTotal - custosVariaveis - despesasOperacionais;
	lucroLiquido = receitaTotal - custosTotais - despesasTotais - impostos;
    margemLucro = lucroLiquido / receitaTotal * 100;
	
	//Visualização
    System.out.println("Valor do EBITDA: " + ebitda + ".");
    System.out.println("A Margem de Lucro é de: " + margemLucro + ".");
    System.out.println("O Lucro Líquido é de: " + lucroLiquido + ".");
	}
}