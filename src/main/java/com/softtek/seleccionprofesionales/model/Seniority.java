package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name= "seniority")
public class Seniority {
    @Id
    @Column(name="id_seniority")
    private Long idSeniority;

    @Column(name="seniority")
    private String seniority;

    public Long getIdSeniority() {
        return idSeniority;
    }

    public void setIdSeniority(Long idSeniority) {
        this.idSeniority = idSeniority;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }
}