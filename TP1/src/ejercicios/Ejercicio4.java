package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4. Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2.
Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: “La
suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2*/
		
		int num1;
		int num2;
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		num1 = input.nextInt();
		System.out.print("Ingrese otro numero: ");
		num2 = input.nextInt();

		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1+num2));
		
		input.close();		

	}

}
