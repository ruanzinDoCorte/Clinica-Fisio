package com.clinica.fisio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.fisio.entities.Fisioterapeuta;
import com.clinica.fisio.repositories.FisioterapeutaRepository;

@RestController
@RequestMapping("/api/profissionais")
public class FisioterapeutaController {

    @Autowired
    private FisioterapeutaRepository profissionalRepository;

    @GetMapping
    public List<Fisioterapeuta> listarTodos() {
        return fisioterapeutaRepository.findAll();
    }

    @PostMapping
    public Fisioterapeuta salvar(@RequestBody Fisioterapeuta fisioterapeuta) {
        return fisioterapeutaRepository.save(fisioterapeuta);
    }

    @GetMapping("/{id}")
    public Profissional buscarPorId(@PathVariable Long id) {
        return profissionalRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Profissional atualizar(@PathVariable Long id, @RequestBody Profissional profissional) {
        profissional.setId(id);
        return profissionalRepository.save(profissional);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        profissionalRepository.deleteById(id);
    }
}
