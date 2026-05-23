import java.util.Scanner;
public class Main 
 { 
     public static void main(String[] args)
     { 
        int ctd = 1;
        String nomeAluno;
        
        Scanner entradaDados = new Scanner(System.in);
        
		for(ctd=1; ctd>0; ctd++)
		{
            System.out.println("Digite o nome do aluno, ou aperte 'Enter' para sair: ");
            nomeAluno = entradaDados.nextLine();
            if(nomeAluno.equals(""))
            {
                ctd--;
                break;
            }
		}
		System.out.println("A quantidade de alunos é "+ ctd);
	}
}