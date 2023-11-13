import java.util.Stack;

public class Exercicio_2 {
    public static void main(String[] args) {

        Stack<Integer> P = new Stack<>();
        P.push(10);
        P.push(22);
        P.push(33);
        P.push(44);

        Stack<Integer> PilhaAuxiliar1 = new Stack<>();
        Stack<Integer> PilhaAuxiliar2 = new Stack<>();
        Stack<Integer> PilhaAuxiliar3 = new Stack<>();


        while (!P.isEmpty()) {
            PilhaAuxiliar1.push(P.pop());
        }
        while (!PilhaAuxiliar1.isEmpty()) {
            PilhaAuxiliar2.push(PilhaAuxiliar1.pop());
        }
        while (!PilhaAuxiliar2.isEmpty()) {
            PilhaAuxiliar3.push(PilhaAuxiliar2.pop());
        }
        while (!PilhaAuxiliar3.isEmpty()){
            P.push(PilhaAuxiliar3.pop());
        }

        System.out.println("Pilha P invertida:");
        while (!P.isEmpty()) {
            System.out.print(P.pop() + " ");
        }
    }
}


