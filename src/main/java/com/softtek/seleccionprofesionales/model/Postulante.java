package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Table(name="postulante")
@Entity
public class Postulante implements Serializable{
	
	
    private static final long serialVersionUID = 2811634991210827314L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_postulante;
    
    private String nombre;
    
    private String apellidos;

    private String email;

    private String numCelular;

    private Long id_pais;

    private Long id_genero;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public Long getId_pais() {
        return id_pais;
    }

    public void setId_pais(Long id_pais) {
        this.id_pais = id_pais;
    }

    public Long getId_genero() {
        return id_genero;
    }

    public void setId_Genero(Long id_genero) {
        this.id_genero = id_genero;
    }
}
