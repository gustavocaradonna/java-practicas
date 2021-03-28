package parcial_1;

import java.util.*;

import ejercicio01.Persona;

public class Academia {

	private String nombre;
	private int cantAlumnos;
	private ArrayList<Alumno> alumnos;

	// constructor de academia

	public Academia(String nombre, int cantAlumnos) {
		super();
		this.nombre = nombre;
		this.cantAlumnos = cantAlumnos;
		this.alumnos = new ArrayList<Alumno>();

	}

	private Alumno buscarAlumno(String dni) {
		Alumno persona1 = null;
		int index = 0;

		while (persona1 == null && index < alumnos.size()) {

			if (dni.equals(alumnos.get(index).getDni())) {
				persona1 = alumnos.get(index);
			}
			index++;
		}

		return persona1;
	}

	public void inscribirAlumno(String dni, String nombre, NivelConocimiento nivel) {

		Alumno a = buscarAlumno(dni);

		if (a == null || a.getDni() != dni) {

			alumnos.add(new Alumno(dni, nombre, nivel));
			System.out.println(alumnos);
			System.out.println("Usuario agregado");
		} else {
			System.out.println("Usuario " + a.getNombre() + " ya inscripto");
		}

	}

	/*
	 * ingresarBajaAlumno: cambiará el estado de un alumno a "B" (baja) pero no
	 * eliminará el alumno de la lista. Recibirá el número de dni del mismo y si el
	 * mismo existe y no tiene deuda le cambiará su estado. En este caso mostrará el
	 * mensaje "estado cambiado con éxito" o en caso contrario "el alumno tiene
	 * deuda o no existe. No puede cambiar de estado".
	 */

	public void ingresarBajaAlumno(String dni) {
		Alumno a = buscarAlumno(dni);

		if (a != null && a.getDeuda() == 0) {
			a.setEstado("B");
			System.out.println("Estado cambiado con éxito");
		} else {
			System.out.println("El alumno tiene deuda o no existe");
		}

	}

	/*
	 * listarAlumnosNivel: muestra la cantidad de alumnos que están inscriptos y con
	 * estado "A" (alta) en un nivel determinado. El mismo será ingresado por
	 * teclado y el método lo recibirá como parámetro. Muestra el nombre del nivel y
	 * su cantidad de alumnos.
	 */

	public void listarAlumnosNivel(NivelConocimiento nivelRecibido) {

		int cant = 0;

		for (Alumno a : alumnos) {

			if (a.getEstado() == "A") {

				if (nivelRecibido == a.getNivel()) {
					cant++;

				}

			}


		}
		
		System.out.println("Nombre Nivel: " + nivelRecibido + ". Cantidad de alumnos: " + cant);

	}

	
	public void cargarPago(String dni , int importeRecibido) {
		
		Alumno alumno = buscarAlumno(dni);
		int suma;
		int deuda;
		
		if(alumno != null) {
			
			deuda = alumno.getDeuda();
			suma = deuda - importeRecibido;
			
			alumno.setDeuda(suma);
			System.out.println(alumno);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * int i = 0;
	 * 
	 * while ( i < alumnos.size() ) {
	 * 
	 * 
	 * if (alumnos.get(i).getDni().equals(dni)) {
	 * 
	 * System.out.println("ya existe"); } else { //lo agrego a la lista de
	 * inscriptos alumnos.add(alumnoX); System.out.println("Alumno " +
	 * alumnoX.getNombre() + " agregado con éxito"); }
	 * 
	 * i++; }
	 */
	/*
	 * boolean existe = false;
	 * 
	 * 
	 * for(Alumno alumnoA: alumnos) { if(alumnoA.getDni().equals(dni)) { existe =
	 * true; System.out.println("ya existe"); break;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * if(!existe) { alumnos.add(alumnoX); System.out.println("Alumno " +
	 * alumnoX.getNombre() + " agregado con éxito");
	 * 
	 * }
	 * 
	 */
	////////////////////////

	/*
	 * int i = 0; boolean existe = true;
	 * 
	 * 
	 * while( alumnos.get(i).getDni() == null ) {
	 * 
	 * 
	 * 
	 * }
	 * 
	 * if(existe=true) { this.alumnos.add(alumnoX); System.out.println("Alumno " +
	 * alumnoX.getNombre() + " agregado con éxito"); }
	 * 
	 * 
	 * 
	 */

	///////////////////

	@Override
	public String toString() {
		return "Academia [nombre=" + nombre + ", cantAlumnos=" + cantAlumnos + "]";
	}

}
