import java.util.ArrayList;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        String nomeAluno;
        
        ArrayList<String> listaDeNomes = new ArrayList<>();
        Scanner entradaNomes = new Scanner(System.in);
        
        for (;;)
        {
            System.out.println("Insira o nome do aluno ou 'enter' para encerrar: ");
            nomeAluno = entradaNomes.nextLine();
            if (nomeAluno.equals(""))
            {
                int size = listaDeNomes.size();
                System.out.println("Tamanho da lista: " + size);
                break;
            }
            
            listaDeNomes.add(nomeAluno);
        }
        for (short ctd = 1; ctd >= 1; ctd--)
        {
            System.out.println("Lista de alunos: " + listaDeNomes);
            System.out.println("Lista encerrada.");
        }
 
}
}