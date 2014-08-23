package com.tecsup.springorlando;

import java.applet.Applet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tecsup.springorlando.bean.model.Persona;

public class App {

	public static void main (String[] args){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
		Persona persona = (Persona) applicationContext.getBean("persona");
		
		System.out.println(persona.getNombre());
	}
}
