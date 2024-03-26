package com.softtek.seleccionprofesionales.model;


import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="estado_entrevista")
public class EstadoEntrevista {
    @Id
    @Column(name="id_estado_entrevista")
    private Long idEstadoEntrevista;

    @Column(name="estado")
    private String estado;

    public Long getIdEstadoEntrevista() {
        return idEstadoEntrevista;
    }

    public void setIdEstadoEntrevista(Long idEstadoEntrevista) {
        this.idEstadoEntrevista = idEstadoEntrevista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
