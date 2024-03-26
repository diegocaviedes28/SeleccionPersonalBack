package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="postulante_discapacidad")
public class PostulanteDiscapacidad {
    @Id
    @Column(name="id_postulante")
    private Long idPostulante;

    @Id
    @Column(name="id_discapacidad")
    private Long idDiscapacidad;

    public Long getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(Long idPostulante) {
        this.idPostulante = idPostulante;
    }

    public Long getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(Long idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }
}
