package parcial_2;

public class Asiento {
	private Pasajero pasajero;
	private Clase clase;
	private double precio;

	static final double PRECIO_TURISTA = 50000;
	static final double PRECIO_BUSINESS = 100000;
	static final double PRECIO_PRIMERA = 150000;

	public Asiento(Clase clase, Pasajero pasajero) {
		this.pasajero = pasajero;
		this.clase = clase;
		precio = setPrecioSegunClase(clase);
	}

	public int obtenerDatoPasajero(Dato dato) {
		int valor = 0;
		if (dato.equals(Dato.DNI)) {
			valor = pasajero.getDni();
		} else if (dato.equals(Dato.TELEFONO)) {
			valor = pasajero.getTelefono();
		}
		return valor;
	}

	private double setPrecioSegunClase(Clase clase) {
		double precio = 0;
		switch (clase) {
		case PRIMERA:
			precio = PRECIO_PRIMERA;
			break;
		case BUSINESS:
			precio = PRECIO_BUSINESS;
			break;
		case TURISTA:
			precio = PRECIO_TURISTA;
			break;
		default:
			break;
		}
		return precio;
	}

	@Override
	public String toString() {
		return "Boleto [pasajero=" + pasajero + ", clase=" + clase + ", precio=" + precio + "]";
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public double getPrecio() {
		return precio;
	}

	public Clase getClase() {
		return clase;
	}

}
