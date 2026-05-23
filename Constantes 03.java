//Desenvolver um algoritmo em Java para declarar as constantes e as variáveis necessárias.
//O Departamento de Pessoal da empresa Xpto Ltda necessita de reajustar o salário do empregado Antônio Mota Carvalho com um 
//percentual estimulado pelo sindicato. Após o reajuste do salário do empregado, a empresa deverá calcular o salário líquido do 
//empregado da seguinte forma:
//acréscimo de 5% de gratificação no salário contratual;
//desconto de INSS, sendo o valor do INSS 10% sobre o salário reajustado mais a gratificação;
//desconto de taxa fixa de seguro em grupo, sendo o valor de R$ 12,89;
//desconto da associação sindical, sendo 1/30 somente do salário reajustado.
//Atribua e visualize os valores compatíveis com esta lógica.
//6850
 
public class Main
{
  public static void main (String[]args)
  {
      
    float REAJUSTE_SALARIO = 0.089f;
    float salarioBruto = 6500.00f;
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
    String nomeEmpregado = "Antônio Mota Carvalho";

    vlrReajuste = salarioBruto * REAJUSTE_SALARIO;
    salarioReajustado = salarioBruto + vlrReajuste;
    vlrGratificacao = salarioReajustado * GRATIFICACAO;
    vlrDescontoInss = (vlrReajuste + vlrGratificacao + salarioBruto) * DESCONTO_INSS;
    vlrDescontoSindical = salarioReajustado * DESCONTO_SINDICAL;
    salarioLiquido = salarioReajustado + vlrGratificacao - vlrDescontoInss - DESCONTO_SEGURO - vlrDescontoSindical;

    System.out.println("Nome do Empregado: " + nomeEmpregado);
    System.out.println("Salário Bruto do Empregado: " + salarioBruto);
    System.out.println("Reajuste Salarial de 8.9%: " + vlrReajuste);
    System.out.println("Gratificação Salarial de 5%: " + vlrGratificacao);
    System.out.println("Desconto do INSS: " + vlrDescontoInss);
    System.out.println("Desconto do Seguro em Grupo: " + DESCONTO_SEGURO);
    System.out.println("Desconto da Associação Sindical: " + vlrDescontoSindical);
    System.out.println("Salário Líquido do Empregado: " + salarioLiquido);
}
  }
