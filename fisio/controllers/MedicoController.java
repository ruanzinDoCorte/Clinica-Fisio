package com.clinica.fisio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.fisio.entities.Medico;
import com.clinica.fisio.services.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    public ResponseEntity<Medico> cadastrar(@RequestBody Medico medico) {
        return ResponseEntity.ok(medicoService.salvar(medico));
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listarTodos() {
        return ResponseEntity.ok(medicoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(medicoService.buscarPorId(id));
    }

    @GetMapping("/por-nome")
    public ResponseEntity<Medico> buscarPorNome(@RequestParam String nome) {
        return medicoService.buscarPorNome(nome)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/por-especialidade")
    public ResponseEntity<List<Medico>> buscarPorEspecialidade(@RequestParam String especialidade) {
        return ResponseEntity.ok(medicoService.buscarPorEspecialidade(especialidade));
    }
}
