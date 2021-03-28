package ejercicios;

import java.util.Scanner;

public class Test2 {

	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String color = "negro";
		int numero = 10;
		
		
		if (color.equals("negro") && numero ==11 || numero ==10) {
			
			System.out.println("si");
			
		}
		*/
		
		
		System.out.println("ingrese numero");
		int numero = input.nextInt();
		input.nextLine();
		
		switch(numero) {
		
		case 1:
			
			System.out.println("ingreso el numero uno");
			break;
			
		case 2: 
			System.out.println("ingreso 2");
			break;
		
		case 3: 
			System.out.println("ingreso 3");
			break;
			
			default:
				System.out.println("no manejo ese numero");
		}
		
		input.close();
		
		
		
		
		
	}

}
