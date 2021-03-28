package ejercicios;

import java.util.Scanner;

public class Seguros_parcial {
	static Scanner input = new Scanner(System.in);

	// CONSTANTES
	static final int BASEVEHICULOS = 2;
	static final int TOPEVEHICULOS = 10;

	static final int BASEANTIGUEDAD = 0;
	static final int TOPEANTIGUEDAD = 30;

	static final char VEHICULO1 = 'A';
	static final char VEHICULO2 = 'C';
	static final char VEHICULO3 = 'M';

	static final double COSTOAUTO = 1000;
	static final double COSTOCAMIONETA = 1500;
	static final double COSTOMOTO = 800;

	static final double AUMENTOXAÑO = 5;

	static final String MENSAJE1 = "Ingrese la cantidad de vehiculos a ingresar (entre " + BASEVEHICULOS + " y "
			+ TOPEVEHICULOS + ").";
	static final String MENSAJE2 = "Ingrese antiguedad del vehiculo (entre " + BASEANTIGUEDAD + " y " + TOPEANTIGUEDAD
			+ ").";

	// funcion pedir nombre
	public static String pedirNombre() {
		String nombre = "";
		System.out.println("Ingrese nombre de su empresa: ");
		nombre = input.nextLine();

		return nombre;
	}

	// funcion pedir cantidad vehiculos
	public static int pedirCantidad(int base, int tope, String mensaje) {

		int cantidad = 0;

		do {

			System.out.println(mensaje);
			cantidad = input.nextInt();
			input.nextLine();

		} while (cantidad < base || cantidad > tope);

		return cantidad;

	}

	// funcion codigo auto
	public static char ingreseCodigo() {
		char codigo;
		System.out.println("Ingrese código del producto");
		codigo = input.next().toUpperCase().charAt(0);
		input.nextLine();

		while (codigo != VEHICULO1 && codigo != VEHICULO2 && codigo != VEHICULO3) {
			System.out.println("Error. Ingrese un código de producto válido");
			codigo = input.next().toUpperCase().charAt(0);
			input.nextLine();

		}
		return codigo;
	}

	// funcion incremento

	public static double calcularAumento(double antiguedad) {
		double aumento = 0;

		aumento = (antiguedad * (AUMENTOXAÑO / 100));

		System.out.println("El aumento para ese vehiculo será " + aumento*100 + "%.");
		System.out.println("La antiguedad hasta ahora es " + antiguedad);

		return aumento;
	}

	// MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables que uso para trabajar
		double cont = 0;
		double contCamionetas = 0;
		double total = 0;
		int max5Vehiculos = 0;
	//	double porcCamionetas = 0;
		int promAños = 0;
		double masCostoso = 0;
		double totalVehiculo = 0;
		double antiguedad = 0;
		double totalAntiguedad = 0;
		char tipoMasCostoso = ' ';
		double masAntiguo = 0;
		double aumento = 0;

		// pido nombre empresa
		String nombre = pedirNombre();

		// pido cantidad de vehiculos a ingresar
		int cantidad = pedirCantidad(BASEVEHICULOS, TOPEVEHICULOS, MENSAJE1);

		// INICIO CICLO
		for (int i = 0; i < cantidad; i++) {
			totalVehiculo = 0;
			aumento = 0;
			cont += 1;

			antiguedad = pedirCantidad(BASEANTIGUEDAD, TOPEANTIGUEDAD, MENSAJE2);

			char codigo = ingreseCodigo();

			if (antiguedad != 0) {

				aumento = calcularAumento(antiguedad);
			}

			switch (codigo) {
			case VEHICULO1:
				totalVehiculo = COSTOAUTO ;
				break;

			case VEHICULO2:
				totalVehiculo = COSTOCAMIONETA ;

				break;

			case VEHICULO3:
				totalVehiculo = COSTOMOTO ;

				break;

			default:
				break;
			}

			 totalVehiculo *= (1 + aumento) ;

			// C
			if (antiguedad > 5) {
				max5Vehiculos += 1;
			}

			if (codigo == VEHICULO2) {
				contCamionetas += 1;
			}

			totalAntiguedad += antiguedad;

			System.out.println("El total del vehiculo es " + totalVehiculo);
			total += totalVehiculo;

			if (totalVehiculo > masCostoso) {
				masCostoso = totalVehiculo;
				tipoMasCostoso = codigo;
				masAntiguo = antiguedad;
			}
		}
		
		 promAños = (int) (totalAntiguedad / cont);

		// salida

		// A)nombre de la empresa OK
		System.out.println("Nombre de la empresa " + nombre);

		// B)costo mensual por pagar OK
		System.out.println("El total es " + total);

		// C)cantidad de vehiculos con mas de 5 años de antiguedad OK
		System.out.println("cantidad de vehiculos con mas de 5 años de antiguedad " + max5Vehiculos);

		// D) porcentaje de camionetas OK
		System.out.println("porcentaje de camionetas: " + (contCamionetas / cont) * 100 + "%.");

		// E) promedio antiguedad OK
		System.out.println("El promedio de antiguedad de todos es " + promAños);

		// F) vehiculos mas costoso , costo , tipo , años.
		System.out.println("El mas costoso cuesta " + masCostoso + ". Su modelo es " + tipoMasCostoso
				+ " y su antiguedad es " + masAntiguo + " años.");

		input.close();
	}

}
