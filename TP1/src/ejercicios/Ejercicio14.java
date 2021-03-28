package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String operacion = "";
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Especifique la operación (s, r, p y d):");
		operacion= input.nextLine();
		
		System.out.println("Ingrese un numero");
		num1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese otro numero");
		num2 = input.nextInt();
		input.nextLine();
		
		switch(operacion) {
		case "s":  
		System.out.println(num1 + num2);
		break;
					
		case "r":  
		System.out.println(num1 - num2);
		break;
		
		case "p":  
			System.out.println("num1 * num2");
		break;
		
		case "d":  
		System.out.println("num1 / num2");
		break;
		
		}

		input.close();
		
	}

}
