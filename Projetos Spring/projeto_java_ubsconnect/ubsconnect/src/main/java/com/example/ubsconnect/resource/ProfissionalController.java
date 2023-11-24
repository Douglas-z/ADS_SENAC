package com.example.ubsconnect.resource;

import com.example.ubsconnect.model.Agendamentos;
import com.example.ubsconnect.model.Profissional;
import com.example.ubsconnect.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/profissionais")
public class ProfissionalController extends AbstractController{

    @Autowired
    private ProfissionalService service;

    @PostMapping
    public ResponseEntity create(@RequestBody Profissional entity) {
        Profissional save = service.salvar(entity);
        return ResponseEntity.created(URI.create("/api/profissionais/" + entity.getId())).body(save);
    }
    @GetMapping
    public ResponseEntity findAll() {
        List<Profissional> profissionais = service.buscaTodos();
        return ResponseEntity.ok(profissionais);
    }
    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        Profissional profissional = service.buscaPorId(id);
        return ResponseEntity.ok(profissional);
    }
    @DeleteMapping("{id}")
    public ResponseEntity remove(@PathVariable("id") Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Profissional entity) {
        Profissional alterado = service.alterar(id, entity);
        return ResponseEntity.ok().body(alterado);
    }
}
