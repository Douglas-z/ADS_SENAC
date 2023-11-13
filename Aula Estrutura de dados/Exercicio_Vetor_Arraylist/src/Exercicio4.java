import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<>();

        // Le os 5 numeros inteiros
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            vetorA.add(numero);
        }

        // Procura o primeiro numero negativo e imprime o indice
        int indicenegativo = -1;

        for (int i=0; i < vetorA.size(); i++){
            if (vetorA.get(i) < 0) {
                indicenegativo = i;
                break;
            }
        }
        if (indicenegativo != -1) {
            System.out.println("O Primeiro numero negativo esta no indice: " +indicenegativo);
        } else {
            System.out.println("Negativo nao encontrado: ");
        }
        scanner.close();
    }
}
