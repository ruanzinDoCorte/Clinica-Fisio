package com.clinica.fisio.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.fisio.entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByMedico_Nome(String nomeMedico);
    List<Consulta> findByMedico_Especialidade(String especialidade);
    List<Consulta> findByData(LocalDate data);
}

