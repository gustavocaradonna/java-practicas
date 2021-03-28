package ej5_vueltoAHacer;

import java.util.ArrayList;

public class InfoCarrera {

	private String fecha;
	private String hora;
	private Dificultad dificultad;
	private int cantPilotos;

	public InfoCarrera(String fecha, String hora, Dificultad dificultad, int cantPilotos) {
		this.fecha = fecha;
		this.hora = hora;
		this.dificultad = dificultad;
		this.cantPilotos = cantPilotos;
	}

}
