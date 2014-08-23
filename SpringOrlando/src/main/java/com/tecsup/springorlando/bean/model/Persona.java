package com.tecsup.springorlando.bean.model;

public class Persona {

	protected String nombre;
	protected String apellido;

	public Persona() {
	}
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
		
}
