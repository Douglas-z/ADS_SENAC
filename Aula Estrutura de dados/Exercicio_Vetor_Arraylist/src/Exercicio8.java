import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();

        System.out.println("Digite 6 numeros: ");

        for (int i = 0; i < 6; i++) {
            int numero = scanner.nextInt();
            vetor.add(numero);
        }
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (int num : vetor) {
            if (num % 2 == 0){
                numerosPares.add(num);
            } else {
                numerosImpares.add(num);
            }
        }
        int quantidadePares = numerosPares.size();
        int quantidadeImpares = numerosImpares.size();

        System.out.println("Números digitados: " + vetor);
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Números ímpares: " + numerosImpares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
