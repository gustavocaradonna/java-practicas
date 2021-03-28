package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class casino_parcial {

	// constantes
	static final String MENSAJE1 = "Cual es su nombre?";
	static final String MENSAJE2 = "A que juego desea jugar? (rul, black o pok).";
	static final String MENSAJE3 = "Error. Elija un juego (rul, black o pok).";
	static final String BLACKJACK = "black";
	static final String RULETA = "rul";
	static final String POKER = "pok";

	static final int TOPEGANANCIA = 5000;

	static final int costoRuleta = 100;
	static final int costoBlackJack = 200;
	static final int costoPoker = 500;

	static Scanner input = new Scanner(System.in);

	// funcion pedir nombre

	public static String ingreso(String mens) {
		String nombre = "";
		System.out.println(mens);
		nombre = input.nextLine();

		return nombre;

	}

	// funcion pedir cantidad para jugar

	public static int ingreseCantidad() {
		int plata = 0;
		System.out.println("Ingrese Dinero para jugar (mayor a 500)");
		plata = input.nextInt();
		input.nextLine();

		while (plata < 500) {
			System.out.println("Error. Ingrese Dinero para jugar (mayor a 500)");
			plata = input.nextInt();
			input.nextLine();

		}

		return plata;

	}
	// funcion para ver que juega

	public static String elijaJuego(String mensaje2, String mensaje3) {
		String juego = "";

		System.out.println(mensaje2);
		juego = input.nextLine().toLowerCase();

		while (!juego.equals("rul") && !juego.equals("black") && !juego.equals("pok")) {

			System.out.println(mensaje3);
			juego = input.nextLine().toLowerCase();

		}
		return juego;
	}

	// funcion aleatorio
	public static int obtenerResultado() {
		Random rn = new Random();
		return rn.nextInt(3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreCliente = ingreso(MENSAJE1);

		int dineroInicial = ingreseCantidad();
		int dineroParcial = dineroInicial;
		int aleatorio = 0;
		double contRul = 0;
		double contBlack = 0;
		double contPoker = 0;

		do {

			// inicio

			String juego = elijaJuego(MENSAJE2, MENSAJE3);
			System.out.println("juego elegido " + juego);
			switch (juego) {

			case RULETA:
				contRul = contRul + 1;

				System.out.println("Dinero parcial es " + dineroParcial + " y costo ruleta es :" + costoRuleta);
				if (dineroParcial < costoRuleta) {
					System.out.println("No le alcanza el dinero para este juego");
				} else {

					dineroParcial = dineroParcial - costoRuleta;
					System.out.println("Dinero parcial menos costo de ruleta es " + dineroParcial);
					aleatorio = obtenerResultado();

					System.out.println("El numero aleatorio fué " + aleatorio);
				}

				if (aleatorio == 2) {
					dineroParcial = dineroParcial + (costoRuleta * 2);
					System.out.println("Como fue 2 , su dinero parcial es " + dineroParcial);
				} else if (aleatorio == 1) {
					dineroParcial = dineroParcial + costoRuleta;
					System.out.println("Como fue 1 , su dinero parcial es " + dineroParcial);

				}

				break;

			case BLACKJACK:
				contBlack = contBlack + 1;
				if (dineroParcial < costoBlackJack) {
					System.out.println("No le alcanza el dinero para este juego");
				} else {

					dineroParcial = dineroParcial - costoBlackJack;
					System.out.println("Dinero parcial menos costo de blackjack es " + dineroParcial);
					aleatorio = obtenerResultado();

					System.out.println("El numero aleatorio fué " + aleatorio);
				}

				if (aleatorio == 2) {
					dineroParcial = dineroParcial + (costoBlackJack * 2);
					System.out.println("Como fue 2 , su dinero parcial es " + dineroParcial);
				} else if (aleatorio == 1) {
					dineroParcial = dineroParcial + costoBlackJack;
					System.out.println("Como fue 1 , su dinero parcial es " + dineroParcial);

				}

				break;

			case POKER:
				contPoker = contPoker + 1;
				if (dineroParcial < costoPoker) {
					System.out.println("No le alcanza el dinero para este juego");
				} else {

					dineroParcial = dineroParcial - costoPoker;
					System.out.println("Dinero parcial menos costo de poker es " + dineroParcial);
					aleatorio = obtenerResultado();

					System.out.println("El numero aleatorio fué " + aleatorio);
				}

				if (aleatorio == 2) {
					dineroParcial = dineroParcial + (costoPoker * 2);
					System.out.println("Como fue 2 , su dinero parcial es " + dineroParcial);
				} else if (aleatorio == 1) {
					dineroParcial = dineroParcial + costoPoker;
					System.out.println("Como fue 1 , su dinero parcial es " + dineroParcial);

				}

				break;

			default:
				break;
			}

			System.out.println("CANTIDAD DINERO ACTUAL " + dineroParcial);

		} while (dineroParcial > (dineroInicial * 0.2) && dineroParcial > costoRuleta
				&& dineroParcial < (dineroInicial + TOPEGANANCIA));

		// obtener resultado
		// System.out.println(obtenerResultado());

		System.out.println("Nombre de jugador: " + nombreCliente);
		System.out.println("Dinero restante: " + dineroParcial);
		System.out.println("Al poker jugó " + contPoker + " veces " + "Lo que representa "
				+ ((contPoker / (contPoker + contRul + contBlack)) * 100) + "%.");

		input.close();

	}

}
