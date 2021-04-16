package ej4;
import ej3.*;

public class Cliente{

	private String cuil;
	private String nombre;
	private String apellido;
	
	
	public Cliente(String cuil, String nombre, String apellido) {
		super();
		setCuil( cuil);
		setNombre(nombre);
		setApellido(apellido);
	}


	
		
	
	@Override
	public String toString() {
		return "Cliente [cuil=" + cuil + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}


	private void setCuil(String cuil) {
		this.cuil = cuil;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
}
