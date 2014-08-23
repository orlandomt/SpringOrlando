package com.tecsup.springorlando.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tecsup.springorlando.jdbc.model.Programa;

public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO{

	public List<Programa> listar(){
		String query = "select * from programa";
		return this.getJdbcTemplate().query(query, new ProgramaRowMapper());
	}
	
	public Programa buscar(long id) {
		String query = "select * from programa where id = ?";
		
		Programa programa = (Programa) this.getJdbcTemplate().queryForObject(query, new Object[]{id}, new ProgramaRowMapper());
		
		return programa;
	}

	public Programa buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void insertar(Programa programa){
		
	}
	
	public void modificar(Programa programa){
		
	}
	
	public void eliminar(Programa programa){
		
	}
	
}
