package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Table(name="pais")
@Entity
//@JsonPropertyOrder({"idPais","pais"})
public class Pais implements Serializable {
	
    private static final long serialVersionUID = -8964194918695078273L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;
   
    private String pais;

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
