package ej1;


public class SubContratado extends Empleado {
	
	public static float maximoHoras = 100;
	protected float cantHoras;
	protected float precioHora;
	
	public SubContratado() {
	}

	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		setCantHoras(cantHoras);
		setPrecioHora(precioHora);
	}

	private void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	private void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
	public static void setMaximoHoras(float maximoHoras) {
		SubContratado.maximoHoras = maximoHoras;
	}

	public static float getMaximoHoras() {
		return maximoHoras;
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	@Override
	public String toString() {
		return "Subcontratado " + super.getNombre() + " gana "+ (cantHoras * precioHora) ;
	}
	
	@Override
	public float calcularPago() {
		return cantHoras * precioHora;
	}
	
	
}

