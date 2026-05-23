//Utilizando variC!veis:
//Deduzir 120 de 268;
//Somar o resultado do item ba)b mais 125;
//Multiplicar 9.876.987 pelo resultado do item bb)b;
//Dividir 1.000 por 3;
//Multiplicar o resultado do item bd)b por 3;
//Soma os resultados dos itens ba)b, bb)b, bc)b, bd)b e be)b

public class Main
{
  public static void main (String[]args)
  {
    byte nmrMenorItemA = 120;
    short nmrMaiorItemA = 268;
    float resultItemA = 0f;
    byte somarItemB = 125;
    float resultItemB = 0f;
    int multiplicarItemC = 9876987;
    float resultItemC = 0f;
    short dividirItemD = 1000;
    float resultItemD = 0f;
    float resultItemE = 0f;
    final byte DIVIDIR_MULTIPLICAR = 3;
    double resultGeral = 0;
    float vlrResto = 0f;

      resultItemA = nmrMaiorItemA - nmrMenorItemA;
      resultItemB = resultItemA + somarItemB;
      resultItemC = multiplicarItemC * resultItemB;
      resultItemD = dividirItemD / DIVIDIR_MULTIPLICAR;
      resultItemE = resultItemD * DIVIDIR_MULTIPLICAR;
      resultGeral = 
      resultItemA + resultItemB + resultItemC + resultItemD + resultItemE;

// VisualizaC'C#o dos valores atribuidos

      System.out.println ("Resultado Item A: " + resultItemA);
      System.out.println ("Resultado Item B: " + resultItemB);
      System.out.println ("Resultado Item C: " + resultItemC);
      System.out.println ("Resultado Item D: " + resultItemD);
      System.out.println("Resultado Item E:  " + resultItemE);
      System.out.println ("Resultado Geral: " + resultGeral);
  }
}
