package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
		
	public static Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final int HORA_APERTURA = 10;
		 final int HORA_CIERRE = 18;
		 int horaUsuario = 0;
  		 boolean estaAbierto=false;

		 System.out.println("ingrese la hora");
		 horaUsuario = input.nextInt();
		 input.nextLine();
		 
		 
		 		 if(horaUsuario<0 || horaUsuario>24) {
		 			 
		 			 System.out.println("Ha ingresado una hora incorrecta");
		 		 }else {
		 			 
		 			 
		 			 
		 			 
		 			 if(horaUsuario>HORA_APERTURA && horaUsuario<HORA_CIERRE) {
		 				 
		 				estaAbierto = true;
		 			
		 			 }
		 			 if(estaAbierto) {
		 				 System.out.println("puede ingresar");
		 			
		 			 }else {
		 				 System.out.println("NO puede ingresar");
		 			 }
		 			
		 			 
		 			 
		 			 
		 		 }
		 			 
		 	

		 
		 
		
		 
		 
		 
		 
	}

}
