package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "area")
public class Area {
	
    @Id
    @Column(name="id_area")
    private Long idArea;
    @Column(name="area")
    private String area;

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
