package examen_final;

import java.util.ArrayList;

import test.Socio;

public class Edificio {

	private String direccion;
	private int cantidadDeptos;
	private ArrayList<Departamento> departamentos;
	private static final int MINIMODEPTO = 0;

	public Edificio(String direccion, int cantidadDeptos) {
		this.direccion = direccion;
		this.cantidadDeptos = cantidadDeptos;
		this.departamentos = new ArrayList<Departamento>(cantidadDeptos);
	}

	public void agregarUnidad(int numeroUnidad, int dni, String nombre) {

		Departamento miDepartamento = buscarDepartamento(numeroUnidad);

		if (miDepartamento == null && numeroUnidad <= this.cantidadDeptos && numeroUnidad>MINIMODEPTO) {

			miDepartamento = new Departamento(numeroUnidad, dni, nombre);
			departamentos.add(miDepartamento);
			System.out.println("Departamento agregado satisfactoriamente");
			System.out.println(miDepartamento);
		}else {
			System.out.println("La unidad ya existe o es distinta a los departamentos disponibles ");
		}

	}

	public void actualizarVoto(int numeroUnidad, boolean nuevoVoto) {

		Departamento miDepartamento = buscarDepartamento(numeroUnidad);

		if (miDepartamento != null && miDepartamento.isModificoVoto1Vez() == false) {

			System.out.println("Voto modificado");
			miDepartamento.setModificoVoto1Vez(true);
			miDepartamento.setVoto(nuevoVoto);

		} else {
			System.out.println("La unidad no existe o su voto ya fue modificado.");
		}
	}

	public void listarVotosPositivos() {

		for (Departamento departamento : departamentos) {
			if (departamento.getVoto() == true) {
				System.out.println("Voto positivo: " + departamento);
			}
		}
	}

	public void calcularPorcentaje() {

		double positivos = 0;
		double total = 0;
		for (Departamento departamento : departamentos) {
			if (departamento.getVoto() == true) {
				positivos++;
			}
			
			total++;
			
		}
		
		System.out.println("El porcentaje que votó despedir al encargado es " + (positivos/total)*100 + "%." );
	}
	
	public void longitud() {
		System.out.println("La longitud de este edificio es " + departamentos.size());
	}

	private Departamento buscarDepartamento(int numeroUnidad) {

		Departamento miDepartamento = null;
		int i = 0;

		while (miDepartamento == null && i < departamentos.size()) {

			if (departamentos.get(i).getNumeroUnidad() == numeroUnidad) {
				miDepartamento = departamentos.get(i);
			} else {
				i++;
			}
		}

		return miDepartamento;
	}

}
