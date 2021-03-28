package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*5. Realizá un programa que, dados dos números enteros num1 y num2 cargados desde
teclado por el usuario, muestre el resultado de la división del primero por el segundo
siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
“No se puede dividir por cero”.*/
		
		Scanner input;
		int num1;
		int num2;
		int resultado;
		
		input = new Scanner(System.in);
		
		System.out.println("ingrese un numero");
		num1 = input.nextInt();
		System.out.println("ingrese otro numero");
		num2 = input.nextInt();
		
	
		if(num2 != 0) {
			System.out.println("El resultado de "+ num1 + " / " + num2 + " es " + (num1/num2));
		}else {
			System.out.println("error");
		}
		input.close();		
	}

}
