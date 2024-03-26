package com.softtek.seleccionprofesionales.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softtek.seleccionprofesionales.dao.ISolicitudDao;
import com.softtek.seleccionprofesionales.model.Solicitud;

@Service
public class SolicitudServiceImpl implements ISolicitudService {
	
	private static final Logger log = LoggerFactory.getLogger(SolicitudServiceImpl.class);
	
	@Autowired
	ISolicitudDao solicitudDao;
	
	@Override
	public Solicitud guardar(Solicitud solicitud) {
		log.info("servicio SolicitudServiceImpl - guardar()");
		return solicitudDao.save(solicitud);
	}

}
