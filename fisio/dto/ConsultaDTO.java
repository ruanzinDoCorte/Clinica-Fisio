package com.clinica.fisio.dto;

import java.time.LocalDate;

public class ConsultaDTO {

    private Long id;
    private LocalDate data;
    private String nomePaciente;
    private String nomeMedico;
    private String especialidade;

    public ConsultaDTO() {}

    public ConsultaDTO(Long id, LocalDate data, String nomePaciente, String nomeMedico, String especialidade) {
        this.id = id;
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
