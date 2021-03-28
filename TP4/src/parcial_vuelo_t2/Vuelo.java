package parcial_vuelo_t2;

import java.util.ArrayList;

public class Vuelo {

	private String numeroVuelo;
	private int cantidadAsientosTotal;
	private double montoTotalRecaudado;
	private ArrayList<Asiento> asientosReservados;

	// constructor
	public Vuelo(String numeroVuelo, int cantidadAsientosTotal) {

		this.numeroVuelo = numeroVuelo;
		this.cantidadAsientosTotal = cantidadAsientosTotal;
		this.montoTotalRecaudado = 0;
		this.asientosReservados = new ArrayList<Asiento>();
	}

	private Asiento buscarAsientoReservado(String fila, int numAsiento) {
		Asiento asiento = null;
		int i = 0;
		while (i < asientosReservados.size() && asiento == null) {

			if (asientosReservados.get(i).dameFila().equals(fila)
					&& asientosReservados.get(i).dameNumeroAsiento() == numAsiento) {
				asiento = asientosReservados.get(i);
			}
			i++;
		}
		return asiento;
	}

	private boolean verDistanciamiento(String letra, int numeroAsiento) {
		boolean respuesta = false;
	
		if (numeroAsiento == 1) {
			if (buscarAsientoReservado(letra, 2) != null) {
				respuesta = true;
			}

		} else if (numeroAsiento == 6) {
			if (buscarAsientoReservado(letra, 5) != null) {
				respuesta = true;
			}

		} else {

			if (buscarAsientoReservado(letra, numeroAsiento - 1) != null) {
				respuesta = true;
			} else if (buscarAsientoReservado(letra, numeroAsiento + 1) != null) {
				respuesta = true;
			}
		}

		return respuesta;
	}

	public Resultado reservarAsiento(int dni, int telefono, Clase clase, int numeroAsiento, String letra) {
		Resultado resultado = null;

		if (this.cantidadAsientosTotal == this.asientosReservados.size()) {
			resultado = Resultado.ERROR_AVION_COMPLETO;
		} else {
			Asiento miAsiento = buscarAsientoReservado(letra, numeroAsiento);

			if (miAsiento != null) {
				resultado = Resultado.ERROR_YA_TIENE_UN_PASAJE;
			} else if (verDistanciamiento(letra, numeroAsiento) == true) {
				resultado = Resultado.ERROR_EL_ASIENTO_DE_AL_LADO_ESTA_OCUPADO;
			} else {
				resultado = Resultado.RESERVA_CONFIRMADA;
				Pasajero pasajero = new Pasajero(dni, telefono);
				Asiento asiento = new Asiento(pasajero, clase, letra, numeroAsiento);

				this.asientosReservados.add(asiento);
				setMontoTotalRecaudado(asiento.damePrecio());
			}

		}
		return resultado;
	}

	private double obtenerAcumuladoPorClase(Clase claseRecibida) {
		double total = 0;

		for (Asiento asiento : asientosReservados) {
			if (asiento.dameClase() == claseRecibida) {
				total += asiento.damePrecio();
			}
		}
		return total;
	}

	public void mostrarMontoRecaudadoDeClase(Clase claseRecibida) {

		if (asientosReservados.size() == 0) {
			System.out.println("No hay asientos reservados en ninguna clase");
		} else {
			double monto = obtenerAcumuladoPorClase(claseRecibida);

			if (monto <= 0) {
				System.out.println("No hay asientos reservados para clase " + claseRecibida);
			} else {
				System.out.println(
						"El monto acumulado hasta el momento en la clase " + claseRecibida + " es: $ " + monto);
			}

		}

	}

	private void setMontoTotalRecaudado(double montoRecibido) {

		this.montoTotalRecaudado += montoRecibido;

	}

	@Override
	public String toString() {
		return "Vuelo [numeroVuelo=" + numeroVuelo + ", cantidadAsientosTotal=" + cantidadAsientosTotal
				+ ", asientosReservados=" + asientosReservados + ", montoTotalRecaudado=" + montoTotalRecaudado + "]";
	}

}
