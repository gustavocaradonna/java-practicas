package parcial;

public class Asiento {
	private static final double PRECIO_TURISTA = 50000;
	private static final double PRECIO_BUSINESS = 100000;
	private static final double PRECIO_PRIMERA = 150000;

	private Pasajero pasajero;
	private ClaseEnum clase;
	private double precio;
	private String fila;
	private int numero;

	public Asiento(Pasajero pasajero, ClaseEnum clase, String fila, int numero) {
		this.pasajero = pasajero;
		this.setClase(clase);
		this.setPrecioSegunClase();
		this.setFila(fila);
		this.setNumero(numero);
	}

	public String getFila() {
		return fila;
	}

	private void setFila(String fila) {
		this.fila = fila;
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	private void setPrecioSegunClase() {
		if (this.clase == ClaseEnum.TURISTA) {
			this.setPrecio(PRECIO_TURISTA);
		} else if (this.clase == ClaseEnum.BUSINESS) {
			this.setPrecio(PRECIO_BUSINESS);
		} else {
			this.setPrecio(PRECIO_PRIMERA);
		}
	}

	public boolean mismoPasajero(int dni) {
		return this.pasajero.mismoDni(dni);
	}

	public double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private void setClase(ClaseEnum clase) {
		this.clase = clase;

	}

	public ClaseEnum getClase() {
		return clase;
	}

	public Pasajero getPasajero() {
		return this.pasajero;
	}

	@Override
	public String toString() {
		return "Boleto [pasajero=" + pasajero + ", clase=" + clase + ", precio=" + precio + "]";
	}

}
