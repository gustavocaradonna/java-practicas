package parcial_concurso;

public class Participante {
	
	private String dni;
	private int puntaje;
	private String nombre;
	private String apellido;
	
	public Participante(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.puntaje = 0;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	
	
	public String dameDni() {
		return this.dni;
	}
	
	
	public String dameNombre() {
		return this.nombre;
	}
	
	public String dameApellido() {
		return this.apellido;
	}
	
	public int damePuntaje() {
		return this.puntaje;
	}
	
	public void agregarPuntaje(int puntajeRecibido) {
		this.puntaje += puntajeRecibido;
	}



	@Override
	public String toString() {
		return "Participante [dni=" + dni + ", puntaje=" + puntaje + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
