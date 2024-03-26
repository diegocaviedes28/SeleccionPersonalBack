package com.softtek.seleccionprofesionales.model;


import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="discapacidad")
public class Discapacidad {
    @Id
    @Column(name="id_discapacidad")
    private Long idDiscapacidad;

    @Column(name="discapacidad")
    private String discapacidad;

    public Long getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(Long idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
}