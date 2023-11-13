package com.example.ubsconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Profissional extends Pessoa {
    @Column(name = "crm", nullable = false)
    private String crm;
    @Column(name = "consultas_agendadadas", nullable = false)
    private String consultasAgendadas;
    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(String consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
