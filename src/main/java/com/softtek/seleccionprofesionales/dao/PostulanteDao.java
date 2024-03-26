package com.softtek.seleccionprofesionales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.softtek.seleccionprofesionales.model.Postulante;

@Repository
public interface PostulanteDao extends JpaRepository<Postulante, Long>{

}
