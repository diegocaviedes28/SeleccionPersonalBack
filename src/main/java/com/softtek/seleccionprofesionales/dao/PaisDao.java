package com.softtek.seleccionprofesionales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.softtek.seleccionprofesionales.model.Pais;

@Repository
public interface PaisDao extends JpaRepository<Pais, Long>{

}
