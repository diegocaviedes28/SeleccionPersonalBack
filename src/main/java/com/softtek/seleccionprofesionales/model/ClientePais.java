package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="cliente_pais")
public class ClientePais {
    @Id
    @Column(name="id_cliente")
    private Long idCliente;

    @Id
    @Column(name="id_pais")
    private Long idPais;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }
}
