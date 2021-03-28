package ej5_vueltoAHacer;

import java.util.ArrayList;

public class Piloto {

	private String nombre;
	private String dni;
	private ArrayList<Vuelta> vueltas;

	public Piloto(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.vueltas = new ArrayList<Vuelta>();
	}

	public double calcularVueltaPromedio(Piloto piloto) {
		double contador = 0;
		double prom = 0;
		for (Vuelta vuelta : vueltas) {
			contador += vuelta.dameTiempo();

		}

		prom = contador / vueltas.size();

		return prom;
	}

	public int cantidadVueltas() {
		return this.vueltas.size();
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", dni=" + dni + ", vueltas=" + vueltas + "]";
	}

}
