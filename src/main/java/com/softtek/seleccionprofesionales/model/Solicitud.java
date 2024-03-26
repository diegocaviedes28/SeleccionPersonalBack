package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="solicitud")
public class Solicitud implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5295920432855629377L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_solicitud")
    private Long solicitudId;
    @Column(name="cliente")
    private Long clienteId;
    @Column(name="bidding")
    private String bidding;
    @Column(name="nombre_solicitantes")
    private String nombreSolicitante;
    @Column(name="area_solicitante")
    private Long areaId;
    @Column(name="fecha_inicio")
    private Date fechaInicio;
    @Column(name="fecha_vencimiento")
    private Date fechaVencimiento;
    @Column(name="vacantes")
    private short vacantes;
    @Column(name="perfil")
    private Long perfilId;
    @Column(name="seniority")
    private Long seniorityId;
    @Column(name="tecnologia_principal")
    private Long tecnologiaId;
    private List<Long> idiomas;
    @Column(name="base_salarial")
    private Long baseSalarialId;
    @Column(name="estado")
    private Long estadoSolicitudId;
    @Column(name="detalle_skills")
    private String detalleSkills;
    
	public Long getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(Long solicitudId) {
		this.solicitudId = solicitudId;
	}
	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	public String getBidding() {
		return bidding;
	}
	public void setBidding(String bidding) {
		this.bidding = bidding;
	}
	public String getNombreSolicitante() {
		return nombreSolicitante;
	}
	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public short getVacantes() {
		return vacantes;
	}
	public void setVacantes(short vacantes) {
		this.vacantes = vacantes;
	}
	public Long getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(Long perfilId) {
		this.perfilId = perfilId;
	}
	public Long getSeniorityId() {
		return seniorityId;
	}
	public void setSeniorityId(Long seniorityId) {
		this.seniorityId = seniorityId;
	}
	public Long getTecnologiaId() {
		return tecnologiaId;
	}
	public void setTecnologiaId(Long tecnologiaId) {
		this.tecnologiaId = tecnologiaId;
	}
	public List<Long> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(List<Long> idiomas) {
		this.idiomas = idiomas;
	}
	public Long getBaseSalarialId() {
		return baseSalarialId;
	}
	public void setBaseSalarialId(Long baseSalarialId) {
		this.baseSalarialId = baseSalarialId;
	}
	public Long getEstadoSolicitudId() {
		return estadoSolicitudId;
	}
	public void setEstadoSolicitudId(Long estadoSolicitudId) {
		this.estadoSolicitudId = estadoSolicitudId;
	}
	public String getDetalleSkills() {
		return detalleSkills;
	}
	public void setDetalleSkills(String detalleSkills) {
		this.detalleSkills = detalleSkills;
	}
}
