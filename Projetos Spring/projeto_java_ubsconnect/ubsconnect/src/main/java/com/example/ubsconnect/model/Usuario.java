package com.example.ubsconnect.model;

import javax.persistence.*;

@Entity
public class Usuario extends EntityId{

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
    @Column(nullable = false)
    private String nomeUsuario;
    @Column(nullable = false)
    private String senha;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
