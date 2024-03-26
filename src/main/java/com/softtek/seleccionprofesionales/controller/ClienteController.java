package com.softtek.seleccionprofesionales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.seleccionprofesionales.model.Cliente;
import com.softtek.seleccionprofesionales.response.ClienteResponseRest;
import com.softtek.seleccionprofesionales.service.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@PostMapping("/clientes")
	public ResponseEntity<ClienteResponseRest> guardar(@RequestBody Cliente request) {
	 	ResponseEntity<ClienteResponseRest> response = service.guardarCliente(request);
		return response;
	}
	
	@GetMapping("/clientes")
	public ResponseEntity<ClienteResponseRest> obtener() {
	    ResponseEntity<ClienteResponseRest> response = service.obtenerCliente();
	    return response;
	}
	
	@GetMapping("/clientes/{id_cliente}")
	public ResponseEntity<ClienteResponseRest> obtenerClienteId(@PathVariable Long id_cliente) {
		ResponseEntity<ClienteResponseRest> response = service.obtenerClienteID(id_cliente);
		return response;
	}
	
}
