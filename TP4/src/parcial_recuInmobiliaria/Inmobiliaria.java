package parcial_recuInmobiliaria;

import java.util.ArrayList;

import parcial4_noHayForma.Socio;

public class Inmobiliaria {

	private double porcentajeComisionPorVenta;
	private double porcentajeComisionPorAlquiler;
	private double recaudacionTotal;
	private ArrayList<Propiedad> propiedades;

	public Inmobiliaria(double porcentajeComisionPorVenta, double porcentajeComisionPorAlquiler) {
		this.porcentajeComisionPorVenta = porcentajeComisionPorVenta;
		this.porcentajeComisionPorAlquiler = porcentajeComisionPorAlquiler;
		this.recaudacionTotal = 0;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public boolean agregarPropiedad(String direccion, int cantAmbientes,  double precio,double superficieM2, String tipoOperacion, String barrio) {
		boolean respuesta = false;
		Propiedad propiedad = null;

		propiedad = buscarPropiedad(direccion);

		if (propiedad == null) {
			propiedad = new Propiedad(direccion, cantAmbientes, precio,superficieM2 ,tipoOperacion, barrio);
			propiedades.add(propiedad);
			respuesta = true;
			System.out.println("Se agregó propiedad " + propiedad.dameDireccion());
		}else {
			System.out.println("No se pudo agregar la propiedad con dirección "+propiedad.dameDireccion());
		}
		
		
		
		return respuesta;
	}

	private Propiedad buscarPropiedad(String direccion) {
		Propiedad propiedad = null;
		int i = 0;
		while (i < propiedades.size() && propiedad == null) {

			if (propiedades.get(i).dameDireccion().equals(direccion)) {

				propiedad = propiedades.get(i);
			} else {
				i++;
			}
		}
		return propiedad;
	}

	public void actualizarPrecio(String direccion, double precio) {
		Propiedad propiedad = buscarPropiedad(direccion);
		if (propiedad != null) {
			propiedad.actualizarPrecio(precio);
			System.out.println("Se modificó correctamente el precio de la propiedad");
		} else {
			System.out.println("No se pudo actualizar el precio de esa dirección");
		}
	}

	public void listarPropiedadesPorTipo(String tipoOperacion) {

		for (Propiedad propiedad : propiedades) {
			if (propiedad.dametipoOperacion() == tipoOperacion) {
				System.out.println(propiedad);
			}
		}

	}

	public void realizarOperacion(String tipoOperacion, String direccion) {
		Propiedad propiedad = buscarPropiedad(direccion);
		if (propiedad != null && propiedad.dametipoOperacion().equals(tipoOperacion) ) {
			propiedades.remove(propiedad);
			if (tipoOperacion.equals("Alquiler")) {
			this.recaudacionTotal += (this.porcentajeComisionPorAlquiler * propiedad.damePrecio() )/100;

			} else if (tipoOperacion.equals("Venta")) {
				this.recaudacionTotal += (this.porcentajeComisionPorVenta * propiedad.damePrecio() )/100;

			}

		} else {

			System.out.println("No existe la propiedad para el tipo de operacion indicado");
		}

	}

	public double obtenerPromedioPorBarrio(String barrio) {
		double sumaImportes = 0;
		int cont = 0;
		for (Propiedad propiedad : propiedades) {
			if (propiedad.dameBarrio().equals(barrio)) {
				cont++;
				sumaImportes += propiedad.damePrecio();
			}
		}
		
		return sumaImportes/cont;
	}

	
	public double obtenerRecaudacion() {
		return this.recaudacionTotal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
