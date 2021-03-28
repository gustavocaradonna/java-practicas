package test;

import java.util.ArrayList;

public class Consejo {

	private String nombre;
	private int cantidadMiembros;
	private ArrayList<Miembro> miembros;

	public Consejo(String nombre, int cantidadMiembros) {

		this.nombre = nombre;
		this.cantidadMiembros = cantidadMiembros;
		this.miembros = new ArrayList<>();
	}

	public String agregarVotante(String nombre, String dni) {

		String mensaje = "";
		if (this.cantidadMiembros <= miembros.size()) {
			mensaje= "El recinto se encuentra completo";
		} else {

			if (this.buscarPorDni(dni) == null) {
				mensaje= "Se agrego correctamente al votante";

				miembros.add(new Miembro(dni, nombre));
			} else {
				mensaje= "Ya existia el votante en la lista";

			}

		}
		return mensaje;
	}

	private Miembro buscarPorDni(String dniRecibido) {

		int i = 0;
		Miembro miMiembro = null;

		while (i < miembros.size() && miMiembro == null) {

			if (this.miembros.get(i).getDni() == dniRecibido) {
				miMiembro = miembros.get(i);
			} else {

				i++;
			}
		}
		return miMiembro;
	}

	public void votar(String nombre, String dni, ValorVoto voto) {

		Miembro miMiembro = this.buscarPorDni(dni);
		if (miMiembro == null) {
			System.out.println("No existe el votante en este recinto");
		} else {
			if (miMiembro.getVoto() == null) {
				miMiembro.setVoto(voto);
				System.out.println("Se actualizo correctamente el voto");
			} else {
				System.out.println("Ya habia efectuado su voto");
			}

		}

	}

	public void resultadoVotacion() {
		double contPositivo = 0;
		double contNegativo = 0;
		double contAbstencion = 0;
		double total = 0;
		double nulos = 0;
		for (Miembro miembro : miembros) {

			if (miembro.getVoto() == null) {
				nulos++;
			} else {

				switch (miembro.getVoto()) {
				case POSITIVO:
					contPositivo++;

					break;

				case NEGATIVO:
					contNegativo++;

					break;

				case ABSTENCION:
					contAbstencion++;

					break;

				default:
					break;
				}
			}

			total++;
		}
		System.out.println("Los votos positivos fueron " + contPositivo);

		System.out.println("porcentaje positivos " + (contPositivo / total) * 100 + "%");

		System.out.println("Los votos negativos fueron " + contNegativo);

		System.out.println("porcentaje negativos " + (contNegativo / total) * 100 + "%");

		System.out.println("Las abstenciones fueron " + contAbstencion);

		System.out.println("Porcentaje abstenciones " + (contAbstencion / total) * 100 + "%");

		System.out.println("Los que no votaron fueron  " + nulos);

		System.out.println("Porcentaje sin votos " + (nulos / total) * 100 + "%");

		
		}


	@Override
	public String toString() {
		return "Consejo [nombre=" + nombre + ", miembros=" + miembros + "]";
	}

}
