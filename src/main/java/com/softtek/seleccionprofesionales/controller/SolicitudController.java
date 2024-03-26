package com.softtek.seleccionprofesionales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.softtek.seleccionprofesionales.model.Solicitud;
import com.softtek.seleccionprofesionales.service.ISolicitudService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1")
public class SolicitudController {
	
	@Autowired
	ISolicitudService servicio;
	
	@PostMapping("/solicitud")
	ResponseEntity<Solicitud> guardar(@RequestBody Solicitud solicitud) {
		return ResponseEntity.ok(servicio.guardar(solicitud));
	}

}
