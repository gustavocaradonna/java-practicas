package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	static public Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*8. Suponiendo que el primer d�a de la semana es el Domingo, pedir un n�mero entre 1 y 7
(inclusive) y mostrar el nombre del d�a correspondiente. Si el d�a no est� en el rango
permitido debe emitir por pantalla el mensaje de error "El d�a ingresado no es v�lido".*/
		
		int dia1 = 0;
				
				System.out.println("ingrese numero");
				dia1 = input.nextInt();
				input.nextLine();
		
			switch (dia1) {
			case 1:
				System.out.println("Es Domingo");
				break;
			case 2:
				System.out.println("Es Lunes");
				break;
			case 3:
				System.out.println("Es Martes");
				break;
			case 4:
				System.out.println("Es Miercoles");
				break;
			case 5:
				System.out.println("Es Jueves");
				break;	
			case 6:
				System.out.println("Es Viernes");
				break;	
			case 7:
				System.out.println("Es Sabado");
				break;	
	
				
				
				
				
				
			default:
				System.out.println("El numero ingresado no corresponde a un dia");

				break;
			}
		
	}

}
