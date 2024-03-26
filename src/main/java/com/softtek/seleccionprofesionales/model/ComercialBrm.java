package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Table(name="comercial_brm")
@Entity
public class ComercialBrm implements Serializable {
	
    private static final long serialVersionUID = 8772952367647973405L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComercialBrm;

    private String comercialBrm;

	public String getComercialBrm() {
		return comercialBrm;
	}

	public void setComercialBrm(String comercialBrm) {
		this.comercialBrm = comercialBrm;
	}

	

}
