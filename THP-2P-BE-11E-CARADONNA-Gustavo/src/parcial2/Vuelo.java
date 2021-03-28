package parcial2;

import java.util.ArrayList;

public class Vuelo {

	private String numeroVuelo;
	private int cantidadTotalAsientos;
	private ArrayList<Asiento> asientosReservados;
	private double montoTotalRecaudado;

	public Vuelo(String numeroVuelo, int cantidadTotalAsientos) {

		this.numeroVuelo = numeroVuelo;
		this.cantidadTotalAsientos = cantidadTotalAsientos;
		this.asientosReservados = new ArrayList<Asiento>();
		this.montoTotalRecaudado = 0;
	}

	public void mostrarX() {
		System.out.println("cantidad total asientos : " + this.cantidadTotalAsientos);
		System.out.println("cantidad total de asientos reservados (array) : " + this.asientosReservados.size());

	}

	public ResultadoReservaBoletos reservarAsiento(int dni, int telefono, Clase claseAsiento) {

		Asiento asiento = buscarAsientoReservado(dni);
		ResultadoReservaBoletos resultado;
		if (this.cantidadTotalAsientos == this.asientosReservados.size()) {

			resultado = ResultadoReservaBoletos.ERROR_AVION_COMPLETO;
		} else if (asiento != null) {

			resultado = ResultadoReservaBoletos.ERROR_YA_TIENE_UN_PASAJE;

		} else {
			resultado = ResultadoReservaBoletos.RESERVA_CONFIRMADA;
			Pasajero pasajeroAux = new Pasajero(dni, telefono);
			Asiento asientoAux = new Asiento(claseAsiento, pasajeroAux);

			this.montoTotalRecaudado += asientoAux.getPrecio();
			this.asientosReservados.add(asientoAux);
		}

		return resultado;
	}

	// método privado que van a usar otros metodos para buscar asiento por dni
	private Asiento buscarAsientoReservado(int dni) {
		int i = 0;
		Asiento asiento = null;

		while (i < asientosReservados.size() && asiento == null) {
			if (this.asientosReservados.get(i).getPasajero().getDni() == (dni)) {
				asiento = asientosReservados.get(i);
			} else {
				i++;
			}
		}
		return asiento;

	}

	public void listarAsientosReservados() {

		System.out.println("Cantidad de asientos reservados: " + asientosReservados.size());
		for (Asiento asiento : asientosReservados) {
			System.out.println(asiento);
		}

		System.out.println(
				"Esto no lo pedia pero es el monto total recaudado (lo creé para ver si ponia y sacaba bien la plata al crear o dar de baja las reservas. :"
						+ this.montoTotalRecaudado);
	}

	public void anularReserva(int dni) {

		Asiento asientoAux = buscarAsientoReservado(dni);

		if (asientoAux != null) {

			asientosReservados.remove(asientoAux);
			System.out.println("Se ha anulado la reserva con éxito");
			this.montoTotalRecaudado -= asientoAux.getPrecio();

		} else {
			System.out.println("No existe una reserva con ese DNI");
		}
	}

	private double obtenerAcumuladoPorClase(Clase claseAsiento) {
		double acum = 0;
		for (Asiento asiento : asientosReservados) {
			if (asiento.getClaseAsiento() == claseAsiento) {
				acum += asiento.getPrecio();

			}
		}
		return acum;
	}

	public void mostrarMontoRecaudadoDeClase(Clase claseAsiento) {
		double acum = obtenerAcumuladoPorClase(claseAsiento);

		if (asientosReservados.size() == 0) {
			System.out.println("No hay asientos reservados en ninguna clase");
		} else {

			if (acum > 0) {
				System.out.println("El monto acumulado hasta el momento en la clase " + claseAsiento + " es " + acum);
			} else if (acum <= 0) {
				System.out.println("No hay asientos reservados para clase " + claseAsiento);
			}

		}
	}

}
