package com.softtek.seleccionprofesionales.service;
import org.springframework.web.bind.annotation.RequestBody;
import com.softtek.seleccionprofesionales.model.Solicitud;

public interface ISolicitudService {
	
	Solicitud guardar(@RequestBody Solicitud solicitud);

}
