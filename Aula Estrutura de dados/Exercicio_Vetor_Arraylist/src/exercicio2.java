import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> triplo = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("informe um numero: ");
            int A = scan.nextInt();
            list.add(A);

        }
        for (int j = 0; j < 5; j++) {
            triplo.add(list.get(j)*3);
        }
        System.out.println("O triplo do vetor A é: " + triplo);
    }
}
