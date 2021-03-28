package ej_4;

import java.util.ArrayList;


public class Paciente {

	private String dni;
	private String nombre;
	private String apellido;
	private String telefono;
	
	
	
	public Paciente(String dni,String nombre, String apellido, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}


	public String getDni() {
		return dni;
	}


	private void setDni(String dni) {
		this.dni = dni;
	}


	private String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}


	private String getTelefono() {
		return telefono;
	}


	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
	

}
