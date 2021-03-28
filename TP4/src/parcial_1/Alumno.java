package parcial_1;

public class Alumno {

	private String dni;
	private String nombre;
	private NivelConocimiento nivel;
	private int deuda;
	private String estado;
	
	
	
	public Alumno(String dni, String nombre, NivelConocimiento nivel) {

		this.dni = dni;
		this.nombre = nombre;
		this.nivel = nivel;
		this.deuda = 0;
		this.estado = "A";
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public NivelConocimiento getNivel() {
		return nivel;
	}



	public void setNivel(NivelConocimiento nivel) {
		this.nivel = nivel;
	}



	public int getDeuda() {
		return deuda;
	}



	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", nivel=" + nivel + ", deuda=" + deuda + ", estado="
				+ estado + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
