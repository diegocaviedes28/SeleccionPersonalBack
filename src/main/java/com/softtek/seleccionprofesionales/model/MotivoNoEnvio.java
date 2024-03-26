package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="motivo_no_envio")
public class MotivoNoEnvio {
    @Id
    @Column(name="id_motivo")
    private Long idMotivo;

    @Column(name="motivo")
    private String motivo;

    public Long getIdMotivo() {
        return idMotivo;
    }

    public void setIdMotivo(Long idMotivo) {
        this.idMotivo = idMotivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
