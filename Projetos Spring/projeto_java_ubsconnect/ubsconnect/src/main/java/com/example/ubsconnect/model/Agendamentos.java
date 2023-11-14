package com.example.ubsconnect.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Agendamentos extends EntityId {

    private boolean confirmado;
    private LocalDateTime dataHora;
    @ManyToOne
    private Profissional profissional;
    @ManyToOne
    private Paciente paciente;

    public void confirmarAgendamento() {
        if (!confirmado) {
            this.confirmado = true;
            enviarConfirmacaoPorEmail();
        }
    }
    private void enviarConfirmacaoPorEmail() {
        // Lógica para enviar e-mail de confirmação ao paciente
        System.out.println("E-mail de confirmação enviado para " + paciente.getNome());
    }

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

}
