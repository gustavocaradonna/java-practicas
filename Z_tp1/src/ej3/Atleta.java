package ej3;

public class Atleta {
	
	private String nombre;
	private double tiempo;
	private Especialidad especialidad;
	public Atleta(String nombre, double tiempo , Especialidad especialidad) {
		
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.especialidad = especialidad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public double getTiempo() {
		return tiempo;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", tiempo=" + tiempo + ", especialidad=" + especialidad + "]";
	}
	
	
	

}
