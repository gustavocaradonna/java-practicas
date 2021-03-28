package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	private static Scanner input = new Scanner(System.in);

	// static
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7. Realizá un programa que al ingresar por teclado tres números enteros num1,
		 * num2 y num3, muestre el valor del mayor de todos. En caso de igualdad entre
		 * los tres imprimir "Los números son iguales". Test1: num1 = 12, num2 = 4,
		 * num3= 7. Resultado esperado: El mayor número es num1 Test2: num1 = 2, num2 =
		 * 65, num3= 8. Resultado esperado: El mayor número es num2 Test3: num1 = 3,
		 * num2 = 10, num3= 28. Resultado esperado: El mayor número es num3 Test4: num1
		 * = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales
		 */

		int num1;
		int num2;
		int num3;
		System.out.println("ingrese primer numero:");
		num1 = input.nextInt();
		System.out.println("ingrese segundo numero:");
		num2 = input.nextInt();
		System.out.println("ingrese tercer numero:");
		num3 = input.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("numero uno es mayor");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El numero 2 es el mayor");
		} else if (num1 == num2 && num2 == num3) {
			System.out.println("Son iguales!!");
		}
		else {
			System.out.println("El numero 3 es el mayor");
		}

		input.close();

	}

}
