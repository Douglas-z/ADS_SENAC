package com.example.ubsconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Paciente extends Pessoa{

    @OneToMany(mappedBy = "paciente")
    private List<Agendamentos> agendamentos;
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Column(name = "alergias", nullable = false, unique = true)
    private String alergias;

    public List<Agendamentos> getAgendamentos() {
        return agendamentos;
    }
    public void setAgendamentos(List<Agendamentos> agendamentos) {
        this.agendamentos = agendamentos;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

}
