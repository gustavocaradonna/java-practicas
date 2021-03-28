package parcial4_noHayForma;

import java.util.ArrayList;

import parcial3_gestionDePedidos.Pedido;

public class Gimnasio {

	private String nombre;
	public int cantidadSocios;
	private ArrayList<Socio> socios;
	private ArrayList<Socio> morosos;


	public Gimnasio(String nombre, int cantidadSocios) {

		this.nombre = nombre;
		this.cantidadSocios = cantidadSocios;
		this.socios = new ArrayList<Socio>();
		this.morosos = new ArrayList<Socio>();

	}

	public void inscribirSocio(int dni, String nombre, int categoria, double deuda) {
		Socio socio = buscarSocio(dni);

		if (socio == null) {
			System.out.println("Socio agregado con �xito");
			socio = new Socio(dni, nombre, categoria, deuda);
			socios.add(socio);
			agregarSocio();

		} else {
			System.out.println("Socio ya existe");
		}

	}

	public void quitarSocio(int dni) {
		Socio socio = buscarSocio(dni);

		if (socio != null && socio.dameDeuda() <= 0) {

			System.out.println("socio dado de baja");
			socios.remove(socio);
			restarSocio();

		} else {
			System.out.println("el socio tiene deuda o no existe. No puede borrarlo");
		}

	}

	private Socio buscarSocio(int dni) {
		Socio miSocio = null;
		int i = 0;
		while (i < socios.size() && miSocio == null) {

			if (socios.get(i).dameDni() == dni) {

				miSocio = socios.get(i);
			} else {
				i++;
			}
		}
		return miSocio;
	}

	private void agregarSocio() {
		this.cantidadSocios += 1;
	}

	private void restarSocio() {
		this.cantidadSocios -= 1;
	}

	
	public void listarSocios() {
		
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
	
public void listarMorosos () {
		
		for (Socio moroso : morosos) {
			System.out.println(moroso);
		}
	}
	
	
	
	public void listarDeudoresCategoria(int categoria , double montoRecibido) {
		for (Socio socio : socios) {
			if(socio.dameDeuda() > montoRecibido) {
				System.out.println(socio);
			}
			
		}
	}
	
	public void ponerMoroso(int dni) {
		
		
		Socio socio = buscarSocio(dni);

		if (socio != null && socio.dameDeuda() > 0) {

			socio.cambiarEstado("M");
		//	System.out.println("Estado cambiado con �xito");
			
			socios.remove(socio);
			morosos.add(socio);
			
			

		} else {
			System.out.println("El socio no existe o no tiene deuda");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
