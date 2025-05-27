package com.clinica.fisio.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.fisio.entities.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
	 List<Agendamento> findByDataHoraBetween(LocalDateTime inicio, LocalDateTime fim);

}
