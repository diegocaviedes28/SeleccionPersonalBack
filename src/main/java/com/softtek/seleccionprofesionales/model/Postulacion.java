package com.softtek.seleccionprofesionales.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name="postulacion")
public class Postulacion {
    @Id
    @Column(name="id_postulacion")
    private Long idPostulacion;

    @Column(name="cliente")
    private Long cliente;

    @Column(name="bidding")
    private String bidding;
    @Column(name="req_srs")
    private String reqSrs;

    @Column(name="seniority")
    private Long seniority;

    @Column(name="sueldo_solicitado")
    private String sueldoSolicitado;

    @Column(name="postulante")
    private Long postulante;

    @Column(name="fecha_recepcion_cv")
    private Date fechaRecepcionCv;

    @Column(name="origen_cv")
    private Long origenCv;

    @Column(name="pais_origen_cv")
    private Long paisOrigenCv;

    @Column(name="url_cv")
    private String urlCv;

    @Column(name="fecha_entrevista_interna")
    private Date fechaEntrevistaInterna;

    @Column(name="estado_entrevista_interna")
    private Long estadoEntrevistaInterna;

    @Column(name="comentario_entrevista")
    private String comentarioEntrevista;

    @Column(name="aprueba_ingles")
    private String apruebaIngles;

    @Column(name="nivel_ingles")
    private Long nivelIngles;

    @Column(name="aprueba_entrevista_tecnica")
    private String apruebaEntrevistaTecnica;
    @Column(name="requiere_prueba_tecnica")
    private String requierePruebaTecnica;

    @Column(name="fecha_envio_prueba_tecnica")
    private Date fechaEnvioPruebaTecnica;

    @Column(name="fecha_entrega_prueba_tecnica")
    private Date fechaEntregaPruebaTecnica;

    @Column(name="comentarios_prueba_tecnica")
    private String comentariosPruebaTecnica;

    @Column(name="url_feed_back_prueba_tecnica")
    private String urlFeedbackPruebaTecnica;

    @Column(name="enviar_a_cliente")
    private String enviarACliente;

    @Column(name="motivo_no_envio")
    private Long motivoNoEnvio;

    @Column(name="fecha_presentacion_cliente")
    private Date fechaPresentacionCliente;

    @Column(name="aceptado_por_cliente")
    private String aceptadoPorCliente;

    @Column(name="motivo_rechazo")
    private String motivoRechazo;

    @Column(name="comentarios_adicionales")
    private String comentariosAdicionales;

    @Column(name="fecha_inicio_en_cliente")
    private Date fechaInicioEnCliente;

    public Long getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(Long idPostulacion) {
        this.idPostulacion = idPostulacion;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public String getBidding() {
        return bidding;
    }

    public void setBidding(String bidding) {
        this.bidding = bidding;
    }

    public String getReqSrs() {
        return reqSrs;
    }

    public void setReqSrs(String reqSrs) {
        this.reqSrs = reqSrs;
    }

    public Long getSeniority() {
        return seniority;
    }

    public void setSeniority(Long seniority) {
        this.seniority = seniority;
    }

    public String getSueldoSolicitado() {
        return sueldoSolicitado;
    }

    public void setSueldoSolicitado(String sueldoSolicitado) {
        this.sueldoSolicitado = sueldoSolicitado;
    }

    public Long getPostulante() {
        return postulante;
    }

    public void setPostulante(Long postulante) {
        this.postulante = postulante;
    }

    public Date getFechaRecepcionCv() {
        return fechaRecepcionCv;
    }

    public void setFechaRecepcionCv(Date fechaRecepcionCv) {
        this.fechaRecepcionCv = fechaRecepcionCv;
    }

    public Long getOrigenCv() {
        return origenCv;
    }

    public void setOrigenCv(Long origenCv) {
        this.origenCv = origenCv;
    }

    public Long getPaisOrigenCv() {
        return paisOrigenCv;
    }

    public void setPaisOrigenCv(Long paisOrigenCv) {
        this.paisOrigenCv = paisOrigenCv;
    }

    public String getUrlCv() {
        return urlCv;
    }

    public void setUrlCv(String urlCv) {
        this.urlCv = urlCv;
    }

    public Date getFechaEntrevistaInterna() {
        return fechaEntrevistaInterna;
    }

    public void setFechaEntrevistaInterna(Date fechaEntrevistaInterna) {
        this.fechaEntrevistaInterna = fechaEntrevistaInterna;
    }

    public Long getEstadoEntrevistaInterna() {
        return estadoEntrevistaInterna;
    }

    public void setEstadoEntrevistaInterna(Long estadoEntrevistaInterna) {
        this.estadoEntrevistaInterna = estadoEntrevistaInterna;
    }

    public String getComentarioEntrevista() {
        return comentarioEntrevista;
    }

    public void setComentarioEntrevista(String comentarioEntrevista) {
        this.comentarioEntrevista = comentarioEntrevista;
    }

    public String getApruebaIngles() {
        return apruebaIngles;
    }

    public void setApruebaIngles(String apruebaIngles) {
        this.apruebaIngles = apruebaIngles;
    }

    public Long getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(Long nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getApruebaEntrevistaTecnica() {
        return apruebaEntrevistaTecnica;
    }

    public void setApruebaEntrevistaTecnica(String apruebaEntrevistaTecnica) {
        this.apruebaEntrevistaTecnica = apruebaEntrevistaTecnica;
    }

    public String getRequierePruebaTecnica() {
        return requierePruebaTecnica;
    }

    public void setRequierePruebaTecnica(String requierePruebaTecnica) {
        this.requierePruebaTecnica = requierePruebaTecnica;
    }

    public Date getFechaEnvioPruebaTecnica() {
        return fechaEnvioPruebaTecnica;
    }

    public void setFechaEnvioPruebaTecnica(Date fechaEnvioPruebaTecnica) {
        this.fechaEnvioPruebaTecnica = fechaEnvioPruebaTecnica;
    }

    public Date getFechaEntregaPruebaTecnica() {
        return fechaEntregaPruebaTecnica;
    }

    public void setFechaEntregaPruebaTecnica(Date fechaEntregaPruebaTecnica) {
        this.fechaEntregaPruebaTecnica = fechaEntregaPruebaTecnica;
    }

    public String getComentariosPruebaTecnica() {
        return comentariosPruebaTecnica;
    }

    public void setComentariosPruebaTecnica(String comentariosPruebaTecnica) {
        this.comentariosPruebaTecnica = comentariosPruebaTecnica;
    }

    public String getUrlFeedbackPruebaTecnica() {
        return urlFeedbackPruebaTecnica;
    }

    public void setUrlFeedbackPruebaTecnica(String urlFeedbackPruebaTecnica) {
        this.urlFeedbackPruebaTecnica = urlFeedbackPruebaTecnica;
    }

    public String getEnviarACliente() {
        return enviarACliente;
    }

    public void setEnviarACliente(String enviarACliente) {
        this.enviarACliente = enviarACliente;
    }

    public Long getMotivoNoEnvio() {
        return motivoNoEnvio;
    }

    public void setMotivoNoEnvio(Long motivoNoEnvio) {
        this.motivoNoEnvio = motivoNoEnvio;
    }

    public Date getFechaPresentacionCliente() {
        return fechaPresentacionCliente;
    }

    public void setFechaPresentacionCliente(Date fechaPresentacionCliente) {
        this.fechaPresentacionCliente = fechaPresentacionCliente;
    }

    public String getAceptadoPorCliente() {
        return aceptadoPorCliente;
    }

    public void setAceptadoPorCliente(String aceptadoPorCliente) {
        this.aceptadoPorCliente = aceptadoPorCliente;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public String getComentariosAdicionales() {
        return comentariosAdicionales;
    }

    public void setComentariosAdicionales(String comentariosAdicionales) {
        this.comentariosAdicionales = comentariosAdicionales;
    }

    public Date getFechaInicioEnCliente() {
        return fechaInicioEnCliente;
    }

    public void setFechaInicioEnCliente(Date fechaInicioEnCliente) {
        this.fechaInicioEnCliente = fechaInicioEnCliente;
    }
}
