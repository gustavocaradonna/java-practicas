package test;

import java.util.ArrayList;

public class Tinder {

	private String nombre;
	private ArrayList<Persona> personas;
	private ArrayList<Persona> personasCoincidentes;

	public Tinder(String nombre) {

		this.nombre = nombre;
		this.personas = new ArrayList<>();
		this.personasCoincidentes = new ArrayList<>();

	}

	public String registrarPersona(String nombre, String mail, Genero genero, int edad, Genero generoDeseado,
			int edadMinDeseada, int edadMaxDeseada) {

		String mensaje = "";

		if (this.buscarPorNombreOMail(nombre) == null) {
			mensaje = "Se agrego correctamente a la persona";

			personas.add(new Persona(nombre, mail, genero, edad, generoDeseado, edadMinDeseada, edadMaxDeseada));
		} else {
			mensaje = "La persona ya se encontraba registrada";

		}

		return mensaje;
	}

	private Persona buscarPorNombreOMail(String nombreOMail) {

		int i = 0;
		Persona miPersona = null;

		if (nombreOMail.contains("@")) {

			while (i < personas.size() && miPersona == null) {

				if (this.personas.get(i).getMail() == nombreOMail) {
					miPersona = personas.get(i);
				} else {

					i++;
				}
			}

		} else {

			while (i < personas.size() && miPersona == null) {

				if (this.personas.get(i).getNombre() == nombreOMail) {
					miPersona = personas.get(i);
				} else {

					i++;
				}
			}
		}
		return miPersona;
	}

	private boolean verificarCoincidenciaParcial(Persona persona1, Persona persona2) {

		boolean resultado = false;

		int edadPersona2 = persona2.getEdad();
		if (edadPersona2 >= persona1.getEdadMinDeseada() && edadPersona2 <= persona1.getEdadMaxDeseada()
				&& persona2.getGenero() == persona1.getGeneroDeseado()) {
			resultado = true;
		}

		return resultado;

	}

	private boolean verificarCoincidenciaTotal(Persona Persona1, Persona Persona2) {
		return verificarCoincidenciaParcial(Persona1, Persona2) && verificarCoincidenciaParcial(Persona2, Persona1);
	}

	public ArrayList<Persona> mostrarListado(String mail) {

		Persona miPersona = this.buscarPorNombreOMail(mail);
		ArrayList<Persona> personasCoincidentes = new ArrayList<Persona>();
		if (miPersona == null) {

			System.out.println("Error, no existe una persona con ese mail.");
			personasCoincidentes = null;

		} else {
			System.out.println(
					"Existe una persona con ese mail, devolveremos el listado de coincidencias a continuación:");
			for (Persona persona : personas) {

				if (this.verificarCoincidenciaParcial(miPersona, persona)) {
					personasCoincidentes.add(persona);
				}
			}

		}

		return personasCoincidentes;
	}

}
