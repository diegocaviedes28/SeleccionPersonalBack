package com.softtek.seleccionprofesionales.service;
import org.springframework.http.ResponseEntity;

import com.softtek.seleccionprofesionales.model.Postulante;
import com.softtek.seleccionprofesionales.response.PostulanteResponseRest;

public interface PostulanteService {
	
	 ResponseEntity<PostulanteResponseRest> obtenerPostulante();
	 ResponseEntity<PostulanteResponseRest> guardarPostulante(Postulante postulante);
	 ResponseEntity<PostulanteResponseRest> obtenerPostulanteID(Long id_postulante);
}
