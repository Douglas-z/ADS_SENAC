import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    Bolsa bolsa;
    Filiacao filiacao;
    //Integer codigo;
    //String nome;
    //LocalDate dataNascimento;
    String telefone;
    String endereco;
    List<Disciplina> disciplinas = new ArrayList<>();
    List<Frequencia> frequencias = new ArrayList<>();


    public Integer calcularMediaGeral() {
        Integer somaMedias = 0;
        for (Disciplina disciplina : disciplinas) {
            somaMedias += disciplina.calcularMediaDisciplina();
        }

        return somaMedias / disciplinas.size();
    }
}
