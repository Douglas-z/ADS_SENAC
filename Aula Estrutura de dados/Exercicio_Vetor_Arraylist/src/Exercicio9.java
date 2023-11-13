import java.util.ArrayList;

public class Exercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> logica = new ArrayList<>();
        logica.add(2513);
        logica.add(2134);
        logica.add(5412);
        logica.add(4217);
        logica.add(2121);
        logica.add(3749);
        logica.add(4012);
        logica.add(5122);
        logica.add(5551);
        logica.add(5432);
        logica.add(2122);
        logica.add(2098);

        ArrayList<Integer> linguagem = new ArrayList<>();
        linguagem.add(3444);
        linguagem.add(2121);
        linguagem.add(4331);
        linguagem.add(5551);
        linguagem.add(4335);
        linguagem.add(2766);
        linguagem.add(2098);
        linguagem.add(4775);
        linguagem.add(3749);

        ArrayList<Integer> alunosEmAmbasAsDisciplinas = new ArrayList<>();

        for (Integer codigo : logica) {
            if (linguagem.contains(codigo)) {
                alunosEmAmbasAsDisciplinas.add(codigo);
            }
        }
        System.out.println("Alunos cursando ambas as disciplinas:");
        for (Integer codigo : alunosEmAmbasAsDisciplinas) {
            System.out.println(codigo);
        }
    }
}