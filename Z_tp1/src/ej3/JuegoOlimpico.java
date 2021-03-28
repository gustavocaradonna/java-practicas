package ej3;

import java.util.ArrayList;

public class JuegoOlimpico {

	private static final String GANADORES_PODIO_3 = "Ganadores podio 3: ";
	private static final String GANADORES_PODIO_2 = "Ganadores podio 2: ";
	private static final String GANADORES_PODIO_1 = "Ganadores podio 1: ";
	private static final String NO_HUBO_COMPETIDORES = "No hubo competidores";
	private String nombre;
	private ArrayList<Atleta> atletas;

	public JuegoOlimpico(String nombre) {
		this.nombre = nombre;
		this.atletas = new ArrayList<>();
	}

	public void agregarAtleta(String nombre, double tiempo, Especialidad especialidad) {
		Atleta miAtleta = buscarAtleta(nombre);

		if (miAtleta == null) {
			miAtleta = new Atleta(nombre, tiempo, especialidad);
			atletas.add(miAtleta);
			System.out.println("Atleta " + nombre + " fue agregado con éxito a " + this.nombre);
		} else {
			System.out.println("El atleta ya se encontraba agregado.");
		}

	}

	private Atleta buscarAtleta(String nombre) {
		Atleta miAtleta = null;
		int i = 0;
		while (i < atletas.size() && miAtleta == null) {
			if (atletas.get(i).getNombre().equals(nombre)) {
				miAtleta = atletas.get(i);
			} else {
				i++;
			}
		}

		return miAtleta;
	}

	public void calcularPodio(Especialidad especialidad) {
		ArrayList<Atleta> ganadores;
		ArrayList<Atleta> segundos;
		ArrayList<Atleta> terceros;

		ganadores = new ArrayList<>();
		segundos = new ArrayList<>();
		terceros = new ArrayList<>();

		double tiempoMin1 = 9999999;
		double tiempoMin2 = 9999999;
		double tiempoMin3 = 9999999;

		if (atletas.size() > 0) {

			for (Atleta atleta : atletas) {
				if (atleta.getEspecialidad() == especialidad) {
					if (atleta.getTiempo() < tiempoMin1) {
						ganadores.clear();
						ganadores.add(atleta);
						tiempoMin1 = atleta.getTiempo();

					} else if (atleta.getTiempo() == tiempoMin1) {
						ganadores.add(atleta);

					} 
				}
			}

			// String resultado = (ganadores.size()>1)? "Los ganadores son: ":"El ganador
			// es: ";
			// System.out.println(resultado);
			System.out.println(GANADORES_PODIO_1 + ganadores);
			System.out.println(GANADORES_PODIO_2 + segundos);
			System.out.println(GANADORES_PODIO_3 + terceros);

		} else {
			System.out.println(NO_HUBO_COMPETIDORES);
		}

	}

}
