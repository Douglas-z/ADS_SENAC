import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um Número: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite um Número: ");
            int numero2 = scanner.nextInt();

            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int divisao = numero1 / numero2;
            int multiplicacao = numero1 * numero2;

            System.out.println("Resultado da soma: " + soma);
            System.out.println("Resultado da subtração: " + subtracao);
            System.out.println("Resultado da multiplicação: " + multiplicacao);
            System.out.println("Resultado da divisão: " + divisao);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisao por 0 invalida ");
        }
    }
}
