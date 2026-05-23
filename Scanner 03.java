import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
{
	//Declaração de variável
	String nomeEmpregado;
	float idcReajuste;
    float salarioContratual;
    final float GRATIFICACAO = 0.05f;
    final float DESCONTO_INSS = 0.10f;
    final float DESCONTO_SEGURO = 12.89f;
    final float DESCONTO_SINDICAL = 0.03333f;
    float vlrReajuste = 0.00f;
    float vlrGratificacao = 0.00f;
    float vlrDescontoInss = 0.00f;
    float salarioReajustado = 0.00f;
    float vlrDescontoSindical = 0.00f;
    float salarioLiquido = 0.00f;
	
	//Objeto de entrada de dados
	Scanner entradaDados = new Scanner(System.in);
	
	//Entrada de dados
	System.out.print("Digite o seu nome: ");
	nomeEmpregado = entradaDados.nextLine();
	System.out.print("Digite seu salário contratual: ");
	salarioContratual = entradaDados.nextFloat();
	System.out.print("Digite a taxa do reajuste em ìndice: ");
    idcReajuste = entradaDados.nextFloat();
	
	vlrReajuste = salarioContratual * idcReajuste;
    salarioReajustado = salarioContratual + vlrReajuste;
    vlrGratificacao = salarioReajustado * GRATIFICACAO;
    vlrDescontoInss = (vlrReajuste + vlrGratificacao + salarioContratual) * DESCONTO_INSS;
    vlrDescontoSindical = salarioReajustado * DESCONTO_SINDICAL;
    salarioLiquido = salarioReajustado + vlrGratificacao - vlrDescontoInss - DESCONTO_SEGURO - vlrDescontoSindical;
	
	//Visualização
    System.out.println("Nome do Empregado: " + nomeEmpregado);
    System.out.println("Salário contratual do Empregado: " + salarioContratual);
    System.out.println("Reajuste Salarial: " + vlrReajuste);
    System.out.println("Gratificação Salarial de 5%: " + vlrGratificacao);
    System.out.println("Desconto do INSS: " + vlrDescontoInss);
    System.out.println("Desconto do Seguro em Grupo: " + DESCONTO_SEGURO);
    System.out.println("Desconto da Associação Sindical: " + vlrDescontoSindical);
    System.out.println("Salário Líquido do Empregado: " + salarioLiquido);
	}
}
