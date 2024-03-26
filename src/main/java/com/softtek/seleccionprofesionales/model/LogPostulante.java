package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Table(name="log_postulante")
public class LogPostulante {
    @Id
    @Column(name="id_log_postulante")
    private Long idLogPostulante;

    @Column(name="postulante")
    private Long postulante;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fecha")
    private Timestamp fecha;

    public Long getIdLogPostulante() {
        return idLogPostulante;
    }

    public void setIdLogPostulante(Long idLogPostulante) {
        this.idLogPostulante = idLogPostulante;
    }

    public Long getPostulante() {
        return postulante;
    }

    public void setPostulante(Long postulante) {
        this.postulante = postulante;
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
