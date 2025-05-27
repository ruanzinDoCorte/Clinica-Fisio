package com.clinica.fisio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.fisio.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
