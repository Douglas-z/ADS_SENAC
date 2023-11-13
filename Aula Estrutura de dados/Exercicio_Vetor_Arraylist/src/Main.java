import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<Double> list = new ArrayList<>();
        Scanner scan =new Scanner(System.in);

        for (int i=0;i<5;i++) {
            System.out.println("informe um numero: ");
            list.add(scan.nextDouble());
        }
        double soma = 0;
        double maior = list.get(0);
        double menor = list.get(0);

        for (double numero : list) {
            soma += numero;

            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }
        double media = soma / list.size();
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
        System.out.println("Media = " + media);

        scan.close();
    }
}
