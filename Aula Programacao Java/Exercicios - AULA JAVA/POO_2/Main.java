import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Aluno douglas = new Aluno();
        douglas.setNome() = "Douglas";

        Aluno juliana = new Aluno();
        juliana.setCodigo();
        juliana.setNome();

        Funcionario douglas = new Funcionario();
        douglas.setCodigo();
        douglas.setNome();

        Filiacao filiacao = new Filiacao();
        filiacao.nomeMae = "Mariazinha";
        filiacao.nomePai = "Joaozinho";
        douglas.filiacao = filiacao;

        Bolsa bolsa = new Bolsa();
        bolsa.descricao = "PMC";
        bolsa.dataInicial = LocalDate.of(2032,1,1);
        bolsa.dataFinal = LocalDate.of(2023,12,31);
        douglas.bolsa = bolsa;

        Professor bruno = new Professor();
        bruno.setCodigo() = "12321";

        Professor professor = new Professor("Bruno kurzawe", "1037");
        professor.nome = "Bruno kurzawe";
        professor.dataContratacao = LocalDate.of(2023, Month.JULY,31);
        professor.matricula = "1037";

        Professor professor2 = new Professor("Cris", "1038");
        professor2.nome = "Cris";
        professor2.matricula = "1038";
        professor2.telefone = "343243234";
        professor2.endereco = "rua tal";

        Professor professor3 = new Professor("Edilson", "1039");
        professor3.nome = "Edilson";
        professor3.matricula = "1039";
        professor3.telefone = "34324234";
        professor3.endereco = "rua tal";

        Disciplina matematica = new Disciplina();
        matematica.adicionaNota(9);
        matematica.adicionaNota(7);

        Disciplina portugues = new Disciplina();
        portugues.adicionaNota(8);
        portugues.adicionaNota(8);

        Frequencia aula01 = new Frequencia();
        aula01.dataAula = LocalDate.of(2023,9,12);
        aula01.presenca = true;
        douglas.frequencias.add(aula01);

        douglas.disciplinas.add(matematica);
        douglas.disciplinas.add(portugues);

        Integer notaGeral = douglas.calcularMediaGeral();
        System.out.println("O aluno " + douglas.setNome() + "tem media geral " +notaGeral);

        System.out.println(professor);
        System.out.println(professor2);
        System.out.println(professor3);
    }
}