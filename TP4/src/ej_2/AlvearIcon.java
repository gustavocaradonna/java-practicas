package ej_2;

import java.util.ArrayList;


public class AlvearIcon {

	private String direccion;
	private int cantidadDeptos;
	private ArrayList<Depto> departamentos;
	private ArrayList<Depto> morosos;

	// constructor Alvear Icon
	public AlvearIcon(String direccion, int cantidadDeptos) {

		this.direccion = direccion;
		this.cantidadDeptos = cantidadDeptos;
		this.departamentos = new ArrayList<Depto>();
		this.morosos = new ArrayList<Depto>();
	}

	public void habitarUnidad(int numeroUnidad, int dni, String nombre) {

		Depto existe;
		existe = buscarUnidad(numeroUnidad);

		if (existe == null) {
			if (numeroUnidad <= this.cantidadDeptos) {
				departamentos.add(new Depto(numeroUnidad, dni, nombre));
			} else {
				System.out.println(
						"La unidad que intenta crear es mayor a la cantidad de departamentos que tiene el edificio.");
			}
		} else {
			System.out.println("Ya esta ocupado");
		}
	}

	// existe?
	private Depto buscarUnidad(int numeroUnidad) {

		int i = 0;
		Depto depto = null;

		while (i < departamentos.size() && depto == null) {

			if (this.departamentos.get(i).getNumeroUnidad() == numeroUnidad) {
				depto = departamentos.get(i);
			} else {

				i++;
			}
		}
		return depto;
	}
	
	
	public void agregarDeuda(int numeroUnidad, int importe){
		Depto deptoAux = buscarUnidad(numeroUnidad);
		if(deptoAux != null && importe>0) {
			
			deptoAux.setDeuda(importe);
			
		}
		
		if(deptoAux.getDeuda()>0) {
			morosos.add(deptoAux);
		}
		
		
	}
	
	

	
	public void cancelarDeuda(int numeroUnidad, int importe){
		Depto deptoAux = buscarUnidad(numeroUnidad);
		double debe;
		double total = 0;
		if(deptoAux != null && importe>0) {
			
			 debe = deptoAux.getDeuda();
			 total = debe - importe;
			deptoAux.setDeuda(total);
			
		}
		
		if(total <= 0) {
			morosos.remove(deptoAux);
		}
		
		
	}
	
	public void listarMorosos() {
		System.out.println("Lista de morosos" + this.morosos);
		
	}
	
	
	
	public void listarUnidades() {
		System.out.println("Lista de unidades" + this.departamentos);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
