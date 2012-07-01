package com.eusa.domain;

import java.util.HashSet;
import java.util.Set;



public class Equipo {
	protected Long id;
	private Long version;
	protected String marca;
	protected String serie;
	protected String marcaMonitor;
	protected String modeloMotor;
	protected String serieMotor;
	protected String status; //Puede ser en uso, disponible, averiado
	private Set<Servicio> servicios = new HashSet<Servicio>(0);

	public Set<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getMarcaMonitor() {
		return marcaMonitor;
	}
	public void setMarcaMonitor(String marcaMonitor) {
		this.marcaMonitor = marcaMonitor;
	}
	public String getModeloMotor() {
		return modeloMotor;
	}
	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}
	public String getSerieMotor() {
		return serieMotor;
	}
	public void setSerieMotor(String serieMotor) {
		this.serieMotor = serieMotor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String estatus) {
		this.status = estatus;
	}
	


}
