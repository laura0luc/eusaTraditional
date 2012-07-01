package com.eusa.domain;

import java.util.Date;

public class Servicio {
	private int id;
	protected String nombre;
	protected Date ultimoServicio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getUltimoServicio() {
		return ultimoServicio;
	}
	public void setUltimoServicio(Date ultimoServicio) {
		this.ultimoServicio = ultimoServicio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
	