package ejercicios;

import java.util.Scanner;

public class Ej_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Realizá un programa en el cual se pida el nombre y la nota de 10 alumnos.
		Al finalizar, debe mostrar por pantalla el nombre y la nota del mejor.*/
		
		Scanner input = new Scanner(System.in);
		
		//variables
		
		String nombre;
		int nota = 0;
		int notaMax = 0 ;
	//	String alumno1 = "";
		String alumno1_nombre = "";
		int alumno1_nota= 0;
		
		//ciclo
		
		for (int i = 0; i < 10; i++) {
	
			
			System.out.println("ingrese nombre");
			nombre = input.nextLine();
			
			System.out.println("ingrese promedio");
			nota = input.nextInt();
			input.nextLine();
			
			
			
			if (nota>notaMax) {
				
				alumno1_nombre = nombre ;
				alumno1_nota = nota;

				notaMax = nota;
				

			}
			

		}

		System.out.println("El alumno con mayor nota es "+ alumno1_nombre + " con " + alumno1_nota);

		input.close();

	}

}
