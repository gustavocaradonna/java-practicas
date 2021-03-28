package ej4_nuevo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cine cine = new Cine("ORT Buster");
		
		cine.crearFuncion("1","3");
		cine.crearFuncion("2","3");
		cine.crearFuncion("3","3");

		
		Entrada entrada1 = cine.crearEntrada("1", "3", 4, LetraEnumerada.A);
		Entrada entrada2 = cine.crearEntrada("2", "3", 4, LetraEnumerada.A);
		Entrada entrada3 = cine.crearEntrada("3", "3", 4, LetraEnumerada.A);
		
		System.out.println(entrada1);
		System.out.println(entrada2);
		System.out.println(entrada3);
		
		ArrayList<Entrada> entradasRecibidas = new ArrayList<Entrada>();
		entradasRecibidas.add(entrada1);
		entradasRecibidas.add(entrada2);
		entradasRecibidas.add(entrada3);


		System.out.println(cine.procesarEntradas(entradasRecibidas));
		
		
		System.out.println("ESTADO ENTRADA 1 " + entrada1.getAsiento());
	
		cine.listarRegistro();
		
	}

}
