package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "solicitud_idioma")
public class SolicitudIdioma {
    @Id
    @Column(name="id_solicitud")
    private Long idSolicitud;

    @Id
    @Column(name="id_idioma")
    private Long idIdioma;

    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Long getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Long idIdioma) {
        this.idIdioma = idIdioma;
    }
}
