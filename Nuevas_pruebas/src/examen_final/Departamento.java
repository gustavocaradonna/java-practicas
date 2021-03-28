package examen_final;

public class Departamento {
	
	private int numeroUnidad;
	private int dni;
	private String nombre;
	private boolean voto;
	private boolean modificoVoto1Vez;
	
	
	public Departamento(int numeroUnidad, int dni, String nombre) {
		this.numeroUnidad = numeroUnidad;
		this.dni = dni;
		this.nombre = nombre;
		this.voto = false;
		this.modificoVoto1Vez = false;
	}


	public int getNumeroUnidad() {
		return numeroUnidad;
	}


	private void setNumeroUnidad(int numeroUnidad) {
		this.numeroUnidad = numeroUnidad;
	}


	private int getDni() {
		return dni;
	}


	private void setDni(int dni) {
		this.dni = dni;
	}


	private String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean getVoto() {
		return voto;
	}


	public void setVoto(boolean voto) {
		this.voto = voto;
	}


	public boolean isModificoVoto1Vez() {
		return modificoVoto1Vez;
	}


	public void setModificoVoto1Vez(boolean modificoVoto1Vez) {
		this.modificoVoto1Vez = modificoVoto1Vez;
	}


	@Override
	public String toString() {
		return "Departamento [numeroUnidad=" + numeroUnidad + ", dni=" + dni + ", nombre=" + nombre + ", voto=" + voto
				+ ", modificoVoto1Vez=" + modificoVoto1Vez + "]";
	}
	
	
	

	
	
	

}
