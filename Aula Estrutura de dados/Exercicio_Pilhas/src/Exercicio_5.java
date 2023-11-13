import java.util.Stack;

public class Exercicio_5 {
    public static void main(String[] args) {
        String texto = "Este é um exemplo de texto que será invertido. Outro exemplo.";

        String resultado = inverterLetras(texto);
        System.out.println(resultado);
    }
    public static String inverterLetras(String texto) {
        String[] palavras = texto.split("\\s+"); // Divide o texto em palavras usando espaços em branco como delimitador
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();

            // Empilha as letras da palavra
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            // Desempilha as letras para formar a palavra invertida
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            resultado.append(" "); // Adiciona um espaço em branco após cada palavra
        }
        return resultado.toString().trim(); // Remove o espaço em branco extra no final
    }
}
