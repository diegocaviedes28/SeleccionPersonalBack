package com.softtek.seleccionprofesionales.response;

public class OrdenMetadata {
	private int codigo;
    private String mensaje;
    private int codigoDominio;
    private String mensajeDominio;
	public OrdenMetadata(int codigo, String mensaje, int codigoDominio, String mensajeDominio) {
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.codigoDominio = codigoDominio;
		this.mensajeDominio = mensajeDominio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getCodigoDominio() {
		return codigoDominio;
	}
	public void setCodigoDominio(int codigoDominio) {
		this.codigoDominio = codigoDominio;
	}
	public String getMensajeDominio() {
		return mensajeDominio;
	}
	public void setMensajeDominio(String mensajeDominio) {
		this.mensajeDominio = mensajeDominio;
	}

    // Constructor, getters y setters
    
}
