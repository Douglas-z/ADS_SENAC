package com.example.ubsconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Profissional extends Pessoa {

    @OneToMany(mappedBy = "profissional")
    private List<Agendamentos> agendamentos;
    @Column(name = "crm", nullable = false, unique = true)
    private String crm;
    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public List<Agendamentos> getAgendamentos() {
        return agendamentos;
    }
    public void setAgendamentos(List<Agendamentos> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
