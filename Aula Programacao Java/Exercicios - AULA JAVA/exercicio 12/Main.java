import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Secretaria secretaria = new Secretaria();
        secretaria.setBonus(500.0);
        secretaria.setHorasExtras(150.00);
        secretaria.setSalarioFamilia(200.00);
        secretaria.setSalarioContratual(3000.00);

        System.out.println(secretaria.getSalario());

        Professor professor = new Professor();
        professor.setCargaHoraria(85.50);
        professor.setValorHora(39.95);

        System.out.println("Salario do professor é: " + professor.getSalario());

        Diretor diretor = new Diretor();
        diretor.setSalarioContratual(1500.00);
        diretor.setBonusFaturamento(500.00);
        diretor.setSalarioFamilia(2000.00);
        diretor.setComissao(1000.00);

        System.out.println("Salario do diretor é: "+ diretor.getSalario());

    }
}












