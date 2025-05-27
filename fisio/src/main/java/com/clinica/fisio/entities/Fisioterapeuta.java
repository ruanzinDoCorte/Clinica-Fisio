package com.clinica.fisio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_profissional")
public class Fisioterapeuta {

	private String nome;
	private String especialidade;
	
	public Fisioterapeuta(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Fisioterapeuta() {
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
	
	
	
}
