package com.eusa.domain;

public class Vehiculo extends Equipo {
	private int id;
	private String placa;
	private String tarjetaCirculacion;
	private int kilometraje;
	private String tipo;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTarjetaCirculacion() {
		return tarjetaCirculacion;
	}
	public void setTarjetaCirculacion(String tarjetaCirculacion) {
		this.tarjetaCirculacion = tarjetaCirculacion;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
