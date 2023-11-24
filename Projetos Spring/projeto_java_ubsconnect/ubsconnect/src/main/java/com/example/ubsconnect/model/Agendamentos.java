package com.example.ubsconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Agendamentos extends EntityId {

    @Column(name = "data_consulta")
    private LocalDateTime dataHora;
    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private Profissional profissional;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public String toString() {
        return "Agendamentos{" +
                "dataHora=" + dataHora +
                ", profissional=" + profissional +
                ", paciente=" + paciente +
                '}';
    }
}
