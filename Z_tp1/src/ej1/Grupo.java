package ej1;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		this.integrantes = new ArrayList<>();
	}

	public void agregarIntegrante(String nombreIntegrante) {
		String miIntegrante = buscarIntegrante(nombreIntegrante);
		if (miIntegrante == null) {
			integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " fue asignado al grupo "+this.nombre);

		} else {
			System.out.println(nombreIntegrante +  " Ya existia, no puedo ser ingresado a " +this.nombre);
		}

	}

	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		String miNombre = null;
		int resultado = -1;

		while (i < integrantes.size() && miNombre == null) {
			if (integrantes.get(i).equals(nombreIntegrante)) {
				miNombre = integrantes.get(i);
				resultado = i;
			} else {
				i++;
			}

		}

		return resultado;

	}

	public String obtenerIntegrante(int posicion) {
		String miIntegrante = null;

		if (integrantes.size() >= posicion) {
			miIntegrante = integrantes.get(posicion-1);
		}

		return miIntegrante;

	}
	
	private String buscarIntegrante(String nombre) {
		int i = 0;
		String miIntegrante = null;
		while (i < integrantes.size() && miIntegrante == null) {
			if (integrantes.get(i).equals(nombre)) {
				miIntegrante = nombre;

			} else {
				i++;
			}
		}
		return miIntegrante;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String miIntegrante = buscarIntegrante(nombreIntegrante);
		integrantes.remove(miIntegrante);
		
		return miIntegrante;
	}
	

	public void cant() {
		System.out.println(integrantes.size());
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCantidadIntegrantes() {

		return this.integrantes.size();
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", integrantes=" + integrantes + "]";
	}

	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes: " + this.integrantes.size());
		for (String integrante : integrantes) {
			System.out.println(integrante);
		}
	}

	public void mostrar() {
		mostrarIntegrantes();
	}

	public void vaciar() {
		integrantes.clear();
	}
	
	

}
