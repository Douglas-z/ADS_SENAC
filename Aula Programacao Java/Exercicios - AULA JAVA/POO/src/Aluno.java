import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {

    Integer codigo;
    String nome;
    String matricula;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    Integer idade;
    String CPF;
    Double Altura;
    Integer peso;
    Map<String, List<Integer>> disciplinasNotas;


    public void imprimirDadosAluno() {
        System.out.println("Codigo: "+ codigo + " Nome: "+ nome + " Data de nascimento: "+ dataNascimento);
    }

    public void calcularMediaPorMateria() {

        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina: " +nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            System.out.println("Media: "+ (somaNotas / notas.size()));
        }
    }
    public void CalcularMediaGeral() {

        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            List<Integer> notas = entry.getValue();

            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
                int nota1 = 0;
                int nota2 = 0;
                int mediaGeral = nota1 + nota2 / 2;
                System.out.println("Media Geral: " + mediaGeral + (somaNotas / notas.size()));
            }
        }
    }
}

