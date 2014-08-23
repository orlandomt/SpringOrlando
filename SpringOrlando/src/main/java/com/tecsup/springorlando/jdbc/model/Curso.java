package com.tecsup.springorlando.jdbc.model;

import java.util.Date;

public class Curso {

	private long id;
	private String nombre;
	private String codigo;
	private Date fechaInicio;
	
	private Programa programa;

	public Curso() {
	}

	public Curso(long id, String nombre, String codigo, Date fechaInicio, Programa programa) {
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.fechaInicio = fechaInicio;
		this.programa = programa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	
	
}
