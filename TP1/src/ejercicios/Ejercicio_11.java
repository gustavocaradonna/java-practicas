package ejercicios;
import java.util.Scanner;

public class Ejercicio_11 {
	
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int fechaCompra;
		String nombre;
		String nombreProducto;
		int cantidadProducto;
		int precioProducto;
		
		System.out.println("ingrese fecha de compra (YYYYMMDD)");
		fechaCompra = input.nextInt();
		input.nextLine();
		
		System.out.println("ingrese nombre");
		nombre = input.nextLine();
		
		System.out.println("ingrese nombre de su producto");
		nombreProducto = input.nextLine();
		
		System.out.println("ingrese cantidad de producto");
		cantidadProducto = input.nextInt();
		input.nextLine();

	
		System.out.println("ingrese precio de producto");
		precioProducto = input.nextInt();
		input.nextLine();
		
		
		input.close();
		
		
		System.out.println("Fecha de compra " + fechaCompra);
		System.out.println("Nombre de comprador " + nombre);
		System.out.println("Producto solicitado " + nombreProducto);
		System.out.println("Cantidad solicitada " + cantidadProducto);
		System.out.println("Precio unitario " + precioProducto);
		System.out.println("Total a pagar " + (precioProducto * cantidadProducto));

		
		
	}

}
