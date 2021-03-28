package parcial7_vacacionesDeInvierno;

import java.util.ArrayList;

import parcial2.Departamento;

public class Inmobiliaria {

	private ArrayList<Propiedad> propiedades;

	// constructor de inmobiliaria (solo construye una lista de propiedades)
	public Inmobiliaria() {
		this.propiedades = new ArrayList<Propiedad>();
	}

	// ingresar Propiedades
	public void ingresarPropiedad(String direccion, int ambientes, Zona zona, double precio, boolean estaAlquilado) {
		Propiedad propiedad = buscarPropiedad(direccion);

		if (propiedad == null) {

			propiedades.add(new Propiedad(direccion, ambientes, zona, precio, estaAlquilado));

		}

	}

	// buscarPropiedad
	private Propiedad buscarPropiedad(String direccion) {

		int i = 0;
		Propiedad propiedadAux = null;

		while (i < propiedades.size() && propiedadAux == null) {

			if (this.propiedades.get(i).getDireccion() == direccion) {
				propiedadAux = propiedades.get(i);
			} else {

				i++;
			}
		}

		return propiedadAux;

	}

	// alquilarPropiedad
	public void alquilarPropiedad(String direccion) {
		Propiedad propiedad = buscarPropiedad(direccion);

		if (propiedad == null) {

			System.out.println("No existe");
		} else if (!propiedad.getEstaAlquilado()) {

			propiedad.setEstaAlquilado(true);
			System.out.println("Alquiler efectuado");
		} else if (propiedad.getEstaAlquilado()) {

			propiedad.setEstaAlquilado(true);
			System.out.println("No se puede alquilar, propiedad ya alquilada");

			ArrayList<Propiedad> libres = getPropiedadesLibres(propiedad.getZona(), propiedad.getCantidadAmbientes());

			System.out.println("La lista de libres es " + libres);
		}

	}
	/*
	 * private void mostrarPropiedadesLibres(Propiedad propiedad) {
	 * 
	 * for (Propiedad p:propiedades) { if(propiedad.getCantidadAmbientes() ==
	 * p.getCantidadAmbientes() && propiedad.getZona() == p.getZona() &&
	 * propiedad.getEstaAlquilado() != p.getEstaAlquilado()) {
	 * 
	 * System.out.
	 * println("Propiedad libre para la cantidad de ambientes y zona que eligió: " +
	 * p); }
	 * 
	 * } }
	 */

	private ArrayList<Propiedad> getPropiedadesLibres(Zona zona, int ambientes) {
		ArrayList lista = new ArrayList<Propiedad>();

		for (Propiedad p : propiedades) {
			if (ambientes == p.getCantidadAmbientes() && zona == p.getZona() && p.getEstaAlquilado() == false) {

				// System.out.println("Propiedad libre para la cantidad de ambientes y zona que
				// eligió: " + p);
				lista.add(p);
			}

		}
		return lista;
	}

	public void mostrarPropiedadesOcupadas() {

		for (Propiedad p : propiedades) {

			if (p.getEstaAlquilado() == true) {
				System.out.println("Propiedad ocupada: " + p);

			}

		}

	}

	public void mostrarPorcentajeOcupacion(Zona zona) {
		double cont = 0;

		for (Propiedad p : propiedades) {

			if (p.getZona() == zona && p.getEstaAlquilado() == true) {
				cont++;
			}

		}

		double resultado = (cont * 100) / propiedades.size();
		
		System.out.println("contador es " + cont );
		System.out.println("cantidad propiedades es  " + propiedades.size() );

		System.out.println("Porcentaje de ocupacion: " + resultado + "%.");

	}

	@Override
	public String toString() {
		return "Inmobiliaria [propiedades=" + propiedades + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
