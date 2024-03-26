package com.softtek.seleccionprofesionales.model;


import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="idioma")
public class Idioma {
    @Id
    @Column(name="id_idioma")
    private Long idIdioma;

    @Column(name="idioma")
    private String idioma;

    public Long getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Long idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}