package ej2;

import java.util.ArrayList;

public class JuegoOlimpico {

	private static final String NO_HUBO_COMPETIDORES = "No hubo competidores";
	private static final String EL_GANADOR_ES = "El ganador es: ";
	private static final String LOS_GANADORES_SON = "Los ganadores son: ";
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

	public ArrayList<Atleta> calcularGanador(Especialidad especialidad) {
		ArrayList<Atleta> ganadores;
		ganadores = new ArrayList<>();
		double tiempoMin = 9999999;
		
		if(atletas.size()>0) {

		for (Atleta atleta : atletas) {
			if (atleta.getEspecialidad() == especialidad) {
				if (atleta.getTiempo() < tiempoMin) {
					ganadores.clear();
					ganadores.add(atleta);
					tiempoMin = atleta.getTiempo();

				} else if (atleta.getTiempo() == tiempoMin) {
					ganadores.add(atleta);

				}

			}
		}
		
		String resultado = (ganadores.size()>1)? LOS_GANADORES_SON:EL_GANADOR_ES;
		System.out.println(resultado);
		
		}else {
			System.out.println(NO_HUBO_COMPETIDORES);
		}
		

		return ganadores;
	}
	

}
