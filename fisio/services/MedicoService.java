package com.clinica.fisio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.fisio.entities.Consulta;
import com.clinica.fisio.entities.Medico;
import com.clinica.fisio.entities.Paciente;
import com.clinica.fisio.repositories.ConsultaRepository;
import com.clinica.fisio.repositories.MedicoRepository;
import com.clinica.fisio.repositories.PacienteRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico salvar(Medico medico) {
        return medicoRepository.save(medico);
    }

    public List<Medico> listarTodos() {
        return medicoRepository.findAll();
    }

    public Medico buscarPorId(Long id) {
        return medicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));
    }

    public Optional<Medico> buscarPorNome(String nome) {
        return medicoRepository.findByNome(nome);
    }

    public List<Medico> buscarPorEspecialidade(String especialidade) {
        return medicoRepository.findByEspecialidade(especialidade);
    }
}
