package com.softtek.seleccionprofesionales.service;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.softtek.seleccionprofesionales.model.Cliente;
import com.softtek.seleccionprofesionales.model.Pais;
import com.softtek.seleccionprofesionales.response.ClienteResponseRest;
import com.softtek.seleccionprofesionales.response.PaisResponseRest;

public interface PaisService {
	
	ResponseEntity<PaisResponseRest> obtenerPais();

	ResponseEntity<PaisResponseRest> guardarPais(Pais Pais);
}
