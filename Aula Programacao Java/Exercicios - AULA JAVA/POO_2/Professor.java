import java.time.LocalDate;

public class Professor extends Pessoa{

    //String nome;
    String matricula;
    LocalDate dataContratacao;
    String telefone;
    String endereco;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Professor(String nome, String matricula, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
    }

    public Professor(String nome, String matricula, String telefone, String endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}