import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {

    public static void main (String[] args) {

        ArrayList<Integer> vetorA = new ArrayList<>();
        ArrayList<Integer> vetorB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 numeros: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero" + (i + 1) + ": ");
            int numero = scanner.nextInt();
            vetorA.add(numero);
        }
        for (int i = vetorA.size() - 1; i >= 0; i--) {
            vetorB.add(vetorA.get(i));
        }
        System.out.println("Vetor A: " + vetorA);
        System.out.println("Vetor B (invertido): " + vetorB);

        scanner.close();
    }
}
