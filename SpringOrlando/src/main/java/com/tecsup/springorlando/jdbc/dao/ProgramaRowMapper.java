package com.tecsup.springorlando.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.springorlando.jdbc.model.Programa;

public class ProgramaRowMapper implements RowMapper<Programa> {

	public Programa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Programa programa = new Programa();
		programa.setId(rs.getLong("id"));
		programa.setNombre(rs.getString("nombre"));
		programa.setDescripcion(rs.getString("descripcion"));
		
		return programa;
	}

}
