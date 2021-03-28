package ejercicio01_test;

import java.util.ArrayList;


public class Agenda {

	
	ArrayList<Persona>personas;
	
	public Agenda() {
	personas = new ArrayList();
	}
	
	
	
	public void agregar(String nombre, String numero) {


		personas.add(new Persona(nombre,numero));
	}
	
	
	public void mostrar() {
		
		/*
		for (int i = 0; i < personas.size() ; i++) {
			System.out.println(personas.get(i));
			
		}
		*/
		
		for(Persona persona: this.personas) {
			System.out.println(persona);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
