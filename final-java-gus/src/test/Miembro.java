package test;

public class Miembro {
	
	private String dni;
	private String nombre;
	private ValorVoto voto;
	
	
	
	public Miembro(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.voto = null;
	}



	public String getDni() {
		return dni;
	}



	private void setDni(String dni) {
		this.dni = dni;
	}



	private String getNombre() {
		return nombre;
	}



	private void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ValorVoto getVoto() {
		return voto;
	}



	public void setVoto(ValorVoto voto) {
		this.voto = voto;
	}



	@Override
	public String toString() {
		return "Miembro [dni=" + dni + ", nombre=" + nombre + ", voto=" + voto + "]";
	}
	

	
	
	
}
