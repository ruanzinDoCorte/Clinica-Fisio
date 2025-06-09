package com.clinica.fisio.services;

import com.clinica.fisio.entities.Consulta;
import com.clinica.fisio.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarTodas() {
        return consultaRepository.findAll();
    }

    public List<Consulta> buscarPorNomeMedico(String nome) {
        return consultaRepository.findByMedico_Nome(nome);
    }

    public List<Consulta> buscarPorEspecialidade(String especialidade) {
        return consultaRepository.findByMedico_Especialidade(especialidade);
    }

    public List<Consulta> buscarPorData(LocalDate data) {
        return consultaRepository.findByData(data);
    }
}