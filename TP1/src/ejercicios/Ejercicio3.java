package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3. Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que
ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo.*/
		String nombre;
		int edad;
		Scanner input;
		input = new Scanner(System.in);
		
		
		
		
		System.out.print("Ingrese su nombre:" );
		nombre = input.nextLine();
		
		System.out.println("Su nombre es " + nombre);

		
		
		/*
		System.out.print("Ingrese su edad:" );
		edad = input.nextInt();
		
		System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
		
*/
		
		
		
		input.close();		

	}

}
