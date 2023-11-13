import java.util.Scanner;
import java.util.Stack;

public class Exercicio_4 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        Stack<Character> pilha = new Stack<>();

        System.out.print("Informe uma frase terminada por ponto final: ");
        String frase = scanner.nextLine();
        // Preenchendo a pilha com os caracteres da frase

        char[] caracteres = frase.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if (c != '.') {
                pilha.push(c);
            }
        }
        System.out.print("Frase invertida: ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();
        scanner.close();
    }
}