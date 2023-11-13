
public class Exercicio3_segundoprograma {
    public static void main(String[] args) {
        String frase = "Desenvolvimento é legal.";

        String novaFrase = substituirPalavra(frase, "Desenvolvimento", "Programação");

        System.out.println("Frase original: " + frase);
        System.out.println("Nova frase: " + novaFrase);
    }
    public static String substituirPalavra(String frase, String palavraAntiga, String palavraNova) {
        return frase.replace(palavraAntiga, palavraNova);


    }
}