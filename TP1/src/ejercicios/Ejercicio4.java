package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4. Realiz� un programa que pida al usuario ingresar dos n�meros enteros num1 y num2.
Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: �La
suma entre � + num1 + � y � + num2 + � da como resultado � + num1 + num2*/
		
		
		
		
		int num1;
		int num2;
		int resultado;

		Scanner input;
		Scanner input2;

		input = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		num1 = input.nextInt();
		System.out.print("Ingrese otro numero: ");
		num2 = input.nextInt();

		resultado = num1 + num2; 
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (resultado));
		

		
		
		input.close();		

	}

}
