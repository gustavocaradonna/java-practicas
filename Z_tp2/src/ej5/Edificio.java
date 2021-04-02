package ej5;

import java.util.ArrayList;

public class Edificio {

	private ArrayList<Vivienda> viviendas;

	public Edificio() {
		super();
		this.viviendas = new ArrayList<Vivienda>();
	}

	public void agregarVivienda(Vivienda vivienda) {
		viviendas.add(vivienda);
	}

	public void realizarMudanza(int pisoOrigen, String letraDeptoOrigen, int pisoDestino, String letraDestino) {

		Vivienda vivienda1 = this.buscarVivienda(pisoOrigen, letraDeptoOrigen);
		Vivienda vivienda2 = this.buscarVivienda(pisoDestino, letraDestino);

		//istancio nuevas listas
		
		ArrayList<Mueble> mueblesTemporales = new ArrayList<>();
		ArrayList<Persona> personasTemporales = new ArrayList<>();

		
		mueblesTemporales = vivienda1.getMuebles();
		personasTemporales = vivienda1.getPersonas();
		
		
		
		vivienda2.setMuebles(mueblesTemporales);
		vivienda2.setPersonas(personasTemporales);
		
		vivienda1.getMuebles().clear();
		vivienda1.getPersonas().clear();
		
	
		
	}

	private Vivienda buscarVivienda(int piso, String letra) {
		int i = 0;
		Vivienda vivienda = null;

	//	Vivienda viviendaTest = viviendas.get(i);
		while (i < viviendas.size() && vivienda == null) {

			if (viviendas.get(i).getDireccion().getPiso() == piso  && viviendas.get(i).getDireccion().getDepartamento().equals(letra) ) {
				vivienda = viviendas.get(i);

			}
				i++;
			
		}

		return vivienda;
	}
	
	
	
	
	
	
	
	

}
