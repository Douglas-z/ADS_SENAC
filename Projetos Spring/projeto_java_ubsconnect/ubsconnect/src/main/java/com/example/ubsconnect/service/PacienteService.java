package com.example.ubsconnect.service;

import com.example.ubsconnect.enterprise.ValidationException;
import com.example.ubsconnect.model.Paciente;
import com.example.ubsconnect.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public Paciente salvar(Paciente entity) {
        validarCamposObrigatorios(entity);
        return repository.save(entity);
    }
    private void validarCamposObrigatorios(Paciente entity) {

        if (entity.getNome().length() < 3) {
            throw new ValidationException("O nome deve ter mais de 3 caracteres!");
        }
        if (repository.findByCpf(entity.getCpf()) != null) {
            throw new ValidationException("Ja existe um paciente com esse CPF cadastrado!");
        }
    }
    public List<Paciente> buscaTodos() {
        return repository.findAll();
    }
    public Paciente buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Paciente alterar(Long id, Paciente alterado) {
        Optional<Paciente> encontrado = repository.findById(id);
        if(encontrado.isPresent()){
            Paciente paciente = encontrado.get();
            paciente.setCpf(alterado.getCpf());
            paciente.setAlergias(alterado.getAlergias());
            paciente.setNome(alterado.getNome());
            paciente.setEmail(alterado.getEmail());
            paciente.setTelefone(alterado.getTelefone());
            paciente.setEndereco(alterado.getEndereco());
            paciente.setDataNascimento(alterado.getDataNascimento());
            return repository.save(paciente);
        }
        return null;
    }
    public void remover(Long id) {
        repository.deleteById(id);
    }
}
