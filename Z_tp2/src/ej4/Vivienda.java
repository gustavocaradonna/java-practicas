package ej4;

import java.util.ArrayList;

public class Vivienda {
	
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(String calle,int altura, int piso, String departamento) {
		super();
		
		this.direccion = new Direccion(calle ,altura ,piso,departamento);
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void agregarPersona(String nombre, String apellido, int edad) {
		
		Persona persona = new Persona(nombre,apellido,edad);
		personas.add(persona);
		
	}
	
	public void agregarMueble(String nombreMueble, String material, String color) {
		
		Mueble mueble = new Mueble(nombreMueble,material,color);
		muebles.add(mueble);
		
	}

	@Override
	public String toString() {
		return "Vivienda [direccion=" + direccion + ", personas=" + personas + ", muebles=" + muebles + "]";
	}
	
	
	
	
}
