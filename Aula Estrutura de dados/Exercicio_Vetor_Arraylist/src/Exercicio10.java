import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.print("Digite a media final do aluno "+ (i + 1) + ": ");
            double media = scanner.nextDouble();
            medias.add(media);
            scanner.nextLine();
        }
        int indiceMaiorMedia = 0;
        double maiorMedia = medias.get(0);

        for (int i = 1; i < medias.size(); i++) {
            if (medias.get(i) > maiorMedia) {
                maiorMedia = medias.get(i);
                indiceMaiorMedia = i;
            }
        }
        System.out.println("Aluno com maior média: " + nomes.get(indiceMaiorMedia));

        for (int i = 0; i < medias.size(); i++) {
            if (medias.get(i) < 7) {
                double notaExame = 10 - medias.get(i);
                System.out.println("Aluno " + nomes.get(i) + " precisa tirar " + notaExame + " no exame final para ser aprovado.");
            }
        }
    }
}
