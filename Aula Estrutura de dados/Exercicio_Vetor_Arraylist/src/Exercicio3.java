import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vetorX = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorX.add(scanner.nextInt());
        }

        int maior = vetorX.get(0);
        int menor = vetorX.get(0);
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < vetorX.size(); i++) {
            if (vetorX.get(i) > maior) {
                maior = vetorX.get(i);
                posicaoMaior = i;
            }

            if (vetorX.get(i) < menor) {
                menor = vetorX.get(i);
                posicaoMenor = i;
            }
        }

        int diferenca = maior - menor;

        System.out.println("Maior: " + maior + " (Posição: " + posicaoMaior + ")");
        System.out.println("Menor: " + menor + " (Posição: " + posicaoMenor + ")");
        System.out.println("Diferença: " + diferenca);

        scanner.close();
    }
}
