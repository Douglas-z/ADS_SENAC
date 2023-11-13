import javax.swing.*;

public class Exercicio_4 {

    public static void main (String[] args) {

        String nome = (JOptionPane.
                showInputDialog(null, "Digite um nome:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(nome);

        String sobrenome = (JOptionPane.
                showInputDialog(null, "Digite seu sobrenome:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(sobrenome);

        JOptionPane.showMessageDialog(null, "Resultado", "Mensagem", JOptionPane.QUESTION_MESSAGE);
        System.out.print("Seu nome é " + nome + "e seu sobrenome é" + sobrenome);

    }
}
