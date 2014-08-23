package com.tecsup.springorlando.bean.model;

public class Instrumento {

	private String nombre;
	private String marca;

	public Instrumento() {
	}

	public Instrumento(String marca) {
		this.marca = marca;
	}
	
	public Instrumento(String nombre, String marca) {
		this.nombre = nombre;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
