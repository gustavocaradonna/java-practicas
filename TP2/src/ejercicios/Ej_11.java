package ejercicios;

import java.util.Scanner;

public class Ej_11 {

	static Scanner input = new Scanner(System.in);

	public static int ingreseNumero() {

		int numero = 0;

		do {
			System.out.println("Ingrese número");
			numero = input.nextInt();

		}while(numero < 1);

		return numero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 11. Realizá un programa que al ingresar dos números enteros positivos
		 * llamados A y B se calcule el producto de éstos a través de sumas sucesivas.
		 * Por ejemplo, si los números son 4 y 2, hacer 4 + 4; si son 5 y 3, hacer 5 + 5
		 * + 5. ¿Qué pasa si la diferencia entre los dos números es muy grande? ¿Influye
		 * cuál se usa para sumar y cuál para contar la cantidad de sumas hechas?
		 */

		// definir variables
		int numA = 0;
		int numB = 1;
		int total = 0;

		numA = ingreseNumero();
		numB = ingreseNumero();

		for (int i = 0; i < numB; i++) {

			total = total + numA;

		}

		System.out.println(total);

		input.close();
	}
}
