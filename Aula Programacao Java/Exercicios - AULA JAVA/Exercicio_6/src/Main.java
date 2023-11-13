import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan =new Scanner(System.in);

        for (int i=0;i<10;i++) {
            System.out.println("informe um numero: ");
            list.add(scan.nextInt());
        }
        int soma = 0;
        int maior = list.get(0);
        int menor = list.get(0);
        int qtdePar = 0;

        for (int numero : list) {
            soma += numero;

            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
            if (numero % 2 == 0){
                qtdePar++;
            }
        }
        int media = soma / list.size();
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
        System.out.println("Media = " + media);
        System.out.println("Quant de numeros pares: " + qtdePar);

        scan.close();
    }
}
