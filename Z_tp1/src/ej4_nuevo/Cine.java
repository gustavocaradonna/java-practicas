package ej4_nuevo;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	private ArrayList<Funcion> funciones;
//	private ArrayList<Entrada> entradas;
	private ArrayList<Registro> registroDeEntradas;

	public Cine(String nombre) {

		this.nombre = nombre;
		this.funciones = new ArrayList<>();
		// this.entradas = new ArrayList<>();
		this.registroDeEntradas = new ArrayList<>();
	}

	public void crearFuncion(String dia, String hora) {

		Funcion funcion = new Funcion(dia, hora);
		this.funciones.add(funcion);
		System.out.println("Funcion creada");

	}

	public Entrada crearEntrada(String dia, String hora, int fila, LetraEnumerada letra) {

		Funcion miFuncion = this.existeFuncion(dia, hora);
		Entrada miEntrada = null;

		if (miFuncion != null) {

			miEntrada = miFuncion.crearEntrada(dia, hora, fila, letra);

			Registro registro = new Registro(miEntrada);
			registroDeEntradas.add(registro);
		}

		return miEntrada;

	}

	public boolean procesarEntradas(ArrayList<Entrada> entradasRecibidas) {
		boolean resultado = true;
		int i = 0;

		while (resultado == true && i < entradasRecibidas.size()) {

			if (entradasRecibidas.get(i) == null) {
				resultado = false;
			} else {

				Funcion miFuncion = existeFuncion(entradasRecibidas.get(i).getDia(),
						entradasRecibidas.get(i).getHora());
				if (miFuncion == null) {
					resultado = false;
				} else {
					i++;
				}

			}

		}

		if (resultado) {
			
			
			for (Entrada entrada : entradasRecibidas) {
				entrada.getAsiento().setEstado(Estado.CUMPLIDO);
			}
		}

		return resultado;
	}

	private Funcion existeFuncion(String dia, String horaDeInicio) {
		Funcion miFuncion = null;
		Funcion unaFuncionDeLaLista = null;
		int i = 0;
		
		while (miFuncion == null && i < funciones.size()) {
			
			unaFuncionDeLaLista = funciones.get(i);
			
			if (unaFuncionDeLaLista.getDia().equals(dia) && unaFuncionDeLaLista.getHoraDeInicio().equals(horaDeInicio)) {
				miFuncion = unaFuncionDeLaLista;
			} else {
				i++;
			}
		}

		return miFuncion;
	}

	/*
	 * private Entrada buscarEntrada(String dia, String hora, int fila,
	 * LetraEnumerada letra) {
	 * 
	 * int i = 0; Entrada miEntrada = null; while (i < entradas.size() && miEntrada
	 * == null) { if (entradas.get(i).getDia().equals(dia) &&
	 * entradas.get(i).getHora().equals(hora) && entradas.get(i).getFila() == fila
	 * && entradas.get(i).getLetra() == letra) { miEntrada = entradas.get(i); } else
	 * { i++; } } return miEntrada; }
	 */

	public void listarRegistro() {
		for (Registro registro : registroDeEntradas) {
			System.out.println(registro);
		}
	}

}
