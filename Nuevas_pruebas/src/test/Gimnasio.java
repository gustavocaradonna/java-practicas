package test;

import java.util.ArrayList;

public class Gimnasio {

	private String nombre;
	private int cantSocios;
	private ArrayList<Socio> socios;
	private ArrayList<Socio> morosos;

	public Gimnasio(String nombre, int cantSocios) {
		this.nombre = nombre;
		this.cantSocios = cantSocios;
		this.socios = new ArrayList<Socio>();
		this.morosos = new ArrayList<Socio>();

	}

	public void inscribirSocio(int dni, String nombre, int categoria, double deuda) {

		if (buscarSocio(dni) != null) {
			System.out.println("El socio ya existe");

		} else {

			System.out.println("Socio agregado con éxito");
			this.cantSocios += 1;
			this.socios.add(new Socio(dni, nombre, categoria, deuda));
			this.sumarSocio();
		}

	}

	public void quitarSocio(int dni) {

		Socio miSocio = this.buscarSocio(dni);
		if (miSocio != null && miSocio.getDeuda() <= 0) {

			this.socios.remove(miSocio);
			System.out.println("Socio dado de baja");
			restarSocio();

		} else {
			System.out.println("El socio tiene deuda o no existe. No puede borrarlo");

		}

	}
	
	public void listarDeudoresCategoria(double monto ,int categoria) {
		
		for (Socio socio : morosos) {
			if(socio.getCategoria() == categoria && socio.getDeuda() > monto) {
				System.out.println("Socio deudor " + socio);
			}
			
		}
		
	}
	
	public void ponerMoroso(int dni) {
		Socio miSocio = buscarSocio(dni);
		if(miSocio != null && miSocio.getDeuda() > 0) {
			miSocio.setEstado("M");
			System.out.println("El socio " + miSocio.getNombre() + " ahora es moroso.");
			morosos.add(miSocio);
		}else{
			System.out.println("no encontró");
		}
		
	}
	
	private Socio buscarSocio(int dni) {

		Socio miSocio = null;
		int i = 0;

		while (miSocio == null && i < socios.size()) {

			if (socios.get(i).getDni() == dni) {
				miSocio = socios.get(i);
			}
			else {
				i++;
			}
		}

		return miSocio;
	}
	
	
	
	
	
	private void restarSocio() {
		this.cantSocios -= 1;
	}
	
	private void sumarSocio() {
		this.cantSocios += 1;
	}
	
	public void listarSocios() {
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
	

}
