package com.clinica.fisio.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.fisio.entities.Consulta;
import com.clinica.fisio.services.ConsultaService;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> cadastrar(@RequestBody Consulta consulta) {
        Consulta salvo = consultaService.salvar(consulta);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listarTodos() {
        return ResponseEntity.ok(consultaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> buscarPorId(@PathVariable LocalDate id) {
        try {
            Consulta consulta = (Consulta) consultaService.buscarPorData(id);
            return ResponseEntity.ok(consulta);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/por-medico")
    public ResponseEntity<List<Consulta>> buscarPorMedico(@RequestParam String nomeMedico) {
        List<Consulta> consultas = consultaService.buscarPorNomeMedico(nomeMedico);
        return ResponseEntity.ok(consultas);
    }

    @GetMapping("/por-especialidade")
    public ResponseEntity<List<Consulta>> buscarPorEspecialidade(@RequestParam String especialidade) {
        List<Consulta> consultas = consultaService.buscarPorEspecialidade(especialidade);
        return ResponseEntity.ok(consultas);
    }

    @GetMapping("/por-data")
    public ResponseEntity<List<Consulta>> buscarPorData(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        List<Consulta> consultas = consultaService.buscarPorData(data);
        return ResponseEntity.ok(consultas);
    }
}
