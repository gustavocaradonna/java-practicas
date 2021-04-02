package ej2;

import java.util.ArrayList;

public class Persona {

	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> correos;
	private ArrayList<Mascota> mascotas;
	


	public Persona() {

	}

	public Persona(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.correos = new ArrayList<Email>();
		this.mascotas = new ArrayList<Mascota>();

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

	public boolean agregarNumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoPais,
			TipoDeLineaEnum tipoDeLinea) {
		boolean respuesta = false;
		NumeroTelefonico numero = new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoPais, tipoDeLinea);

		if (numero != null) {
			respuesta = true;
			telefonos.add(numero);
		}

		return respuesta;
	}
	
	
	public boolean agregarMascota(String nombre, String tipo) {
		boolean respuesta = false;
		Mascota mascota = new Mascota(nombre, tipo);

		if (mascota != null) {
			respuesta = true;
			mascotas.add(mascota);
		}

		return respuesta;
	}
	
	
	
	
	

	public void mostrarTodo() {

		System.out.println("Apellido=" + apellido + ", nombre=" + nombre + ", telefonos=" + telefonos);
		this.listarMails();
		this.listarMascotas();
		
		
		

	}
	
	
	private void listarMails() {
		for (Email email : correos) {
			System.out.println(email.getValor());
		}
	}
	
	
	private void listarMascotas() {
		for (Mascota mascota : mascotas) {
			System.out.println(mascota);
		}
	}
	

}
