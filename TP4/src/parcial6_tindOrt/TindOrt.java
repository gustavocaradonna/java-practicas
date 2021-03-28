package parcial6_tindOrt;

import java.util.ArrayList;

import parcial7_vacacionesDeInvierno.Propiedad;

public class TindOrt {

	private ArrayList<Persona> personas;

	public TindOrt() {
		this.personas = new ArrayList<Persona>();

	}

	// registrar persona
	public void registrarPersona(String nombre, String mail, Genero genero, int edad, Genero generoDeseado,
			int edadMinDeseada, int edadMaxDeseada) {

		boolean existe = buscarPersona(nombre, mail);

		if (!existe) {
			personas.add(new Persona(nombre, mail, genero, edad, generoDeseado, edadMinDeseada, edadMaxDeseada));
		//	System.out.println(personas);
		} else {
			System.out.println("Esa persona ya está registrada.");
		}

	}

	// buscar persona
	private boolean buscarPersona(String nombre, String mail) {

		int i = 0;
		Persona personaAux = null;
		boolean existe = false;

		while (i < personas.size() && personaAux == null) {

			if (this.personas.get(i).getNombre() == nombre || this.personas.get(i).getMail() == mail) {
				personaAux = personas.get(i);
			} else {

				i++;
			}
		}

		if (personaAux != null) {
			existe = true;
		}

		return existe;
	}

	//verificar coincidencia parcial
	
	private boolean verificarCoincidenciaParcial(Persona persona1, Persona persona2) {
		boolean coincidencia = false;

		if (persona1.getGeneroDeseado() == persona2.getGenero() && persona1.getEdadMinDeseada() < persona2.getEdad()
				&& persona1.getEdadMaxDeseada() > persona2.getEdad()) {

			coincidencia = true;

		}
		return coincidencia;
	}

	
	//verificar coincidencia total

	
	private boolean verificarCoincidenciaTotal(Persona persona1, Persona persona2) {

		boolean coincidencia = false;

		if (persona1.getGeneroDeseado() == persona2.getGenero() && persona1.getEdadMinDeseada() < persona2.getEdad()
				&& persona1.getEdadMaxDeseada() > persona2.getEdad()) {

			if (persona2.getGeneroDeseado() == persona1.getGenero() && persona2.getEdadMinDeseada() < persona1.getEdad()
					&& persona2.getEdadMaxDeseada() > persona1.getEdad()) {
				coincidencia = true;

			}

		}
		return coincidencia;

	}
	
	//mostrar listado

	public ArrayList<Persona> mostrarListado(String mail) {

		Persona persona = null;
		persona = buscarPersona(mail);

		ArrayList<Persona> listado;
		listado = new ArrayList<Persona>();

		if (persona != null) {

			for (Persona p : personas) {

					if(verificarCoincidenciaParcial( persona , p)) {
					listado.add(p);
					System.out.println("tu listado de coincidencias es " + listado);
					}


			}

			
			/*
			if (persona.getGeneroDeseado() == p.getGenero() && persona.getEdadMinDeseada() < p.getEdadMinDeseada()
					&& persona.getEdadMaxDeseada() > p.getEdadMaxDeseada()) {
*/
			
			
			
			
			
			
			
			
			
		} else {
			System.out.println("Error, no existe persona");
			listado = null;
		}

		return listado;
	}

	// buscar persona y devolverla
	private Persona buscarPersona(String mail) {

		int i = 0;
		Persona personaAux = null;
		boolean existe = false;

		while (i < personas.size() && personaAux == null) {

			if (this.personas.get(i).getMail() == mail) {
				personaAux = personas.get(i);
			} else {

				i++;
			}
		}

		return personaAux;
	}

}
