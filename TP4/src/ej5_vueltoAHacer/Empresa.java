package ej5_vueltoAHacer;

import java.util.ArrayList;

import parcial4_noHayForma.Socio;

public class Empresa {

	private String nombre;
	private ArrayList<Carrera> carreras;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.carreras = new ArrayList<Carrera>();

	}

	public Carrera buscarCarrera(String fecha) {
		Carrera carrera = null;
		int i = 0;
		while (i < carreras.size() && carrera == null) {

			if (carreras.get(i).dameFecha() == fecha) {

				carrera = carreras.get(i);
			} else {
				i++;
			}
		}

		return carrera;
	}

	public ArrayList<InfoCarrera> informeResumidoPorCarrera() {
		ArrayList<InfoCarrera> lista = new ArrayList<InfoCarrera>();

		for (Carrera carrera : carreras) {
			lista.add(carrera.obtenerInfoCarrera());

		}

		return lista;
	}

}
