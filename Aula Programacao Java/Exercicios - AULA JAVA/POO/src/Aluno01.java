import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno01 {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();

        aluno01.codigo = 1234;
        aluno01.nome = "Dr. Webber";
        aluno01.dataNascimento = LocalDate.of(1999,12,16);
        aluno01.endereco = "Rua tal de tal";
        aluno01.telefone = "48 999172798";
        aluno01.matricula = "12345-6";
        aluno01.CPF = "123456789";
        aluno01.idade = 25;
        aluno01.Altura = 1.78;
        aluno01.peso = 95;

        notasMatematica.add(10);
        notasMatematica.add(9);

        notasPortugues.add(6);
        notasPortugues.add(7);
        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Portugues", notasPortugues);
        aluno01.disciplinasNotas = disciplinas;

        aluno01.imprimirDadosAluno();
        aluno01.calcularMediaPorMateria();
        aluno01.CalcularMediaGeral();
    }
}
