package ejercicios;

import java.util.Scanner;

public class P1Kiosko {

	public static String ingreseDni(String mensaje) {
		String dni;
		System.out.println(mensaje);
		dni = input.nextLine();
		
		while (dni.length() < DESDE || dni.length() > HASTA || dni.equals("") || Integer.parseInt(dni) < 0) {
			System.out.println("Ingreso erroneo.");
			System.out.println(mensaje);
			dni = input.nextLine();
			
		}
		return dni;
	}
	
	public static void mostrarProductos() {
		System.out.println("*** Producto y precio unitario *** "
								+ " G - Gaseosa mini ($50)"
								+ " A - Alfajor ($80)"
								+ " P - Pancho ($120)"
								+ " F - Fin");
									
	}
	public static String ingreseProducto(String mensaje, String prod1, String prod2, String prod3, String fin) {
		String producto = null;
		System.out.println(mensaje);
		producto = input.nextLine().toLowerCase();
		while (!producto.equals(prod1) && !producto.equals(prod2) && !producto.equals(prod3) && !producto.equals(fin)) {
			System.out.println("Ingrese un producto válido");
			System.out.println(mensaje);
			producto = input.nextLine().toLowerCase();
		}
		return producto;
	}
	
	public static int ingreseCantidad() {
		int cantidad = 0;
		System.out.println("Ingrese la cantidad que desea comprar: ");
		cantidad = Integer.parseInt(input.nextLine());
		
		while (cantidad <= DESDE || cantidad > MAXIMO) {
			System.out.println("La cantidad del producto debe ser mayor a " + DESDE + " y menor a " + MAXIMO);
			System.out.println("Ingrese la cantidad que desea comprar: ");
			cantidad = Integer.parseInt(input.nextLine());
		}
		return cantidad;
	}
	public static boolean debeSalir (String dni) {
		boolean fin = false;
		if (Integer.parseInt(dni) == 0) {
			fin = true;
		}
		return fin;
	}
	
	public static double descuentoPorcentaje(int cantidad, double precio, double total) {
		
		double porcentaje = 0;
		total = precio * cantidad;
		if (cantidad > 0 && cantidad < 2) {
			porcentaje = precio * cantidad;
		}
		else if (cantidad >= 2 && cantidad < 4) {
			porcentaje = total - (total * 0.05);
		}
		else if (cantidad >= 4 && cantidad <= 6) {
			porcentaje = total - (total * 0.10);
		}
		else if (cantidad >= 7 && cantidad < 16) {
			porcentaje = total - (total * 0.15);
		}
		return porcentaje;
	}
	
	final static double PRECIO_GASEOSA = 50;
	final static double PRECIO_ALFAJOR = 80;
	final static double PRECIO_PANCHO = 120;
	static final int DESDE = 0;
	static final int HASTA = 8;
	static final int MAXIMO = 15;
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int cantidad = 0;
		String dni = ingreseDni("Bienvenido/a al Kiosko All Day!. Ingrese su DNI, para finalizar ingrese 0");
		String dniMax = null;
		double total = 0;
		double descuento = 0;
		int cantidadDeVentas = 0;
		double ventaMax = 0;
		double totalDiario = 0;
		
		
		if (Integer.parseInt(dni) == 0) {
			System.out.println("Hasta luego!");
		}
		else {
		
		do {
			mostrarProductos();
			String producto = ingreseProducto("Ingrese el código del producto:", "g", "a", "p", "f");
			
			switch (producto) {
				case "g":
					cantidad = ingreseCantidad();
					total += descuentoPorcentaje(cantidad, PRECIO_GASEOSA, total);
					
					break;
					
				case "a":
					cantidad = ingreseCantidad();
					total += descuentoPorcentaje(cantidad, PRECIO_ALFAJOR, total);
					break;
					
				case "p":
					cantidad = ingreseCantidad();
					total += descuentoPorcentaje(cantidad, PRECIO_PANCHO, total);
					break;
			}
					
			if (producto.equals("f")) {
				System.out.println("El total de su compra es de $" +total);	
				dni = ingreseDni("Bienvenido/a al Kiosko All Day!. Ingrese su DNI, para finalizar ingrese 0");
				total = 0;
				cantidadDeVentas++;
			}
			totalDiario += total;
			if (total > ventaMax) {
				ventaMax = total;
				dniMax = dni;
			}
		
			
		} while (!debeSalir(dni));
		
		if (cantidadDeVentas > 0) {
			System.out.println("Cantidad de ventas realizadas en un día: " +cantidadDeVentas);
			System.out.println("DNI del comprador que hizo la mayor venta: " +dniMax);
			System.out.println("Recaudación total del día: $" +totalDiario);
		}
		
	
		

	}

}
}
