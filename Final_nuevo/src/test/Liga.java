package test;

import java.util.ArrayList;

public class Liga {

	private String nombre;
	private ArrayList<Equipo> equipos;

	public Liga(String nombre) {
		this.nombre = nombre;
		this.equipos = new ArrayList<>();
	}

	public boolean agregarEquipo(String nombre) {
		boolean resultado = false;
		Equipo miEquipo = null;

		miEquipo = this.buscarEquipo(nombre);
		if (miEquipo == null) {
			equipos.add(new Equipo(nombre));
			resultado = true;
		}

		return resultado;

	}

	private Equipo buscarEquipo(String nombre) {

		int i = 0;
		Equipo miEquipo = null;

		while (i < equipos.size() && miEquipo == null) {

			if (this.equipos.get(i).getNombre().equals(nombre)) {
				miEquipo = equipos.get(i);
			} else {

				i++;
			}
		}
		return miEquipo;
	}

	public boolean agregarJugador(String nombreEquipo, int numero, String apellido, String nombre, Posicion posicion,
			int valoracion) {
		boolean resultado = false;
		Equipo miEquipo = null;
		miEquipo = this.buscarEquipo(nombreEquipo);

		if (miEquipo != null) {
			resultado = miEquipo.agregarJugador(numero, apellido, nombre, posicion, valoracion);

		}

		return resultado;

	}

	public Resultado competir(String equipo1, String equipo2) {
		Resultado miResultado = Resultado.PARTIDO_INEXISTENTE;
		Equipo local = this.buscarEquipo(equipo1);
		Equipo visitante = this.buscarEquipo(equipo2);

		int totalLocal = local.totalValoraciones();
		int totalVisitante = visitante.totalValoraciones();

		if (totalLocal > totalVisitante) {
			miResultado = Resultado.LOCAL;
		} else if (totalLocal < totalVisitante) {
			miResultado = Resultado.VISITANTE;
		}

		return miResultado;
	}

	public void mostrarAllStar() {

	}

}
