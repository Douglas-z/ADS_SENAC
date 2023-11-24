package com.example.ubsconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ubsconnect.model.Agendamentos;
import com.example.ubsconnect.model.Paciente;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamentos, Long> {

    public List<Agendamentos> findByPacienteAndDataHora(Paciente paciente, LocalDateTime dataHora);
}
