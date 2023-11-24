package com.example.ubsconnect.repository;

import com.example.ubsconnect.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    public Paciente findByCpf(String cpf);
}
