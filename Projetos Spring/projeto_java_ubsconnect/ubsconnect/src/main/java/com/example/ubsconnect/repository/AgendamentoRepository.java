package com.example.ubsconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ubsconnect.model.Agendamentos;

import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamentos, Long> {

}
