import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte numeroDias;
        String [] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        Scanner entradaDados = new Scanner(System.in);

        do {
            System.out.print("Digite um número para um dia da semana (De 1 a 7) ou 0 para sair: ");
            numeroDias = entradaDados.nextByte();

            switch (numeroDias){
                case 1:
                    System.out.println("Domingo" + diasSemana);
                    break;
                case 2:
                    System.out.println("Segunda - Feira" + diasSemana);
                    break;
                case 3:
                    System.out.println("Terça - Feira" + diasSemana);
                    break;
                case 4:
                    System.out.println("Quarta - Feira" + diasSemana);
                    break;
                case 5:
                    System.out.println("Quinta - Feira" + diasSemana);
                    break;
                case 6:
                    System.out.println("Sexta - Feira" + diasSemana);
                    break;
                case 7:
                    System.out.println("Sábado" + diasSemana);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (numeroDias != 0);
    }
}
