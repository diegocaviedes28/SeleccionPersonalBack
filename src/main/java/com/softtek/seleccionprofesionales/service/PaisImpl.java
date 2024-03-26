package com.softtek.seleccionprofesionales.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.seleccionprofesionales.dao.PaisDao;
import com.softtek.seleccionprofesionales.dao.ComercialBrmDao;
import com.softtek.seleccionprofesionales.dao.ISolicitudDao;
import com.softtek.seleccionprofesionales.model.Pais;
import com.softtek.seleccionprofesionales.model.ComercialBrm;
import com.softtek.seleccionprofesionales.model.Solicitud;
import com.softtek.seleccionprofesionales.response.PaisResponseRest;

@Service
public class PaisImpl implements PaisService {
	
	private static final Logger Log = LoggerFactory.getLogger(PaisImpl.class);
	
	@Autowired
	PaisDao paisDao;
	
	@Override
	@Transactional
	public ResponseEntity<PaisResponseRest> obtenerPais() {
		// TODO Auto-generated method stub
		Log.info("inicio metodo obtener()");
		
		PaisResponseRest response = new PaisResponseRest();
		try {

			List<Pais> Pais;
			Pais = (List<Pais>) paisDao.findAll();		
			response.getPaisResponse().setPais(Pais);
			response.setMetadata("200","Operacion Exitosa","600","Recurso obtenido");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	@Transactional
	public ResponseEntity<PaisResponseRest> guardarPais(Pais request) {
		Log.info("Inicio metodo guardarCliente()");
		
		PaisResponseRest response = new PaisResponseRest();
		List<Pais> list = new ArrayList<>();
		
		try {
			Pais paisGuardado = paisDao.save(request);
			
			if(paisGuardado != null) {
				Log.info("entra en el if != null");
				list.add(paisGuardado);
				response.getPaisResponse().setPais(list);
				response.setMetadata("200","Operacion Exitosa","600","Recurso creado");
			}else {
				Log.error("Error al guardar");
				response.setMetadata("NOK", "-1", "Cliente no guardada","1ewqeqw");
				return new ResponseEntity<PaisResponseRest>(response, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			Log.error("Error en consultar data");
			response.setMetadata("NOK", "-1", "Error al consultar cliente","1ewqeqw");
			return new ResponseEntity<PaisResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
