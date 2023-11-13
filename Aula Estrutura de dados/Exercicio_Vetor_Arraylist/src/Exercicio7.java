import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> salarioOriginal = new ArrayList<>();
        ArrayList<Double> novosalario = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.print("Digite o salario de " + nome + ": ");
            double salariosOriginais = scanner.nextDouble();
            salarioOriginal.add(salariosOriginais);
            scanner.nextLine();

            double novosalarios = salariosOriginais * 1.08; // Reajuste de 8%
            novosalario.add(novosalarios);
        }
        System.out.println("Listagem de Salários Reajustados:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". Nome: " + nomes.get(i) + " - Novo Salário: R$" + novosalario.get(i));
        }


        scanner.close();
    }
}
