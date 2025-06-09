package com.clinica.fisio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.fisio.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Optional<Medico> findByNome(String nome);
    List<Medico> findByEspecialidade(String especialidade);
    }
