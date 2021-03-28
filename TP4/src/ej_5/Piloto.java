package ej_5;

import java.util.ArrayList;

public class Piloto {
	
	private String nombre;
	private String dni;
	private ArrayList<Vuelta>vueltas;
	
	
	public double calcularVueltaPromedio(){
		double promedio = 0;
		double totalSegundos = 0;
		for (Vuelta vuelta:vueltas) {
			totalSegundos += vuelta.getSegundos();
			
		}
		return promedio/vueltas.size();
	}


	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}


	public ArrayList<Vuelta> getVueltas() {
		return vueltas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
