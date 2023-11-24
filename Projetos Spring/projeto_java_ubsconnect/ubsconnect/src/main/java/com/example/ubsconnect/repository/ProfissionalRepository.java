package com.example.ubsconnect.repository;

import com.example.ubsconnect.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long>  {

    public Profissional findByCrm(String crm);
}
