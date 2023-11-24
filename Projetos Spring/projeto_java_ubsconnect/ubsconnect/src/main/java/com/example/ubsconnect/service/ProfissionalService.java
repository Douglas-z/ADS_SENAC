package com.example.ubsconnect.service;

import com.example.ubsconnect.enterprise.ValidationException;
import com.example.ubsconnect.model.Profissional;
import com.example.ubsconnect.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfissionalService {

    @Autowired
    private ProfissionalRepository repository;

    public Profissional salvar(Profissional entity) {
        validarCamposObrigatorios(entity);
        return repository.save(entity);
    }
    private void validarCamposObrigatorios(Profissional entity) {

        if (entity.getNome().length() < 3) {
            throw new ValidationException("O nome deve ter mais de 3 caracteres!");
        }
        if (repository.findByCrm(entity.getCrm()) != null) {
            throw new ValidationException("Já existe um profissional com esse CRM cadastrado!");
        }
    }
    public List<Profissional> buscaTodos() {
        return repository.findAll();
    }
    public Profissional buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Profissional alterar(Long id, Profissional alterado) {
        Optional<Profissional> encontrado = repository.findById(id);
        if (encontrado.isPresent()) {
            Profissional profissional = encontrado.get();
            profissional.setCrm(alterado.getCrm());
            profissional.setEspecialidade(alterado.getEspecialidade());
            profissional.setNome(alterado.getNome());
            profissional.setEmail(alterado.getEmail());
            profissional.setTelefone(alterado.getTelefone());
            profissional.setEndereco(alterado.getEndereco());
            profissional.setDataNascimento(alterado.getDataNascimento());
            return repository.save(profissional);
        }
        return null;
    }
    public void remover(Long id) {
        repository.deleteById(id);
    }
}
