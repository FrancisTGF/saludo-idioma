package com.nttdata.bootcamp.saludoIdioma;

import com.nttdata.bootcamp.saludoIdioma.config.SaludoProperties;
import com.nttdata.bootcamp.saludoIdioma.repository.Saludo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class PomPruebasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PomPruebasApplication.class, args);
		SaludoProperties properties = new SaludoProperties();
		Saludo saludo= new Saludo(properties.getIdioma());
		System.out.println(saludo.mensajeSaludo());
	}

}
