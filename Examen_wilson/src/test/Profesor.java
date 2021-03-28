package test;

public class Profesor {
	
	
	private String nombre;
	private int antigueadad;
	private int sueldo;
	
	
	
	public Profesor(String nombre, int antigueadad, int sueldo) {
	
		this.nombre = nombre;
		this.antigueadad = antigueadad;
		this.sueldo = sueldo;
	}



	public String getNombre() {
		return nombre;
	}





	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", antigueadad=" + antigueadad + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
	
	
	
	

}
