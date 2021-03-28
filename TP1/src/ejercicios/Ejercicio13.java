package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int VALOR_HORA = 16;
		final int VALOR_HORA_EXTRA = 20;
		int horasTrabajadas = 0;
		int masDeCuarenta=0;
		
		System.out.println("Ingrese cantidad de horas");
		horasTrabajadas = input.nextInt();
		
		
		
		if(horasTrabajadas <= 40) {
			
			System.out.println("Su salario es " + (horasTrabajadas * VALOR_HORA) );

			
		}else {
			
			masDeCuarenta = horasTrabajadas - 40;
			System.out.println("Su salario es " + (horasTrabajadas * VALOR_HORA + masDeCuarenta * VALOR_HORA_EXTRA) );

			
		}
		
		
		input.close();
	}

}
