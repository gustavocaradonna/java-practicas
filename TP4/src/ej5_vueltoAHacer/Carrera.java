package ej5_vueltoAHacer;

import java.util.ArrayList;

public class Carrera {

	private String fecha;
	private String hora;
	private Dificultad dificultad;
	private ArrayList<Piloto> pilotos;

	public Carrera(String fecha, String hora, Dificultad dificultad) {
		this.fecha = fecha;
		this.hora = hora;
		this.dificultad = dificultad;
		this.pilotos = new ArrayList<Piloto>();
	}

	public String dameFecha() {

		return this.fecha;
	}

	public ArrayList<Piloto> buscarPilotosPorDebajoDe(int promedioTiempo) {
		ArrayList<Piloto> lista = new ArrayList<Piloto>();

		for (Piloto piloto : lista) {
			if (piloto.cantidadVueltas() >= 10 && piloto.calcularVueltaPromedio(piloto) < promedioTiempo) {
				lista.add(piloto);
			}
		}

		return lista;
	}

	public Piloto mostrarMenorPromedio() {
		double prom = 0;
		double min = 0;
		Piloto miPiloto = null;

		for (Piloto piloto : pilotos) {
			double vueltaPromedio = piloto.calcularVueltaPromedio(piloto);
			if (vueltaPromedio < min) {
				miPiloto = piloto;
			}
		}

		return miPiloto;
	}

	public InfoCarrera obtenerInfoCarrera() {

		InfoCarrera info = new InfoCarrera(fecha, hora, dificultad, pilotos.size());

		return info;
	}

}
