package ejercicios;

import java.util.Scanner;

public class Ej_15 {
	static Scanner input = new Scanner(System.in);
	// CONSTANTES
	static final int CODBASE = 10001;
	static final int CODTOPE = 99999;
	static final int CORTE = 0;
	static final double ABONOA = 2;
	static final double ABONOB = 2;
	static final double ABONOBADICIONAL = 1.5;
	static final double ABONOC = 1;

	// funciones
	public static int ingreseCodigo() {
		int codigo = 0;

		System.out.println("Ingrese Código, (int de 5 dígitos, entre 10001 y 99999, 0 = fin) ");
		codigo = input.nextInt();
		input.nextLine();

		while ((codigo < CODBASE || codigo > CODTOPE) && codigo != CORTE) {

			System.out.println("Error, ingrese Código, (int de 5 dígitos, entre 10001 y 99999, 0 = fin) ");
			codigo = input.nextInt();
			input.nextLine();

		}

		return codigo;
	}

	public static int duracionLlamada() {

		int llamada = 0;

		System.out.println("Ingrese duración de llamada (numero mayor a 0) ");
		llamada = input.nextInt();
		input.nextLine();

		while (llamada < 1) {

			System.out.println("Error. Ingrese duración de llamada (numero mayor a 0) ");
			llamada = input.nextInt();
			input.nextLine();

		}
		return llamada;
	}

	public static char ingreseAbono() {

		char abono;

		System.out.println("Ingrese abono (a,b,c) ");
		abono = input.next().toLowerCase().charAt(0);
		input.nextLine();

		while (abono != 'a' && abono != 'b' && abono != 'c') {

			System.out.println("Error. Ingrese abono (a,b,c) ");
			abono = input.next().toLowerCase().charAt(0);
			input.nextLine();

		}
		return abono;
	}

	
	// main
	public static void main(String[] args) {

		double totalA = 0;
		double totalB = 0;
		double totalC = 0;
		double diferencia = 0;
		int duracionMax = 0;
		int duracionMenorA6 = 0;
		int cont = 0;
		double totalDeTodos = 0;
		double totalFinalA = 0;
		double totalFinalB = 0;
		double totalFinalC = 0;

		
		int codigo = ingreseCodigo();

		
		while (codigo != 0) {

			int llamada = duracionLlamada();

			char abono = ingreseAbono();

			switch (abono) {
			case 'a':

				totalA = (ABONOA * llamada);
				totalFinalA = totalA + totalFinalA;

				break;

			case 'b':

				if (llamada < 5) {
					totalB = (ABONOB * llamada);
					totalFinalB = totalB + totalFinalB;

				} else {
					diferencia = llamada - 5;
					totalB = (ABONOB * 5) + (ABONOBADICIONAL * diferencia);
					totalFinalB = totalB + totalFinalB;

				}

				break;

			case 'c':
				if (llamada > 10) {
					totalC = (ABONOC * 10);
					totalFinalC = totalC + totalFinalC;

				} else {
					totalC = (ABONOC * llamada);
					totalFinalC = totalC + totalFinalC;

				}

				break;

			default:
				break;
				
			}
			
				
			if (duracionMax < llamada) {
				duracionMax = llamada;
			}

			if (llamada < 6) {
				duracionMenorA6 = duracionMenorA6 + 1;
			}

			cont = cont + 1;
			totalDeTodos = totalDeTodos + (totalA + totalB + totalC) ;

			// renueva ciclo
			codigo = ingreseCodigo();

		}
		
		//FIN

		totalDeTodos = totalDeTodos / cont;

		// mostrarTotales
		if (cont == 0) {
			System.out.println("No ha ingresado ningun codigo");	
			
			}else {
		// A)
		System.out.println("El total A es " + totalFinalA);
		System.out.println("El total B es " + totalFinalB);
		System.out.println("El total C es " + totalFinalC);

		// B)
		System.out.println("La llamada mas larga fue de " + duracionMax);

		// C)
		System.out.println("Llamadas menores a 6 minutos: " + duracionMenorA6);

		// D)
		System.out.println("El precio promedio de llamadas es " + totalDeTodos + "$.");
		
		
			}
	}

}
