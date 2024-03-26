package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="nivel_ingles")
public class NivelIngles {
    @Id
    @Column(name="id_nivel_ingles")
    private Long idNivelIngles;

    @Column(name="nivel")
    private String nivel;

    public Long getIdNivelIngles() {
        return idNivelIngles;
    }

    public void setIdNivelIngles(Long idNivelIngles) {
        this.idNivelIngles = idNivelIngles;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
