import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        int quantidadeCaracteres = frase.length();

        if (quantidadeCaracteres >= 50) {
            System.out.println("Frase longa");
        } else {
            System.out.println("Frase curta");
        }
    }
}