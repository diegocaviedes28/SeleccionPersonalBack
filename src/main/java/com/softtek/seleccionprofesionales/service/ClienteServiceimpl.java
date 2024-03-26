package com.softtek.seleccionprofesionales.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.seleccionprofesionales.dao.ClienteDao;
import com.softtek.seleccionprofesionales.dao.ComercialBrmDao;
import com.softtek.seleccionprofesionales.dao.ISolicitudDao;
import com.softtek.seleccionprofesionales.model.Cliente;
import com.softtek.seleccionprofesionales.response.ClienteResponseRest;

@Service
public class ClienteServiceimpl implements ClienteService {
	
	private static final Logger Log = LoggerFactory.getLogger(ClienteServiceimpl.class);
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional
	public ResponseEntity<ClienteResponseRest> obtenerCliente() {
		// TODO Auto-generated method stub
		Log.info("inicio metodo obtener()");
		
		ClienteResponseRest response = new ClienteResponseRest();
		try {

			List<Cliente> cliente = (List<Cliente>) clienteDao.findAll();
			response.getClienteResponse().setCliente(cliente);
			response.setMetadata("200","Operacion Exitosa","600","Recurso obtenido");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	@Transactional
	public ResponseEntity<ClienteResponseRest> guardarCliente(Cliente request) {
		Log.info("Inicio metodo guardarCliente()");
		
		ClienteResponseRest response = new ClienteResponseRest();
		List<Cliente> list = new ArrayList<>();
		
		try {
			Cliente clienteGuardado = clienteDao.save(request);
			
			if(clienteGuardado != null) {
				Log.info("entra en el if != null");
				list.add(clienteGuardado);
				response.getClienteResponse().setCliente(list);
				response.setMetadata("201","Operacion Exitosa","600","Recurso creado");
			}else {
				Log.error("Error al guardar");
				response.setMetadata("NOK", "-1", "Cliente no guardada","1ewqeqw");
				return new ResponseEntity<ClienteResponseRest>(response, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			Log.error("Error en consultar data");
			response.setMetadata("NOK", "-1", "Error al consultar cliente","1ewqeqw");
			return new ResponseEntity<ClienteResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	
	@Override
	@Transactional(readOnly=true)
		public ResponseEntity<ClienteResponseRest> obtenerClienteID(Long id_cliente) {
			Log.info("Inicio metodo buscarPorId()");
			
			ClienteResponseRest response = new ClienteResponseRest();
			List<Cliente> list = new ArrayList<>();
			
			try {
				Optional<Cliente> cliente = clienteDao.findById(id_cliente);
				
				if(cliente.isPresent()) {
					list.add(cliente.get());
					response.getClienteResponse().setCliente(list);
					response.setMetadata("200","Operacion Exitosa","600","Recurso creado");
				}else {
					Log.error("Error en consultar data");
					response.setMetadata("NOK", "-1", "Cliente no guardada","1ewqeqw");
					return new ResponseEntity<ClienteResponseRest>(response, HttpStatus.NOT_FOUND);
				}
			} catch (Exception e) {
				Log.error("Error en consultar data");
				response.setMetadata("NOK", "-1", "Error al consultar cliente","1ewqeqw");
				return new ResponseEntity<ClienteResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
}
