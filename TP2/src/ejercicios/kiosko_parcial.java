package ejercicios;

import java.util.Scanner;

public class kiosko_parcial {

	static Scanner input = new Scanner(System.in);

	// CONSTANTES
	static final char CODPROD1 = 'G';
	static final char CODPROD2 = 'A';
	static final char CODPROD3 = 'P';
	static final char CODPROD4 = 'F';

	static final String NOMPROD1 = "Gaseosa mini";
	static final String NOMPROD2 = "Alfajor";
	static final String NOMPROD3 = "Pancho";
	static final String NOMPROD4 = "Fin de la venta";

	static final double PRECIOPROD1 = 50;
	static final int PRECIOPROD2 = 80;
	static final int PRECIOPROD3 = 120;

	static final int PORCDESC1 = 5;
	static final int PORCDESC2 = 10;
	static final int PORCDESC3 = 15;

	static final int MINCANTIDAD = 1;
	static final int MAXCANTIDAD = 15;

	// funcion pedir dni
	public static String pedirDni() {
		String dni;
		System.out.println("Ingrese Dni. Nunca debe ser vacio ni medir mas de ocho digitos");
		dni = input.nextLine();

		while (dni.length() > 8 || dni.equals("")) {
			System.out.println("Error. Nunca debe ser vacio ni medir mas de ocho digitos");
			dni = input.nextLine();

		}
		return dni;

	}

	// funcion codigo producto
	public static char ingreseCodigo() {
		char codigo;
		System.out.println("Ingrese código del producto");
		codigo = input.next().toUpperCase().charAt(0);
		input.nextLine();

		while (codigo != CODPROD1 && codigo != CODPROD2 && codigo != CODPROD3 && codigo != CODPROD4) {
			System.out.println("Error. Ingrese un código de producto válido");
			codigo = input.next().toUpperCase().charAt(0);
			input.nextLine();

		}
		return codigo;
	}

	// void mostrar productos
	public static void mostrarProductos() {
		System.out.println("***Producto y precio unitario***");
		System.out.println(CODPROD1 + " - " + NOMPROD1 + " ($" + PRECIOPROD1 + ")");
		System.out.println(CODPROD2 + " - " + NOMPROD2 + " ($" + PRECIOPROD2 + ")");
		System.out.println(CODPROD3 + " - " + NOMPROD3 + " ($" + PRECIOPROD3 + ")");
		System.out.println(CODPROD4 + " - " + NOMPROD4);

	}

	// funcion pedir cantidad
	public static int pedirCantidad() {

		int cantidad = 0;
		System.out.println("Ingrese cantidad: ");
		cantidad = input.nextInt();
		input.nextLine();

		while (cantidad < MINCANTIDAD || cantidad> MAXCANTIDAD) {
			System.out.println("Error. Ingrese cantidad: ");
			cantidad = input.nextInt();
			input.nextLine();

		}

		return cantidad;

	}

	// funcion calcular descuento

	public static double calcularDescuento(int cantidadProd) {

		double descuento = 0;

		if (cantidadProd == 2 || cantidadProd == 3) {
			descuento = PORCDESC1;
		} else if (cantidadProd >= 4 && cantidadProd <= 6) {
			descuento = PORCDESC2;

		} else if (cantidadProd >= 7) {
			descuento = PORCDESC3;

		} else {
			descuento = 0;
		}

		return descuento;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables que uso para trabajar

		int cont = 0;
		double descuento = 0;
		char codProd;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double totalFinal = 0;
		double totalClientes = 0;
		double mayorVenta = 0;
		String dniMayor = "";

		// ciclo principal

		// **INICIO**
		// ingreso

		System.out.println("Bienvenido al kiosko AllDay!");

		String dni = pedirDni();

		while (!dni.equals("0")) {
			cont = cont + 1;

			do {

				// mostrar productos
				mostrarProductos();

				// ingrese código
				codProd = ingreseCodigo();

				if (codProd != CODPROD4) {

					// ingrese cantidad
					int cantidadProd = pedirCantidad();

					descuento = calcularDescuento(cantidadProd);

					switch (codProd) {
					case CODPROD1:

						total1 = PRECIOPROD1 * cantidadProd;
						total1 = total1 - (total1 * (descuento / 100));

						break;

					case CODPROD2:

						total2 = PRECIOPROD2 * cantidadProd;
						total2 = total2 - (total2 * (descuento / 100));

						break;

					case CODPROD3:
						total3 = PRECIOPROD3 * cantidadProd;
						total3 = total3 - (total3 * (descuento / 100));
						break;

					default:
						break;
					}
				}

			} while (codProd != CODPROD4);

			// sumo los importes de todas las golosinas de cada cliente
			totalFinal = total1 + total2 + total3;

			if (totalFinal > mayorVenta) {
				mayorVenta = totalFinal;
				dniMayor = dni;
			}

			// voy guardando el total de cada cliente en un total final de todos los
			// clientes
			totalClientes = totalFinal + totalClientes;

			System.out.println("El importe a pagar por esta venta es:  " + totalFinal);

			// los vuelvo a 0
			total1 = 0;
			total2 = 0;
			total3 = 0;

			// renuevo ciclo
			dni = pedirDni();
		}
		
		if(cont!=0) {
		System.out.println("Cantidad de ventas realizadas en el día: " + cont);
		System.out.println("El dni del cliente que realizó la mayor venta es: " + dniMayor);
		System.out.println("La recaudación total del kiosko es: " + totalClientes);
		}else {
			System.out.println("No hubo ventas");
		}
		
		input.close();
	}

}
