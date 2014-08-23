package com.tecsup.springorlando.bean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tecsup.springorlando.bean.model.Instrumento;
import com.tecsup.springorlando.bean.model.Musico;

public class AppBean {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
		
		AppBean.AutowireAutodetect(applicationContext);
	}
	
	public static void valoresConstructor(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico");
		System.out.println(musico.getNumeroCanciones());
	}
	
	public static void valoresReferencia(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico1");
		
		System.out.println(musico.getNumeroCanciones());
		System.out.println(musico.getInstrumento().getMarca());
	}

	public static void valoresSetter(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico2");
		
		System.out.println(musico.getNombre());
		System.out.println("Canciones: " + musico.getNumeroCanciones());
		System.out.println(musico.getInstrumento().getMarca());
	}
	
	public static void referenciaInterna(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico3");
		
		System.out.println(musico.getNombre());
		System.out.println(musico.getInstrumento().getMarca());
	}
	
	public static void valorColeccion(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico4");
		
		List<Instrumento> instrumentos = musico.getInstrumentos();
		
		for (Instrumento instrumento : instrumentos){
			System.out.println(instrumento.getMarca());
		}
		
	}

	public static void AutowireByName(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico5");
		System.out.println(musico.getInstrumento().getMarca());
	}
	
	public static void AutowireByType(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico5");
		System.out.println(musico.getInstrumento().getMarca());
		
		Musico musico1 = (Musico)applicationContext.getBean("musico6");
		System.out.println(musico1.getInstrumento().getMarca());
	}
	
	public static void AutowireConstructor(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico7");
		System.out.println(musico.getInstrumento().getMarca());
	}
	
	public static void AutowireAutodetect(ApplicationContext applicationContext){
		Musico musico = (Musico)applicationContext.getBean("musico8");
		System.out.println(musico.getInstrumento().getMarca());
	}

}
