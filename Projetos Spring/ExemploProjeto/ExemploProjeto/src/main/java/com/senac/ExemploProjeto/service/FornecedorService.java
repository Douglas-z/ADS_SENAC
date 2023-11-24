package com.senac.ExemploProjeto.service;

import com.senac.ExemploProjeto.model.Fornecedor;
import com.senac.ExemploProjeto.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    public Fornecedor salvar(Fornecedor entity) {
        return repository.save(entity);
    }
    public List<Fornecedor> buscaTodos() {
        return repository.findAll();
    }
    public Fornecedor buscaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Fornecedor alterar(Long id, Fornecedor alterado) {
        Optional<Fornecedor> encontrado = repository.findById(id);
        if(encontrado.isPresent()){
            Fornecedor fornecedor = encontrado.get();
            fornecedor.setCnpj(alterado.getCnpj());
            fornecedor.razaoSocial(alterado.getRazaoSocial());
            fornecedor.setNome(alterado.getNome());
            fornecedor.setEmail(alterado.getTelefone());
            fornecedor.setTelefone(alterado.getTelefone());
            return repository.save(fornecedor);
        }
        return null;
    }
    public void remover(Long id) {
        repository.deleteById(id);
    }
}
