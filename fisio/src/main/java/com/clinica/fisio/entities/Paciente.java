package com.clinica.fisio.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String cpf;
	    private LocalDate dataNascimento;
	    private String telefone;

		public Paciente(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone) {
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
			this.dataNascimento = dataNascimento;
			this.telefone = telefone;
		}
		
		public Paciente() {
			}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		public LocalDate getDataNascimento() {
			return dataNascimento;
		}


		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}


		public String getTelefone() {
			return telefone;
		}


		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

	    
	    
	}


