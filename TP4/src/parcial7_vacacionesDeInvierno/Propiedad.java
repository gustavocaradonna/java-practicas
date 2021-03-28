package parcial7_vacacionesDeInvierno;

public class Propiedad {
	
	private String direccion;
	private int cantidadAmbientes;
	private Zona zona;
	private double precio;
	private boolean estaAlquilado;
	
	
	
	//constructor
	public Propiedad(String direccion, int cantidadAmbientes, Zona zona, double precio, boolean estaAlquilado) {
		super();
		this.direccion = direccion;
		this.cantidadAmbientes = cantidadAmbientes;
		this.zona = zona;
		this.precio = precio;
		this.estaAlquilado = estaAlquilado;
	}



	public String getDireccion() {
		return direccion;
	}

	public boolean getEstaAlquilado() {
		
		return estaAlquilado;
	}
	

	


	public void setEstaAlquilado(boolean estaAlquilado) {
		this.estaAlquilado = estaAlquilado;
	}



	public int getCantidadAmbientes() {
		return cantidadAmbientes;
	}



	public Zona getZona() {
		return zona;
	}



	@Override
	public String toString() {
		return "Propiedad [direccion=" + direccion + ", cantidadAmbientes=" + cantidadAmbientes + ", zona=" + zona
				+ ", precio=" + precio + ", estaAlquilado=" + estaAlquilado + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
