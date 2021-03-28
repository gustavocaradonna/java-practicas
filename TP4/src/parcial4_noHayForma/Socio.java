package parcial4_noHayForma;

public class Socio {
	
	private int dni;
	private String nombre;
	private int categoria;
	private double deuda;
	private String estado;
	

	public Socio(int dni, String nombre, int categoria, double deuda) {
		this.dni = dni;
		this.nombre = nombre;
		this.categoria = categoria;
		this.deuda = deuda;
		this.estado = "N";
	}
	
	public int dameDni() {
		
		return this.dni;
	}
	
	
	public double dameDeuda() {
		
		return this.deuda;
	}
	
	public void cambiarEstado(String estadoRecibido) {
		
		this.estado = estadoRecibido;
	}
	
	

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", categoria=" + categoria + ", deuda=" + deuda
				+ ", estado=" + estado + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
