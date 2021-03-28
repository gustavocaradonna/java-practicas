package parcial2;

public class Asiento {

	private Pasajero pasajero;
	private Clase claseAsiento;
	private double precio;
	
	
	private static final double C_TURISTA = 50000;
	private static final double C_BUSINESS =100000;
	private static final double C_PRIMERA = 150000;

	public Asiento(Clase claseAsiento , Pasajero pasajero) {

		this.claseAsiento = claseAsiento;
		setPrecioSegunClase(claseAsiento);
		this.pasajero = pasajero;

	}

	private void setPrecioSegunClase(Clase claseAsiento) {
		
		switch (claseAsiento) {
		case PRIMERA:
			this.precio = C_PRIMERA;
			
			break;
			
		case BUSINESS:
			this.precio = C_BUSINESS;
			
			break;
			
		case TURISTA:
			this.precio = C_TURISTA;
			
			break;

		default:
			break;
		}
		
		
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public Clase getClaseAsiento() {
		return claseAsiento;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Asiento [pasajero=" + pasajero + ", claseAsiento=" + claseAsiento + ", precio=" + precio + "]";
	}

}
