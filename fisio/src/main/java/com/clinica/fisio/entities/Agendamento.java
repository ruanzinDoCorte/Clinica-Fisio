package com.clinica.fisio.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime dataHora;
	
	@ManyToOne
	private Paciente paciente;
	
	@ManyToOne
	private Fisioterapeuta fisio;

	private Fisioterapeuta fisioterapeuta;
	
	

	public Agendamento(Long id, LocalDateTime dataHora, Paciente paciente, Fisioterapeuta profissional) {
		this.id = id;
		this.dataHora = dataHora;
		this.paciente = paciente;
		this.fisioterapeuta = fisio;
	}
	
	public Agendamento() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Fisioterapeuta getProfissional() {
		return fisio;
	}

	public void setProfissional(Fisioterapeuta fisioterapeuta) {
		this.fisio = fisioterapeuta;
	}
	
	
 }
