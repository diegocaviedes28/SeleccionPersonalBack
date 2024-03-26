package com.softtek.seleccionprofesionales.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.seleccionprofesionales.dao.ComercialBrmDao;
import com.softtek.seleccionprofesionales.dao.ISolicitudDao;
import com.softtek.seleccionprofesionales.model.ComercialBrm;
import com.softtek.seleccionprofesionales.model.Solicitud;

@Service
public class ComercialBrmServiceImpl implements ComercialBrmService {
	
	private static final Logger log = LoggerFactory.getLogger(ComercialBrmServiceImpl.class);
	
	@Autowired
	ComercialBrmDao comercialDao;
	
	@Override
	public List<ComercialBrm> obtener() {
		log.info("servicio ComercialBrm - obtener()");
		return comercialDao.findAll();
	}

}
