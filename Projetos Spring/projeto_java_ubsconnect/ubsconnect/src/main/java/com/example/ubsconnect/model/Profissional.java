package com.example.ubsconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Profissional extends Pessoa {

    @OneToMany(mappedBy = "profissional")
    private List<Agendamentos> agendamentos;
    @Column(name = "crm", nullable = false)
    private String crm;
    @Column(name = "consultas_agendadadas", nullable = false)
    private String consultasAgendadas;
    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    public void realizarAtendimento(Paciente paciente, String dataHora) {
        Agendamentos agendamento = new Agendamentos();
        agendamento.setPaciente(paciente);
        agendamento.setProfissional(this);
        agendamento.setDataHora(LocalDateTime.parse(dataHora));
        // Lógica para realizar o atendimento
    }

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
