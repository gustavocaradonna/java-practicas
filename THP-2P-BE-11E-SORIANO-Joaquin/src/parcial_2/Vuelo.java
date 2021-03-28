package parcial_2;

import java.util.ArrayList;

public class Vuelo {
	private String nroVuelo;
	private int cantAsientos;
	private ArrayList<Asiento> asientosReservados;
	private double totalRecaudado;

	public Vuelo(String nroVuelo, int cantAsientos) {
		this.nroVuelo = nroVuelo;
		this.cantAsientos = cantAsientos;
		this.asientosReservados = new ArrayList<>();
		this.totalRecaudado = 0;
	}

	public ResultadoReservaBoletos reservarAsiento(int dni, int telefono, Clase clase) {
		ResultadoReservaBoletos resu = null;
		if (asientosReservados.size() == cantAsientos) {
			resu = ResultadoReservaBoletos.AVION_COMPLETO;
		} else if (buscarAsientoReservado(dni) != null) {
			resu = ResultadoReservaBoletos.ERROR_YA_TIENE_PASAJE;
		} else {
			Asiento asiento = new Asiento(clase, (new Pasajero(dni, telefono)));
			asientosReservados.add(asiento);
			resu = ResultadoReservaBoletos.RESERVA_CONFIRMADA;
			this.totalRecaudado += asiento.getPrecio();
		}
		return resu;
	}

	private Asiento buscarAsientoReservado(int dni) {
		Asiento asiento = null;
		int index = 0;
		while (asiento == null && index < asientosReservados.size()) {
			if (asientosReservados.get(index).obtenerDatoPasajero(Dato.DNI) == dni) {
				asiento = asientosReservados.get(index);
			} else {
				index++;
			}
		}
		return asiento;
	}

	public void listarAsientosReservados() {
		System.out.println("Cantidad de asientos reservados hasta el momento: " + asientosReservados.size());
		for (Asiento asiento : asientosReservados) {
			System.out.println(asiento);
		}
	}

	public void anularReserva(int dni) {
		Asiento asiento = buscarAsientoReservado(dni);
		if (asiento != null) {
			this.totalRecaudado -= asiento.getPrecio();
			asientosReservados.remove(asiento);
			System.out.println("Se ha anulado la reserva con éxito");
		} else {
			System.out.println("No existe una reserva con ese DNI");
		}
	}

	private double obtenerAcumuladoPorClase(Clase clase) {
		double montoClase = 0;
		for (Asiento asiento : asientosReservados) {
			if (asiento.getClase().equals(clase)) {
				montoClase += asiento.getPrecio();
			}
		}
		return montoClase;
	}

	public void mostrarMontoRecaudadoDeClase(Clase clase) {
		if (asientosReservados.size() == 0) {
			System.out.println("No hay asientos reservados en ninguna clase");
		} else if (obtenerAcumuladoPorClase(clase) ==0) {
			System.out.println("No hay asientos reservasdos para la clase "+clase);
		} else {
			System.out.println("El monto acumulado hasta el momento en la clase " + clase + " $"
					+ obtenerAcumuladoPorClase(clase));
		}
	}
}
