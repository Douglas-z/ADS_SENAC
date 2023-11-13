import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        // Para fazer o metodo mergeSort é necessario criar um vetor principal.
        // E um vetor auxiliar para ajudar nas comparaçoes, quando precisar.

        int[] vetor = {38,27,43,10,23,56,47,89,65};
        int[] auxiliar = new int[vetor.length]; // Necessario ter mesmo tamanho, por isso o vetor.length

        // Chamar o metodo mergeSort, adicionar o vetor principal e auxiliar, e a posiçao inicial e final
        mergeSort(vetor, auxiliar, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor)); // Mostrar resultado do vetor pronto
    }
    // Metodo mergeSort que divide o array em duas metades:
    private static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if(inicio<fim) {  // garante que a posiçao inicial seja menor que a posiçao final
            int meio = (inicio+fim)/2; // criando um meio do vetor, sendo a media entre inicio e fim
            mergeSort(vetor, auxiliar, inicio, meio); // parte esquerda do array
            mergeSort(vetor, auxiliar, meio+1, fim); // parte direita do array, no caso meio+1 e fim
            intercalar(vetor,auxiliar,inicio, meio, fim); // metodo intercalar que copia elementos do vetor original para o aux
        }
    }

    // Intercalando as metades para ordena-las e obter um array final ordenado
    private static void intercalar(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) { // o intercalar copia os elementos do vetor original para o aux
            auxiliar[i] = vetor[i];
        }
        int esq = inicio; // inicio vetor auxiliar
        int dir = meio+1; // direita vetor auxiliar

        for (int i=inicio; i<=fim; i++) { // Percorrer o vetor original de inicio ate fim
            if (esq > meio) { // verifica se todos os elementos da metade esquerda ja foram copiados para o vetor aux
                vetor[i] = auxiliar[dir++];
            } else if (dir > fim) { // 2 condiçao: verifica se os elementos da metade dir ja foram copiados p/ vetor aux
                vetor[i] = auxiliar[esq++];
            } else if (auxiliar[esq] < auxiliar[dir]) { // 3 condiçao: verifica se elemento na posicao esq é menor que elemento da dir
                vetor[i] = auxiliar[esq++];
            } else { // se nenhuma condiçao anterior for verdadeira, significa que o elemento na posicao dir, é menor ou igual a posiçao esq
                vetor[i] = auxiliar[dir++];
                // o loop continua ate que todos os elementos das duas metades esq e dir tenham sido combinados no vetor auxiliar
            }
        }
    }
}
