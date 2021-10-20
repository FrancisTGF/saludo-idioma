package com.nttdata.bootcamp.saludoIdioma.repository;

public class Saludo {

	private String idioma;

	public Saludo(String idioma) {
		super();
		this.idioma = idioma;
	}

	public String mensajeSaludo() {
		String mensaje = "";
		switch (idioma) {
		case "Espaniol": {
			mensaje = "Bienvenida";
			break;
		}
		case "Ingles": {
			mensaje = "Welcome";
			break;
		}
		case "Italiano": {
			mensaje = "Bienvenuto";
			break;
		}

		default:
			mensaje = "Bienvenida";
			break;
		}
		return mensaje;

	}
}
