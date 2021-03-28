package ejercicios;

import java.util.Scanner;

public class Ej_8 {

	public static boolean esMultiplo(int p1, int p2) {
		
		boolean algo = (p1 % p2 == 0);
		return algo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 8. Escribí la función booleana esMultiplo(int num1, int num2) que recibirá dos enteros y devolverá
verdadero cuando el primero sea múltiplo de segundo (de lo contrario, devolverá falso). Para saber si
un número es múltiplo de otro utilizá el operador % (módulo), que devuelve el resto de la división. Probá
la función desde el main con los lotes de datos (5, 3) y (15, 3).

		 */
		Scanner input = new Scanner(System.in);

		
		
		//Ejemplo de 
		
		
		int num1 =0;
		int num2 =0;
		boolean num3;
		
		System.out.println("ingrese un numero");
		num1 = input.nextInt();

		System.out.println("ingrese otro numero");
		num2 = input.nextInt();
		
		num3 = esMultiplo(num1 , num2);
		
		System.out.println(num3);

		if(num3) {
			System.out.println("Es Verdadero");
		}else {
			System.out.println("Es Falso");
			
		}
		

		input.close();
		

	}

}
