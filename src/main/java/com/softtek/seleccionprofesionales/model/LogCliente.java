package com.softtek.seleccionprofesionales.model;


import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Table(name = "log_cliente")
public class LogCliente {
    @Id
    @Column(name="id_log_cliente")
    private Long idLogCliente;

    @Column(name="cliente")
    private Long cliente;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fecha")
    private Timestamp fecha;

    public Long getIdLogCliente() {
        return idLogCliente;
    }

    public void setIdLogCliente(Long idLogCliente) {
        this.idLogCliente = idLogCliente;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
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
