package com.tecsup.springorlando.jdbc.dao;

import java.util.List;

import com.tecsup.springorlando.jdbc.model.Programa;

public interface ProgramaDAO {

	public List<Programa> listar();
	public Programa buscar(long id);
	public Programa buscarPorNombre(String nombre);
	public void insertar(Programa programa);
	public void modificar(Programa programa);
	public void eliminar(Programa programa);
}
