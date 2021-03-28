package test;

import java.util.ArrayList;


public class Equipo {

	private String nombre;
	private ArrayList<Jugador> jugadores;
	private static final int MAX_JUGADORES = 18;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();

	}

	public boolean agregarJugador(int numero, String apellido, String nombre, Posicion posicion, int valoracion) {
		boolean resultado = false;
		Jugador miJugador = null;

		miJugador = this.buscarJugador(numero);
		if (miJugador == null && jugadores.size() < MAX_JUGADORES) {
			jugadores.add(new Jugador(numero, apellido, nombre, posicion, valoracion));
		resultado = true;
		}

		return resultado;

	}

	public Jugador buscarJugador(int numero) {

		int i = 0;
		Jugador miJugador = null;

		while (i < jugadores.size() && miJugador == null) {

			if (this.jugadores.get(i).getNumero() == numero) {
				miJugador = jugadores.get(i);
			} else {

				i++;
			}
		}
		return miJugador;
	}
	
	public int totalValoraciones() {
		int total = 0;
		
		for (Jugador jugador : jugadores) {
			total += jugador.getValoracion();
		}
		
		return total;
	}
	

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
