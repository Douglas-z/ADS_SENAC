package com.example.ubsconnect.service;

import com.example.ubsconnect.enterprise.ValidationException;
import com.example.ubsconnect.model.Agendamentos;
import com.example.ubsconnect.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public Agendamentos salvar(Agendamentos entity) {
        validarCamposObrigatorios(entity);
        return repository.save(entity);
    }
    private void validarCamposObrigatorios(Agendamentos entity) {

        if (entity.getDataHora() == null) {
            throw new ValidationException("A data e hora não podem ser nulas!");
        }
        if (entity.getPaciente() == null) {
            throw new ValidationException("Paciente não pode ser nulo!");
        }
        List<Agendamentos> agendamentosDoPaciente = repository.findByPacienteAndDataHora(entity.getPaciente(), entity.getDataHora());
        if (!agendamentosDoPaciente.isEmpty()) {
            throw new ValidationException("Já existe um agendamento para esse paciente na mesma data e hora!");
        }
    }
    public List<Agendamentos> buscaTodos() {
        List<Agendamentos> agendamentos = repository.findAll();
        return agendamentos;
    }
    public Agendamentos buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Agendamentos alterar(Long id, Agendamentos alterado) {
        Optional<Agendamentos> encontrado = repository.findById(id);
        if(encontrado.isPresent()){
            Agendamentos agendamento = encontrado.get();
            agendamento.setDataHora(alterado.getDataHora());
            agendamento.setProfissional(alterado.getProfissional());
            agendamento.setPaciente(alterado.getPaciente());
            return repository.save(agendamento);
        }
        return null;
    }
    public void remover(Long id) {
        repository.deleteById(id);
    }
}
