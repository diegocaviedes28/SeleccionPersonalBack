package com.softtek.seleccionprofesionales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.seleccionprofesionales.model.Postulante;
import com.softtek.seleccionprofesionales.response.PostulanteResponseRest;
import com.softtek.seleccionprofesionales.service.PostulanteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1")
public class PostulanteController {
	
	@Autowired
	PostulanteService service;
	
	@GetMapping("/postulante")
	public ResponseEntity<PostulanteResponseRest> obtener() {
		ResponseEntity<PostulanteResponseRest> response = service.obtenerPostulante();
		return response;
	}
	
	@PostMapping("/postulante")
	public ResponseEntity<PostulanteResponseRest> guardar(@RequestBody Postulante request) {
		ResponseEntity<PostulanteResponseRest> response = service.guardarPostulante(request);
	 	return response;
	}
	
	@GetMapping("/postulante/{id_postulante}")
	public ResponseEntity<PostulanteResponseRest> obtenerPostulanteId(@PathVariable Long id_postulante) {
		ResponseEntity<PostulanteResponseRest> response = service.obtenerPostulante();
		return response;
	}
	
	
}
