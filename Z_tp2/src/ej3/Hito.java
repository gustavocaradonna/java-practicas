package ej3;

import java.util.ArrayList;

public class Hito {
	
	private String fecha;
	private String descripcion;
	private ArrayList<Persona>personasInvolucradas;
	
	
	public Hito(String fecha, String descripcion) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona persona) {
		
		personasInvolucradas.add(persona);
	}
	
	


	@Override
	public String toString() {
		return "Hito [fecha=" + fecha + ", descripcion=" + descripcion + ", personasInvolucradas="
				+ personasInvolucradas + "]";
	}
	
	
	
	
	
	
	

}
