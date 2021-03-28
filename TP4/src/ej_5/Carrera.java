package ej_5;

import java.util.ArrayList;

public class Carrera {

	
	private String fecha;
	private String hora;
	private Dificultad dificultad;
	private ArrayList<Piloto>pilotos;
	public String getFecha() {
		return fecha;
	}
	private void setFecha(String fecha) {
		this.fecha = fecha;
	}
	private String getHora() {
		return hora;
	}
	private void setHora(String hora) {
		this.hora = hora;
	}
	private Dificultad getDificultad() {
		return dificultad;
	}
	private void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}
	private ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	private void setPilotos(ArrayList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	
	public ArrayList<Piloto> buscarPilotosPorDebajoDe (int promedioTiempo) {
		ArrayList<Piloto>lista = new ArrayList();
		
		for (Piloto piloto: pilotos) {
			if(piloto.getVueltas().size() >= 10  && piloto.calcularVueltaPromedio() < promedioTiempo) {
				
				lista.add(piloto);
			}
		}
		return lista;
	}

	public void mostrarMenorPromedio() {
		Piloto pilotoMenor = null;
		double minimo = 99999999;
		for (Piloto piloto : pilotos) {
			
			if(piloto.calcularVueltaPromedio() < minimo) {
				pilotoMenor = piloto;	
			}	
		}
		System.out.println("Nombre del piloto con menor tiempo:" + pilotoMenor.getNombre()+ " dni: " + pilotoMenor.getDni());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
