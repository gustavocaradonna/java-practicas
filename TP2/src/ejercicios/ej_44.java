package ejercicios;

import java.util.Scanner;

public class ej_44 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int ancho = 0 ;
		int alto = 0 ;

		String total = "";
		

		System.out.println("ingrese numero");
		ancho = input.nextInt();
		input.nextLine();
		
		System.out.println("ingrese numero");
		alto = input.nextInt();
		input.nextLine();
		
		
		for (int i = 0; i < alto; i++) {
			
		total = "";
		
		for (int num = 0; num < ancho; num++) {
			
			
		 total = total + "X" ;
		}
		 System.out.println(total);

	//	System.out.println(total);

		
		
		}

	}

}
