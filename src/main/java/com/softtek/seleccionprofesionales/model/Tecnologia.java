package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "tecnologia")
public class Tecnologia {

    @Id
    @Column(name="id_tecnologia")
    private Long idTecnologia;

    @Column(name="tecnologia")
    private String tecnologia;

    public Long getIdTecnologia() {
        return idTecnologia;
    }

    public void setIdTecnologia(Long idTecnologia) {
        this.idTecnologia = idTecnologia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
