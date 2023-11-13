package com.example.ubsconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Agendamentos {

    @Id
    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;
    @Column(name = "profissional", nullable = false)
    private String profissional;
    @Column(name = "paciente", nullable = false)
    private String paciente;

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}
