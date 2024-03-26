package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "perfil")
public class Perfil {
    @Id
    @Column(name="id_perfil")
    private Long idPerfil;

    @Column(name="perfil")
    private String perfil;

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
