package com.softtek.seleccionprofesionales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.seleccionprofesionales.model.Cliente;
import com.softtek.seleccionprofesionales.model.Pais;
import com.softtek.seleccionprofesionales.response.PaisResponseRest;
import com.softtek.seleccionprofesionales.service.PaisService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1")
public class PaisController {
	
	@Autowired
	PaisService service;
	
	
	@GetMapping("/pais")
	public ResponseEntity<PaisResponseRest> obtenerPais() {
		ResponseEntity<PaisResponseRest> response = service.obtenerPais();
		return response;
	}

	@PostMapping("/pais")
	public ResponseEntity<PaisResponseRest> guardarPais(@RequestBody Pais request) {
		ResponseEntity<PaisResponseRest> response = service.guardarPais(request);
	 	return response;
	}
	
}
