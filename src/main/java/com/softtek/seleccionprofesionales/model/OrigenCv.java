package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="origen_cv")
public class OrigenCv {
    @Id
    @Column(name="id_origen_cv")
    private Long idOrigenCv;

    @Column(name="origen")
    private String origen;

    public Long getIdOrigenCv() {
        return idOrigenCv;
    }

    public void setIdOrigenCv(Long idOrigenCv) {
        this.idOrigenCv = idOrigenCv;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}