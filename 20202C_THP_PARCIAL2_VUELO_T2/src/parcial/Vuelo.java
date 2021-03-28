package parcial;

import java.util.ArrayList;

public class Vuelo {
	private ArrayList<Asiento> asientosReservados;
	private int cantidadAsientos;
	private double montoTotalRecaudado;
	private String nroVuelo;

	public Vuelo(String nroVuelo, int cantidadAsientos) {
		this.setNroVuelo(nroVuelo);
		this.setCantidadAsientos(cantidadAsientos);
		this.asientosReservados = new ArrayList<Asiento>();
		this.setMontoTotalRecaudado(0);
	}

	public boolean verDistanciamiento(String fila, int numero) {
		boolean izquierdaOk = false;
		boolean derechaOk = false;
		if (numero == 1 || buscarAsientoReservado(fila, numero - 1) == null) {
			izquierdaOk = true;
		}
		if (numero == 6 || buscarAsientoReservado(fila, numero + 1) == null) {
			derechaOk = true;
		}
		return izquierdaOk && derechaOk;
	}

	private Asiento buscarAsientoReservado(String fila, int numero) {
		Asiento asientoABuscar = null;
		int i = 0;
		while (asientoABuscar == null && i < this.asientosReservados.size()) {
			if (this.asientosReservados.get(i).getFila().equals(fila)
					&& this.asientosReservados.get(i).getNumero() == numero) {
				asientoABuscar = this.asientosReservados.get(i);
			} else {
				i++;
			}
		}
		return asientoABuscar;
	}

	public ResultadoReservaBoletosEnum reservarAsiento(int dni, String telefono, ClaseEnum clase, String fila,
			int numero) {

		ResultadoReservaBoletosEnum resultado = ResultadoReservaBoletosEnum.ERROR_AVION_COMPLETO;

		if (this.asientosReservados.size() < this.cantidadAsientos) { // esto no podria pasar
			if (buscarAsientoReservado(fila, numero) == null) { // si no esta vendido
				if (!verDistanciamiento(fila, numero)) { // si no hay distanciamiento
					resultado = ResultadoReservaBoletosEnum.ERROR_EL_ASIENTO_DE_AL_LADO_ESTA_OCUPADO;
				} else {
					Pasajero pasajero = new Pasajero(dni, telefono);
					Asiento asiento = new Asiento(pasajero, clase, fila, numero);
					this.asientosReservados.add(asiento);
					this.setMontoTotalRecaudado(this.montoTotalRecaudado + asiento.getPrecio());
					resultado = ResultadoReservaBoletosEnum.RESERVA_CONFIRMADA;
				}
			} else {
				resultado = ResultadoReservaBoletosEnum.ERROR_YA_ESTA_VENDIDO;
			}
		}
		return resultado;
	}

	public void anularReserva(int dni) {
		boolean puedeAnular = false;
		Asiento asiento = buscarAsientoReservado(dni);

		if (asiento != null) {
			puedeAnular = this.asientosReservados.remove(asiento);
			if (puedeAnular) {
				this.setMontoTotalRecaudado(this.montoTotalRecaudado - asiento.getPrecio());
				System.out.println("Se ha anulado la reserva con exito");
			}
		} else {
			System.out.println("No existe una reserva con ese dni");
		}
	}

	private Asiento buscarAsientoReservado(int dni) {
		Asiento asientoABuscar = null;
		int i = 0;

		while (asientoABuscar == null && i < this.asientosReservados.size()) {
			if (this.asientosReservados.get(i).mismoPasajero(dni)) {
				asientoABuscar = this.asientosReservados.get(i);
			} else {
				i++;
			}
		}
		return asientoABuscar;
	}

	public void listarAsientosReservados() {
		if (this.asientosReservados.size() > 0) {
			System.out.println("Cantidad de asientos reservados hasta el momento: " + this.asientosReservados.size());
			for (Asiento asiento : this.asientosReservados) {
				System.out.println(asiento);
			}
		} else {
			System.out.println("No hay asientos reservados");
		}
	}

	public void mostrarMontoRecaudadoDeClase(ClaseEnum claseBuscada) {
		double acumulado;
		if (this.asientosReservados.size() > 0) {
			acumulado = obtenerAcumuladoPorClase(claseBuscada);

			if (acumulado > 0) {
				System.out.println("El monto acumulado hasta el momento en " + claseBuscada + " es: $" + acumulado);
			} else {
				System.out.println("No hay asientos reservados para clase " + claseBuscada);
			}
		} else {
			System.out.println("No hay asientos reservados en ninguna clase");
		}
	}

	private double obtenerAcumuladoPorClase(ClaseEnum claseBuscada) {
		double acumulado = 0;
		for (Asiento asiento : this.asientosReservados) {
			if (asiento.getClase() == claseBuscada) {
				acumulado += asiento.getPrecio();
			}
		}
		return acumulado;
	}

	public String getNroVuelo() {
		return nroVuelo;
	}

	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}

	public double getMontoTotalRecaudado() {
		return montoTotalRecaudado;
	}

	public void setMontoTotalRecaudado(double montoTotalRecaudado) {
		this.montoTotalRecaudado = montoTotalRecaudado;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	private void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
}