package com.softtek.seleccionprofesionales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.seleccionprofesionales.model.ComercialBrm;

@Repository
public interface ComercialBrmDao extends JpaRepository<ComercialBrm, Long>{

}
