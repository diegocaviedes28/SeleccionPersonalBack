package com.softtek.seleccionprofesionales.service;
import org.springframework.http.ResponseEntity;

import com.softtek.seleccionprofesionales.model.Cliente;
import com.softtek.seleccionprofesionales.response.ClienteResponseRest;

public interface ClienteService {
	
	 ResponseEntity<ClienteResponseRest> obtenerCliente();
	 ResponseEntity<ClienteResponseRest> guardarCliente(Cliente cliente);
	 ResponseEntity<ClienteResponseRest> obtenerClienteID(Long id_cliente);
}
