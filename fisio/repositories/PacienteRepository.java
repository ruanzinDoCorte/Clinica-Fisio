package com.clinica.fisio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.fisio.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Optional<Paciente> findByNome(String nome);
}