package ejercicio1;

import java.util.Scanner;

public class Persona {

	//atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private int cantAmigos;

	//constructor default

	public Persona() {	
		
		
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.cantAmigos = 0;
	}
	//getters y setters de atributos privados


	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private String getApellido() {
		return apellido;
	}


	private void setApellido(String apellido) {
		this.apellido = apellido;
	}


	private String getDireccion() {
		return direccion;
	}


	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	private int getCantAmigos() {
		return cantAmigos;
	}


	private void setCantAmigos(int cantAmigos) {
		this.cantAmigos = cantAmigos;
	}
	
	//metodo toString (para que se vea en forma copada)
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", cantAmigos="
				+ cantAmigos + "]";
	}

	
	//metodo completar datos (recibe la persona que instanciaste en el main y los datos y luego se los pasa al seter para que los construya en el objeto)
	public void completarDatos(Persona persona ,String nombre,String apellido, String direccion, int cantAmigos) {
		
	persona.setNombre(nombre);
	persona.setApellido(apellido);
	persona.setDireccion(direccion);
	persona.setCantAmigos(cantAmigos);
	}

	//recibe una instancia de persona (creada previamente en el main) y simplemente la imprime (obviamente que ya la va a imprimir con todos los datos que le seteamos anteriormente).
	public void mostrarPersona(Persona persona) {
		
		System.out.println(persona);
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		System.out.println(persona.getDireccion());
		System.out.println(persona.getCantAmigos());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
