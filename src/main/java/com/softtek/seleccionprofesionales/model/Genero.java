package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="genero")
public class Genero {
    @Id
    @Column(name="id_genero")
    private Long idGenero;

    @Column(name="genero")
    private String genero;

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}