package com.eusa.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Servicio {
	private Long id;
	private Long version;
	protected String nombre;
	protected String ultimoServicio;
	private Set<Equipo> equipos = new HashSet<Equipo>(0);
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUltimoServicio() {
		return ultimoServicio;
	}
	public void setUltimoServicio(String ultimoServicio) {
		this.ultimoServicio = ultimoServicio;
	}
	

}
	