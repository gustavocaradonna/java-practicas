package ejercicios;

import java.util.Scanner;

public class ej_12 {
		static Scanner input = new Scanner(System.in);
		
		static int ingreseNumero(){
		
			int num = 0 ;
		
		do {
			System.out.println("Ingrese un numero");
			num = input.nextInt();
			input.nextLine();
		}while(num<0);
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*12. Realizar un programa en el cual se pida el ingreso de dos n�meros enteros num1 y num2 y el signo
de la operaci�n (�+� para sumar, �-� para restar, �/� para dividir, �*� para multiplicar y �%� para obtener el
resto o m�dulo). Mientras que la operaci�n no sea �f� (de �fin�) aplicar la operaci�n elegida a n1 y n2.
Tener en cuenta que la divisi�n por 0 es imposible. Realizar una funci�n para cada operaci�n, que
reciba por par�metros n1 y n2, y retorne el resultado de hacer la operaci�n entre los dos n�meros.*/
		
		int num1 ;
		int num2 ;
		char signo;
		int total = 0;
		
		num1= ingreseNumero();
		num2= ingreseNumero();
		
		System.out.println("Ingrese signo ");
		signo = input.next().charAt(0);
						
		
		/*
		if(signo== '-') {
			total = num1+num2 ;
			System.out.println( "num1 es : "+ num1 +" y num2 es : " + num2 );
		}
		System.out.println(total);
*/
		
		
		switch (signo) {
		case '+':
			total = num1+num2;
			System.out.println("Su resultado es " + total);

			break;

		case '-':
			total = num1-num2;
			System.out.println("Su resultado es " + total);

			break;
			
		case '*':
			total = num1*num2;
			System.out.println("Su resultado es " + total);

			break;
			
		case '/':
		
			if(num2==0) {
				System.out.println("Es imposible la divisi�n por 0");
			}else {
				
				total = num1/num2;
				System.out.println("Su resultado es " + total);
				
			}
		
	
			break;
			
		default:
			
			System.out.println("No ingresaste un simbolo v�lido");
			break;
		}
		
		
		
		input.close();
	}

}
