package parcial_vuelo_t2;

public class Asiento {

	private Pasajero pasajero;
	private Clase clase;
	private double precio;
	private String fila;
	private int numeroAsiento;

	private static final double PRECIO_TURISTA = 50000;
	private static final double PRECIO_BUSINESS = 100000;
	private static final double PRECIO_PRIMERA = 150000;
	
	private static final int MIN_ASIENTO = 1;
	private static final int MAX_ASIENTO = 6;

	
	public Asiento(Pasajero pasajero, Clase clase, String fila, int numeroAsiento) {

		this.pasajero = pasajero;
		this.clase = clase;
		setPrecioSegunClase(clase);
		this.fila = fila;
		setNumeroAsiento(numeroAsiento);
		}
		
	
	private void setNumeroAsiento(int numeroAsiento) {
		if(numeroAsiento >= MIN_ASIENTO  && numeroAsiento <= MAX_ASIENTO) {
			this.numeroAsiento = numeroAsiento;
		}
	}
	
	public String dameFila() {
		return this.fila;
	}

	public int dameNumeroAsiento() {
		return this.numeroAsiento;
	}
	
	public Clase dameClase() {
		return this.clase;
	}
	
	public double damePrecio() {
		return this.precio;
	}

	private void setPrecioSegunClase(Clase claseRecibida) {
		double total = 0;
		switch (claseRecibida) {
		case TURISTA:
			this.precio = PRECIO_TURISTA;

			break;
		case BUSINESS:
			this.precio = PRECIO_BUSINESS;

			break;

		case PRIMERA:
			this.precio = PRECIO_PRIMERA;

			break;

		default:
			break;
		}

	}


	@Override
	public String toString() {
		return "Asiento [pasajero=" + pasajero + ", clase=" + clase + ", precio=" + precio + ", fila=" + fila
				+ ", numeroAsiento=" + numeroAsiento + "]";
	}

	
	
	

}
