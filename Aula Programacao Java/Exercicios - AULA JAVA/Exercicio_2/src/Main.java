import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numeroDia = scanner.nextInt();

        String diaDaSemana = obterDiaDaSemana(numeroDia);

        if (diaDaSemana != null) {
            System.out.println("O dia da semana correspondente é: " + diaDaSemana);
        } else {
            System.out.println("Número inválido. Digite um número de 1 a 7.");
        }
    }

    public static String obterDiaDaSemana(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return null;
        }
    }
}
