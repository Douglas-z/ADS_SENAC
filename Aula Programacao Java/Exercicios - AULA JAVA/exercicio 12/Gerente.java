public class Gerente extends Diretor {

    private Double salarioContratual;
    private Double bonusVendas;
    private Double salarioFamilia;
    private Double fatorM;

    @Override
    public Double getSalarioContratual() {
        return salarioContratual;
    }

    @Override
    public void setSalarioContratual(Double salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public Double getBonusVendas() {
        return bonusVendas;
    }

    public void setBonusVendas(Double bonusVendas) {
        this.bonusVendas = bonusVendas;
    }

    @Override
    public Double getSalarioFamilia() {
        return salarioFamilia;
    }

    @Override
    public void setSalarioFamilia(Double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public Double getFatorM() {
        return fatorM;
    }

    public void setFatorM(Double fatorM) {
        this.fatorM = fatorM;
    }
}
