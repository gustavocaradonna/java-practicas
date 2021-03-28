package test;

import java.util.ArrayList;

public class Materia {

	private ArrayList<Profesor> profesores;
	private String nombre;
	private int cantidadInscriptos;

	public Materia(String nombre, int cantidadInscriptos) {

		this.profesores = new ArrayList<>();
		this.nombre = nombre;
		this.cantidadInscriptos = cantidadInscriptos;
	}

	public boolean agregarProfesor(String nombre, int antiguedad, int sueldo) {
		boolean resultado = false;
		Profesor miProfe = buscarProfe(nombre);

		if (miProfe == null) {
			resultado = true;
			
			Profesor nuevoProfe = new Profesor(nombre, antiguedad, sueldo);
			profesores.add(nuevoProfe);

		}

		return resultado;
	}
	
	public boolean eliminarProfe(String nombre) {
		boolean resultado = false;
		Profesor miProfe = buscarProfe(nombre);

		if (miProfe != null) {
			resultado = true;
			
			profesores.remove(miProfe);

		}

		return resultado;
	}
	
	

	private Profesor buscarProfe(String nombre) {

		int i = 0;
		Profesor miProfe = null;

		while (i < profesores.size() && miProfe == null) {

			if (this.profesores.get(i).getNombre() == nombre) {
				miProfe = profesores.get(i);
			} else {

				i++;
			}
		}
		return miProfe;
	}
	
	
	public void listarProfe() {
		for (Profesor profesor : profesores) {
			System.out.println(profesor);
		}
	}
	

}
