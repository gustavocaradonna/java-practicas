package ej_5;
import java.util.ArrayList;

import ej_4.Turno;

public class Empresa {
	
	private ArrayList<Carrera>carreras;
	
	
	public Carrera buscarCarrera(String fecha) {
		int i = 0;
		Carrera carrera = null;
		
		while (i < carreras.size() && carrera == null) {
			if (this.carreras.get(i).getFecha().equals(fecha)) {
				carrera = carreras.get(i);
			} else {
				i++;
			}
		}
		return carrera;
	}
	
	public ArrayList<Carrera>informeResumidoPorCarrera(){
		ArrayList<Carrera> carrera = null;
		
		
		
		return carrera;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
