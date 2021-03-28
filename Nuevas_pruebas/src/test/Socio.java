package test;

public class Socio {

	private int dni;
	private String nombre;
	private int categoria;
	private double deuda;
	private String estado;
	
	
	
	public Socio(int dni, String nombre, int categoria, double deuda) {
		
		this.dni = dni;
		this.nombre = nombre;
		setCategoria(categoria);
		this.deuda = deuda;
		this.estado = "N";
	}



	public int getDni() {
		return dni;
	}



	private void setDni(int dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	private void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCategoria() {
		return categoria;
	}



	private void setCategoria(int categoria) {
		if(categoria>0 && categoria <4) {
		this.categoria = categoria;
		}
	}



	public double getDeuda() {
		return deuda;
	}



	private void setDeuda(double deuda) {
		this.deuda = deuda;
	}



	private String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + ", deuda=" + deuda
				+ ", estado=" + estado + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
