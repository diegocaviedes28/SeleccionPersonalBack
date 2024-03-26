package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente implements Serializable {
	
    private static final long serialVersionUID = -598879683497775695L; 
    
    
    


//	public Cliente() {
//		super();
//	}
//
//	public Cliente(Long idCliente,String nombre, String id_pais,
//			Long id_comercial_brm) {
//		super();
//		this.idCliente = idCliente;
//		this.nombre = nombre;
//		this.id_pais = id_pais;
//		this.id_comercial_brm = id_comercial_brm;
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

	@NotEmpty
    @Size(max = 100)
    private String nombre;
    
	@NotNull
    @Column(name = "id_pais")
	private Long paisId;
    
	
	//private String id_pais;
    
	@NotNull
    @Column(name = "id_comercial_brm")
    private Long comercialBRMId;


	public Long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getPaisId() {
		return paisId;
	}


	public void setPaisId(Long paisId) {
		this.paisId = paisId;
	}


	public Long getComercialBRMId() {
		return comercialBRMId;
	}


	public void setComercialBRMId(Long comercialBRMId) {
		this.comercialBRMId = comercialBRMId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
   
}

