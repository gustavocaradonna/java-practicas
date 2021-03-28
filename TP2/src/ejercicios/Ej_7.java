package ejercicios;

import java.util.Scanner;

public class Ej_7 {


	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  7. El ingreso a un sitio web se valida por nombre de usuario y contraseña.
		   Realizar un programa que impida que el usuario ingrese hasta poner los datos correctos.
		   Si intenta más de 3 veces erróneamente,se debe mostrar el mensaje “Se ha bloqueado su cuenta”,
		   de lo contrario, mostrar “Ha ingresadocorrectamente”.
		   */
		
		Scanner input = new Scanner(System.in);
		
		//variables
	
		final String nombre = "gus";
		final String clave = "asd";
		
		String nombre_in = "";
	    String clave_in = "";

		int cont = 0;
	    

		//ciclo
		
		while( cont != 3 ) {
			
			System.out.println("ingrese nombre de usuario");
			nombre_in = input.next();

			System.out.println("ingrese clave");
			clave_in = input.next();
			
			
			cont++;
			
			System.out.println(nombre_in + " " + clave_in);
			if( nombre_in.equals(nombre) && clave_in.equals(clave)) {
				
				System.out.println("ha ingresado");
				cont = 3;
			}
			
			else if(cont == 3) {
				System.out.println("cuenta bloqueada");
			}
			
		}
		
	input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*
		do {
			
			System.out.println("ingrese nombre de usuario");
			nombre = input.nextLine();

			System.out.println("ingrese clave");
			nombre = input.nextLine();
			
			if (nombre_ingresado == "gus" && clave_ingresada == "asd") {
				
			System.out.println("Ha ingresado los datos correctos");
			}
			
		cont ++;
		
		
		if(cont<3) {
			
		}

			
		}while(nombre_ingresado == "gus" && clave_ingresada == "asd" );
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
