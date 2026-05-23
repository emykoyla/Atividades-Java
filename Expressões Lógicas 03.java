import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
      final byte HORAS_AULAS = 80;
      final byte MEDIA_APROVADO = 7;
      final byte MEDIA = 5;
      final byte CEM = 100;
      final float FREQUENCIA = 80f;

      String nomeAluno;
      float  notaProva, notaTrabalho, mediaFinal, mediaNormal, mediaFaltas, provaRecuperacao;
      byte faltas;

      Scanner entradaDados = new Scanner(System.in);

      System.out.print("Digite o nome do Aluno: ");
      nomeAluno = entradaDados.nextLine();
      System.out.print("Digite a nota da prova do Aluno: ");
      notaProva = entradaDados.nextFloat();
      System.out.print("Digite a nota do trabalho do Aluno: ");
      notaTrabalho = entradaDados.nextFloat();
      System.out.print("Digite as faltas do Aluno em hora/aula: ");
      faltas = entradaDados.nextByte();

      mediaNormal = (float) ((notaProva * 0.7) + (notaTrabalho * 0.3));

      mediaFaltas = (CEM - ((float) (faltas * CEM) / HORAS_AULAS));


    if (mediaFaltas >= FREQUENCIA && mediaNormal >= MEDIA_APROVADO)
        {
          System.out.println("O aluno(a) " + nomeAluno + " foi aprovado(a)." + " Média de " + 
          mediaNormal + " e frequência de " + mediaFaltas + "%.");
        }
        
        else if (mediaNormal < MEDIA)
                {
                System.out.println("O aluno(a)" + nomeAluno + " foi reprovado(a) com a média de " + 
                mediaNormal + " e frequência de " + mediaFaltas + "%.");
               }
             
        
    else if (mediaNormal >= MEDIA) 
        {
          System.out.print("O aluno não possui média para aprovação. Digite a nota da prova de Recuperação: ");
          provaRecuperacao = entradaDados.nextFloat();
          mediaFinal = (float) (mediaNormal + ((provaRecuperacao * 0.7) / 2));
            
            if (mediaFinal >= MEDIA_APROVADO) 
            {
              System.out.println("O aluno(a) " + nomeAluno + " foi aprovado(a) com uma média de " + 
              mediaFinal + " e frequência de " + mediaFaltas + "%.");
            }
            
            else 
              {
                System.out.println("O aluno(a)" + nomeAluno + " foi reprovado(a) com a média de " + 
                mediaFinal + " e frequência de " + mediaFaltas + "%.");
              }
            }
             else if (mediaFaltas < FREQUENCIA)
        {
            System.out.printf("O aluno(a) " + nomeAluno +
            " foi reprovado devido a quantidade de faltas. Possui média " + mediaNormal + 
            ", porém tem a frequência de " + mediaFaltas);
        }
         }
     } 