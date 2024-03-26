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

import com.softtek.seleccionprofesionales.dao.PostulanteDao;
import com.softtek.seleccionprofesionales.dao.ComercialBrmDao;
import com.softtek.seleccionprofesionales.dao.ISolicitudDao;
import com.softtek.seleccionprofesionales.model.Postulante;
import com.softtek.seleccionprofesionales.model.ComercialBrm;
import com.softtek.seleccionprofesionales.model.Solicitud;
import com.softtek.seleccionprofesionales.response.PostulanteResponseRest;

@Service
public class PostulanteServiceImpl implements PostulanteService {
	
	private static final Logger Log = LoggerFactory.getLogger(PostulanteServiceImpl.class);
	
	@Autowired
	PostulanteDao postulanteDao;
	
	@Override
	@Transactional
	public ResponseEntity<PostulanteResponseRest> obtenerPostulante() {
		// TODO Auto-generated method stub
		Log.info("inicio metodo obtener()");
		
		PostulanteResponseRest response = new PostulanteResponseRest();
		try {

			List<Postulante> postulante = (List<Postulante>) postulanteDao.findAll();
			response.getPostulanteResponse().setPostulante(postulante);
			response.setMetadata("200","Operacion Exitosa","600","Recurso obtenido");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	@Transactional
	public ResponseEntity<PostulanteResponseRest> guardarPostulante(Postulante request) {
		Log.info("Inicio metodo guardarPostulante()");
		
		PostulanteResponseRest response = new PostulanteResponseRest();
		List<Postulante> list = new ArrayList<>();
		
		try {
			Postulante postulanteGuardado = postulanteDao.save(request);
			
			if(postulanteGuardado != null) {
				Log.info("entra en el if != null");
				list.add(postulanteGuardado);
				response.getPostulanteResponse().setPostulante(list);
				response.setMetadata("200","Operacion Exitosa","600","Recurso creado");
			}else {
				Log.error("Error al guardar");
				response.setMetadata("NOK", "-1", "Postulante no guardada","1ewqeqw");
				return new ResponseEntity<PostulanteResponseRest>(response, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			Log.error("Error en consultar data");
			response.setMetadata("NOK", "-1", "Error al consultar postulante","1ewqeqw");
			return new ResponseEntity<PostulanteResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	@Override
	@Transactional(readOnly=true)
		public ResponseEntity<PostulanteResponseRest> obtenerPostulanteID(Long id_postulante) {
			Log.info("Inicio metodo buscarPorId()");
			
			PostulanteResponseRest response = new PostulanteResponseRest();
			List<Postulante> list = new ArrayList<>();
			
			try {
				Optional<Postulante> postulante = postulanteDao.findById(id_postulante);
				
				if(postulante.isPresent()) {
					list.add(postulante.get());
					response.getPostulanteResponse().setPostulante(list);
					response.setMetadata("200","Operacion Exitosa","600","Recurso creado");
				}else {
					Log.error("Error en consultar data");
					response.setMetadata("NOK", "-1", "Postulante no guardada","1ewqeqw");
					return new ResponseEntity<PostulanteResponseRest>(response, HttpStatus.NOT_FOUND);
				}
			} catch (Exception e) {
				Log.error("Error en consultar data");
				response.setMetadata("NOK", "-1", "Error al consultar postulante","1ewqeqw");
				return new ResponseEntity<PostulanteResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
}
