package ej1;

import java.util.ArrayList;

public class Persona {

	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> correos;

	public Persona() {

	}

	public Persona(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.correos = new ArrayList<Email>();

	}

	public boolean agregarEmail(String datos) {
		boolean respuesta = false;
		Email email = new Email(datos);

		if (email != null) {
			respuesta = true;
			correos.add(email);
		}

		return respuesta;
	}
	
	public boolean agregarNumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoPais, TipoDeLineaEnum tipoDeLinea) {
		boolean respuesta = false;
		NumeroTelefonico numero = new NumeroTelefonico(caracteristica, numeroDeAbonado,  codigoPais,  tipoDeLinea);

		if (numero != null) {
			respuesta = true;
			telefonos.add(numero);
		}

		return respuesta;
	}
	
	
	
	
	
	
	
	
	

	public void mostrarTodo() {
		System.out.println(apellido + ", " + nombre);

		this.mostrarTelefonos();
		this.mostrarEmails();

	}

	private void mostrarTelefonos() {
		for (NumeroTelefonico telefono : telefonos) {
			System.out.println(telefono);
		}
	}

	private void mostrarEmails() {

		for (Email email : correos) {
			System.out.println(email.getValor());
		}
	}

}
