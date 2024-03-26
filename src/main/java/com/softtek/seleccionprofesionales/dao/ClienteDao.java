package com.softtek.seleccionprofesionales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.seleccionprofesionales.model.Cliente;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long>{

}
