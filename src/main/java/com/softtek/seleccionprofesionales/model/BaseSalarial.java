package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name="base_salarial")
public class BaseSalarial {

    @Id
    @Column(name="id_base_salarial")
    private Long idBaseSalarial;

    @Column(name="base_salarial")
    private String baseSalarial;

    public Long getIdBaseSalarial() {
        return idBaseSalarial;
    }

    public void setIdBaseSalarial(Long idBaseSalarial) {
        this.idBaseSalarial = idBaseSalarial;
    }

    public String getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(String baseSalarial) {
        this.baseSalarial = baseSalarial;
    }
}