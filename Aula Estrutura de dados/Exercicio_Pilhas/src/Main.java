import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> Pilha1 = new Stack<>();
        Stack<Integer> Pilha2 = new Stack<>();

        Pilha1.push(1);
        Pilha1.push(2);
        Pilha1.push(3);

        System.out.println("Pilha1 antes da transferência: " + Pilha1);
        System.out.println("Pilha2 antes da transferência: " + Pilha2);

        if (!Pilha1.isEmpty()) {
            int elementoTransferido = Pilha1.pop();
            Pilha2.push(elementoTransferido);
        } else {
            System.out.println("A pilha1 está vazia, não é possível transferir elementos.");
        }
        System.out.println("Pilha1 depois da transferência: " + Pilha1);
        System.out.println("Pilha2 depois da transferência: " + Pilha2);
    }
}