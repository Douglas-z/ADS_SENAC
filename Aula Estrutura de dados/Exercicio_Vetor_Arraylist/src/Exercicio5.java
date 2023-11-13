import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<>();

        vetorA.add(7);
        vetorA.add(21);
        vetorA.add(15);
        vetorA.add(12);
        vetorA.add(82);

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        if (vetorA.contains(numero)) {
            System.out.println("O numero " + numero + "esta presente no vetor.");
        } else {
            System.out.println("O numero " + numero + "nao esta presente no vetor.");
        }
    }
}
