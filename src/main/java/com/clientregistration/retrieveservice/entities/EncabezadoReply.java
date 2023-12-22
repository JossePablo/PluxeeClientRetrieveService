package com.clientregistration.retrieveservice.entities;

public class EncabezadoReply {
	private String solicitudId;
	private String institucionId;
	private String folioCliente;
	private String codigoRespuesta;
	private String descripcionRespuesta;
	private String fechaHoraPeticion;
	private String tiempoProcesamiento;
	
	public String getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(String solicitudId) {
		this.solicitudId = solicitudId;
	}
	public String getInstitucionId() {
		return institucionId;
	}
	public void setInstitucionId(String institucionId) {
		this.institucionId = institucionId;
	}
	public String getFolioCliente() {
		return folioCliente;
	}
	public void setFolioCliente(String folioCliente) {
		this.folioCliente = folioCliente;
	}
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}
	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}
	public String getFechaHoraPeticion() {
		return fechaHoraPeticion;
	}
	public void setFechaHoraPeticion(String fechaHoraPeticion) {
		this.fechaHoraPeticion = fechaHoraPeticion;
	}
	public String getTiempoProcesamiento() {
		return tiempoProcesamiento;
	}
	public void setTiempoProcesamiento(String tiempoProcesamiento) {
		this.tiempoProcesamiento = tiempoProcesamiento;
	}
}
