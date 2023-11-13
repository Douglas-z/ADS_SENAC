import java.util.ArrayList;
import java.util.Scanner;

// Codigo feito com ajuda

public class Exercicio11 {
    public static void main(String[] args) {
        ArrayList<Integer> codigosProdutos = new ArrayList<>();
        ArrayList<Integer> estoqueProdutos = new ArrayList<>();

        // Inicializando o estoque de produtos
        for (int i = 0; i < 10; i++) {
            codigosProdutos.add(i + 1); // Códigos de produtos de 1 a 10
            estoqueProdutos.add(10);   // Estoque inicial de 10 unidades por produto
        }

        Scanner scanner = new Scanner(System.in);
        int codigoCliente, codigoProduto, quantidade;

        while (true) {
            System.out.print("Digite o código do cliente (0 para sair): ");
            codigoCliente = scanner.nextInt();
            if (codigoCliente == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.print("Digite o código do produto desejado: ");
            codigoProduto = scanner.nextInt();

            int produtoIndex = codigosProdutos.indexOf(codigoProduto);

            if (produtoIndex == -1) {
                System.out.println("Código inexistente");
            } else {
                System.out.print("Digite a quantidade desejada: ");
                quantidade = scanner.nextInt();

                if (quantidade <= estoqueProdutos.get(produtoIndex)) {
                    estoqueProdutos.set(produtoIndex, estoqueProdutos.get(produtoIndex) - quantidade);
                    System.out.println("Pedido atendido. Obrigado e volte sempre");
                } else {
                    System.out.println("Não temos estoque suficiente desta mercadoria");
                }
            }
        }

        System.out.println("Estoque atualizado:");
        for (int i = 0; i < codigosProdutos.size(); i++) {
            System.out.println("Código do Produto: " + codigosProdutos.get(i) + " - Estoque: " + estoqueProdutos.get(i));
        }

        scanner.close();
    }
}