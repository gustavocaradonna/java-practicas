package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6. Realiz� un programa que solicite al usuario el ingreso por teclado un valor entero mayor
que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
n�mero es par" o "el n�mero es impar". Deber� utilizar el operador �m�dulo� es el caracter
%.
*/
		Scanner input;
		input = new Scanner(System.in);
		int num1;
		
		System.out.println("Ingrese un valor entero mayor a 0: ");
		num1 = input.nextInt();
		//input.nextline();
		
		
		if(num1 % 2 == 0) {
			
			System.out.println("Es par");

		} else {
			System.out.println("Es impar");

		}
		
		
		
		
		input.close();
	}

}
