package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Table(name = "log_solicitud")
public class LogSolicitud {
    @Id
    @Column(name="id_log_solicitud")
    private Long idLogSolicitud;

    @Column(name="solicitud")
    private Long solicitud;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fecha")
    private Timestamp fecha;

    public Long getIdLogSolicitud() {
        return idLogSolicitud;
    }

    public void setIdLogSolicitud(Long idLogSolicitud) {
        this.idLogSolicitud = idLogSolicitud;
    }

    public Long getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Long solicitud) {
        this.solicitud = solicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
