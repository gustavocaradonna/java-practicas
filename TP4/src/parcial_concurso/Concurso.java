package parcial_concurso;

import java.util.ArrayList;

public class Concurso {

	private String nombre;
	private ArrayList<Participante> participantes;

	public Concurso(String nombre) {
		this.nombre = nombre;
		this.participantes = new ArrayList<Participante>();

	}

	private Participante buscarParticipante(String dni) {
		int i = 0;
		Participante participante = null;

		while (i < participantes.size() && participante == null) {
			if (participantes.get(i).dameDni() == dni) {
				participante = participantes.get(i);
			}else {
				i++;
			}

		}

		return participante;
	}

	public boolean agregarParticipante(String dni, String nombre, String apellido) {
		boolean resultado = false;
		Participante participante = buscarParticipante(dni);

		if (participante == null) {
			participante = new Participante(dni,nombre,apellido);
			participantes.add(participante);
			resultado = true;
			System.out.println("Se agregó participante con dni " + participante.dameDni());
		}else {
			System.out.println("Ya existia un participante con Dni " + participante.dameDni());
		}

		return resultado;
	}

	public boolean eliminarParticipante(String dni) {
		boolean resultado = false;
		Participante participante = buscarParticipante(dni);

		if (participante != null) {
			participantes.remove(participante);
			resultado = true;
			System.out.println("Se eliminó participante");

		}else {
			System.out.println("No se pudo eliminar un participante con ese dni");

		}

		return resultado;
	}

	public void votarParticipante(String dni) {
		Participante participante = buscarParticipante(dni);
		if (participante != null) {
			participante.agregarPuntaje(1);
			System.out.println("Voto para " + participante.dameNombre() + " " + participante.dameApellido());
		} else {
			System.out.println("Voto invalido: dni inexistente");
		}

	}

	public int cantidadParticipantes() {

		return this.participantes.size();
	}

	public void mayorPuntaje() {
		int cuantosConMax = 0;
		int max = 0;
		int puntajeAux = 0;
		Participante miParticipante = null;
		
		
		if (this.cantidadParticipantes() == 0) {
			System.out.println("No hay participantes inscriptos");
		} else {

		for (Participante participante : participantes) {
			puntajeAux = participante.damePuntaje();

			

				if (puntajeAux > max) {

					max = puntajeAux;
					cuantosConMax = 1;
					miParticipante = participante;
				} else if (puntajeAux == max) {
					cuantosConMax += 1;
				}
			
		}
		System.out.println("El participante con mas puntos es " + miParticipante + ", con " + miParticipante.damePuntaje() + " puntos.");
		}
		
	}

	
	public void listarParticipantesConPuntajeIgualA(int puntaje) {
		
		for (Participante participante : participantes) {
			if(participante.damePuntaje()==puntaje) {
				System.out.println(participante);
			}
		}
		
	}
	
	
	
	
	
	
	
}
