package com.nttdata.bootcamp.saludoIdioma.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.saludoIdioma.repository.Saludo;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoProperties.class)
public class SaludoAutoConfigure {

	private final SaludoProperties properties;
	
	public SaludoAutoConfigure(SaludoProperties properties) {
		this .properties= properties;
		
	}
	@Bean
	public Saludo saludo() {
		return new Saludo(properties.getIdioma());
	}
}
