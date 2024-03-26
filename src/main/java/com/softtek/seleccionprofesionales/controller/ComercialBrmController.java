package com.softtek.seleccionprofesionales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.seleccionprofesionales.service.ComercialBrmService;



@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1")
public class ComercialBrmController {
	
	@Autowired
	ComercialBrmService service;
	
	@GetMapping("/comercial-brm")
	public ResponseEntity<?> obtener() {
	 	return ResponseEntity.ok(service.obtener());
//	 	return ResponseEntity.ok("hola");
	}
	 
}
