package com.eusa.domain;

public class Equipo {
	protected int id;
	protected String marca;
	protected String serie;
	protected String marcaMonitor;
	protected String modeloMotor;
	protected String serieMotor;
	protected String estatus; //Puede ser en uso, disponible, averiado
	
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
	public String getMarcaMotor() {
		return marcaMonitor;
	}
	public void setMarcaMotor(String marcaMotor) {
		this.marcaMonitor = marcaMotor;
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
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
