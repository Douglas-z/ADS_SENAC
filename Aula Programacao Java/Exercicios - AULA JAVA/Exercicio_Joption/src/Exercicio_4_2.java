import javax.swing.*;

public class Exercicio_4_2 {

    public static void main(String[] args) {
        String[] diasDaSemana = {
                "Domingo", "Segunda-feira", "Terça-feira",
                "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"
        };

        String input = JOptionPane.showInputDialog("Digite um número de 1 a 7:");
        int numero = Integer.parseInt(input);

        if (numero >= 1 && numero <= 7) {
            String diaDaSemana = diasDaSemana[numero - 1];
            JOptionPane.showMessageDialog(null, "O dia da semana correspondente é: " + diaDaSemana);
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido. Digite um número de 1 a 7.");
        }
    }
}
