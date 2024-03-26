package com.softtek.seleccionprofesionales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.softtek.seleccionprofesionales.model.Solicitud;

public interface ISolicitudDao extends JpaRepository<Solicitud, Long>{

}
