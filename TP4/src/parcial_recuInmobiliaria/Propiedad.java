package parcial_recuInmobiliaria;

public class Propiedad {
	
	private String direccion;
	private int cantAmbientes;
	private double superficieM2;
	private double precio;
	private String tipoOperacion;
	private String barrio;
	
	
	
	public Propiedad(String direccion, int cantAmbientes, double precio, double superficeM2,String tipoOperacion , String barrio) {
		this.direccion = direccion;
		this.cantAmbientes = cantAmbientes;
		this.superficieM2 = superficeM2;
		this.precio = precio;
		this.tipoOperacion = tipoOperacion;
		this.barrio = barrio;
	}
	
	
	
	public String dameDireccion() {
		
		return this.direccion;
	}
	public String dametipoOperacion() {
		
		return this.tipoOperacion;
	}
	public double damePrecio() {
		
		return this.precio;
	}
	
	
	public void actualizarPrecio(double precio) {
		this.precio = precio;
	}
	
	public String dameBarrio() {
		return this.barrio;
	}



	@Override
	public String toString() {
		return "Propiedad [direccion=" + direccion + ", cantAmbientes=" + cantAmbientes + ", superficieM2="
				+ superficieM2 + ", precio=" + precio + ", tipoOperacion=" + tipoOperacion + ", barrio=" + barrio + "]";
	}
	
	
	
	

}
