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
		 * 8. Escrib� la funci�n booleana esMultiplo(int num1, int num2) que recibir� dos enteros y devolver�
verdadero cuando el primero sea m�ltiplo de segundo (de lo contrario, devolver� falso). Para saber si
un n�mero es m�ltiplo de otro utiliz� el operador % (m�dulo), que devuelve el resto de la divisi�n. Prob�
la funci�n desde el main con los lotes de datos (5, 3) y (15, 3).

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
