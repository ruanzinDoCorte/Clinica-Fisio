package com.clinica.fisio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String especialidade;
	private String email;
	private String fone;
	
	
	public Medico() {
	}


	public Medico(String nome, String especialidade, String email, String fone) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.email = email;
		this.fone = fone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

}
