package com.tecsup.springorlando.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tecsup.springorlando.jdbc.dao.ProgramaDAO;
import com.tecsup.springorlando.jdbc.model.Programa;

public class AppJdbc {

	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_db.xml");
		AppJdbc.Listar(applicationContext);
	}
	
	public static void Listar(ApplicationContext applicationContext){
		ProgramaDAO programaDAO = (ProgramaDAO) applicationContext.getBean("ProgramaDAO");
		List<Programa> programas = programaDAO.listar();
		
		for(Programa programa : programas){
			System.out.println(programa.getNombre());
		}
	}
}
