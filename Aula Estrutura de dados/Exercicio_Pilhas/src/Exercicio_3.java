import java.util.Stack;

public class Exercicio_3 {
    public static boolean saoiguais (Stack<Integer> P1, Stack<Integer> P2) {
        return P1.equals(P2);
    }
        public static void main (String[] args) {

            Stack<Integer> P1 = new Stack<>();
            Stack<Integer> P2 = new Stack<>();

            P1.push(1);
            P1.push(2);
            P1.push(3);
            P1.push(4);

            P2.push(1);
            P2.push(2);
            P2.push(3);
            P2.push(4);

            System.out.println("Pilha 1 ficou assim: " + P1);
            System.out.println("Pilha 2 ficou assim: " + P2);

            boolean resultado = saoiguais(P1, P2);

            if (resultado) {
                System.out.println("As pilhas sao iguais ");
            } else {
                System.out.println("As pilhas nao sao iguais ");
            }
    }
}
