public class Diretor extends Funcionario {

    private Double salarioContratual;
    private Double bonusFaturamento;
    private Double salarioFamilia;
    private Double comissao;
    private Double bonus;

    @Override
    public Double getSalario() {
        return (salarioContratual + bonusFaturamento + salarioFamilia + comissao);
    }

    public Double getSalarioContratual() {
        return salarioContratual;
    }

    public void setSalarioContratual(Double salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public Double getBonusFaturamento() {
        return bonusFaturamento;
    }

    public void setBonusFaturamento(Double bonusFaturamento) {
        this.bonusFaturamento = bonusFaturamento;
    }

    public Double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(Double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "salarioContratual=" + salarioContratual +
                ", bonusFaturamento=" + bonusFaturamento +
                ", salarioFamilia=" + salarioFamilia +
                ", comissao=" + comissao +
                ", bonus=" + bonus +
                '}';
    }
}
