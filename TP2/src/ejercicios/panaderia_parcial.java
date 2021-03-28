package ejercicios;

import java.util.Scanner;

public class panaderia_parcial {

	static Scanner input = new Scanner(System.in);

	// CONSTANTES
	static final String PRODUCTO1 = "medialuna";
	static final String PRODUCTO2 = "alfajor";
	static final String PRODUCTO3 = "chipa";
	static final String PRODUCTO4 = "rosca";

	static final int PRECIOPRODUCTO1 = 30;
	static final int PRECIOPRODUCTO2 = 70;
	static final int PRECIOPRODUCTO3 = 50;
	static final int PRECIOPRODUCTO4 = 350;

	// funcion pedir dni
	public static int pedirDni() {
		int dni;
		System.out.println("Ingrese Dni. Mayor o igual a 0");
		dni = input.nextInt();
		input.nextLine();

		while (dni < 0) {
			System.out.println("Error. Ingrese Dni (mayor o igual a 0)");
			dni = input.nextInt();
			input.nextLine();
		}
		return dni;
	}

	// funcion VOID mostrar productos
	public static void mostrarProductos() {

		System.out.println("Los productos ofrecidos son:");
		System.out.println(PRODUCTO1 + ":  $" + PRECIOPRODUCTO1);
		System.out.println(PRODUCTO2 + ":  $" + PRECIOPRODUCTO2);
		System.out.println(PRODUCTO3 + ":  $" + PRECIOPRODUCTO3);
		System.out.println(PRODUCTO4 + ":  $" + PRECIOPRODUCTO4);

	}

	// funcion pedir nombre producto
	public static String pedirNombre() {
		String nombre = "";
		System.out.println("Ingrese el producto:");
		nombre = input.nextLine();

		while (!nombre.equals(PRODUCTO1)&&!nombre.equals(PRODUCTO2)&& !nombre.equals(PRODUCTO3)&&!nombre.equals(PRODUCTO4)) {
			System.out.println("Nombre incorrecto.Ingrese el producto:");
			nombre = input.nextLine();
		}

		return nombre;
	}

	// funcion pedir cantidad

	public static int pedirCantidad() {

		int cantidad = 0;
		System.out.println("Ingrese cantidad: ");
		cantidad = input.nextInt();
		input.nextLine();

		while (cantidad < 1) {
			System.out.println("Error. Ingrese cantidad: ");
			cantidad = input.nextInt();
			input.nextLine();

		}

		return cantidad;

	}

	// funcion desea continuar

	public static boolean deseaContinuar() {

		boolean continuar = false;
		String letra = "";
		System.out.println("Desea continuar? S/N");
		letra = input.nextLine().toLowerCase();

		while (!letra.equals("s") && !letra.equals("n")) {
			System.out.println("Error de letra. Desea continuar? S/N");
			letra = input.nextLine().toLowerCase();

		}
		
		if(letra.equals("s")) {
			continuar = true; 
		}else {
			continuar = false;
		}

		return continuar;

	}

	
	public static double calcularPrecio(String producto) {
		
		double precio= 0;
		
		//comparo  
		switch (producto) {
		case PRODUCTO1:

			precio = PRECIOPRODUCTO1 ;

			break;

		case PRODUCTO2:

			precio = PRECIOPRODUCTO2 ;

			break;

		case PRODUCTO3:

			precio = PRECIOPRODUCTO3 ;

			break;

		case PRODUCTO4:

			precio = PRECIOPRODUCTO4 ;

			break;

		default:
			break;
		}
		
		return precio;
	}
	
	// MAIN

	public static void main(String[] args) {

		// variables que uso para trabajar
		
		
		double precioUnitario;
		int totalFinal;
		int totalClientes;
		int cont = 0;
		double importeMax = 0;
		int dniMax = 0;
		double precioTotal;
		boolean continuar = false;
		double totalPorCliente = 0;
		double total =0;
		// **INICIO**
		// ingreso

		
		System.out.println("Bienvenido!");

		int dni = pedirDni();
		
		while (dni != 0) {
			totalPorCliente = 0;
			
	
				cont = cont + 1;
			// muestro productos
						mostrarProductos();
			do {
				precioTotal= 0;
				// pido el nombre del producto
				String producto = pedirNombre();

				// pido la cantidad del producto
				int cantidadProducto = pedirCantidad();

	
				//calculo el precio por unidad
				precioUnitario = calcularPrecio(producto);
			    
				// lo multiplico por cant productos
				precioTotal = precioUnitario * cantidadProducto;
				
				totalPorCliente += precioTotal;
				
				// pregunto si quiere continuar
				
				continuar= deseaContinuar();
				
				
			}while(continuar);
			total +=totalPorCliente;

			
			System.out.println("El importe total de la compra es " + totalPorCliente);

			
			//if mejor compra 
			if(totalPorCliente>importeMax) {
				
				importeMax = totalPorCliente;
				dniMax = dni;
			}
			
		

			// reinicio ciclo
			dni = pedirDni();
		}
		
		if(cont != 0) {
		System.out.println("Cantidad de ventas realizadas en el día: "+ cont);
		System.out.println("Recaudación total diaria "+ total);
		System.out.println("Venta promedio: "+ total/cont);
		System.out.println("Importe y Dni cliente mejor compra: "+ importeMax + " - " + dniMax);
		System.out.println("FIN");
		}else {
			System.out.println("No hubo ningún ingreso.");
		}
		input.close();
	}

}
