package com.example.ubsconnect.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class NotificacaoService extends EntityId {

    @OneToOne
    private Paciente paciente;

    public void enviarNotificacao(String mensagem) {
        // fazer logica
    }

}
