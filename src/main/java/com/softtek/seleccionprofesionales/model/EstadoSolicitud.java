package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "estado_solicitud")
public class EstadoSolicitud {

    @Id
    @Column(name="id_estado_solicitud")
    private Long idEstadoSolicitud;

    @Column(name="estado")
    private String estado;

    public Long getIdEstadoSolicitud() {
        return idEstadoSolicitud;
    }

    public void setIdEstadoSolicitud(Long idEstadoSolicitud) {
        this.idEstadoSolicitud = idEstadoSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}