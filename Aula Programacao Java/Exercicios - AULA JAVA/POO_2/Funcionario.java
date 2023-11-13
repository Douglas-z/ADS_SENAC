public class Funcionario extends Pessoa{

    private Double salario;
    private String cargo;

    public Double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
