import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int soma = 0;

        Integer inteiro = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro);

        Integer  inteiro2 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um novo numero:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro2);

        soma = inteiro + inteiro2;

        JOptionPane.showMessageDialog(null, "O resultado é " +soma, "Mensagem", JOptionPane.QUESTION_MESSAGE);
        System.out.print("Resultado é: "+ soma);
    }
}