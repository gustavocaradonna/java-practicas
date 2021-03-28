package ejercicios;

import java.util.Scanner;

public class Ej_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*9. Realizar un programa que le pida al usuario que ingrese 5 veces 3 valores enteros cada vez. Emití
el promedio de cada grupo.*/
		int valor_total1 = 0;
		int valor_total2 = 0;
		int valor_total3 = 0;
		int valor_total4 = 0;
		int valor_total5 = 0;

		
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		int cont = 0;
	
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i < 6; i++) {
			
			cont++;
			if(cont == 1) {
				System.out.println("Grupo 1, ingrese 3 digitos:");
			}
			if(cont == 2) {
				System.out.println("Grupo 2, ingrese 3 digitos:");
			}
			if(cont == 3) {
				System.out.println("Grupo 3, ingrese 3 digitos:");
			}
			if(cont == 4) {
				System.out.println("Grupo 4, ingrese 3 digitos:");
			}
			if(cont == 5) {
				System.out.println("Grupo 5, ingrese 3 digitos:");
			}
			
			
			
			System.out.println("ingrese primer valor");
			valor1 = input.nextInt();
			
			System.out.println("ingrese segundo valor");
			valor2 = input.nextInt();
			
			System.out.println("ingrese tercer valor");
			valor3 = input.nextInt();
			
			//grupo1
			if(i==1) {
				valor_total1 = (valor1 + valor2 + valor3)/3;
			}
			
			
			//grupo2
			if(i==2) {
				valor_total2 = (valor1 + valor2 + valor3)/3;
			}
			
			
			//grupo3
			else if(i==3) {
				valor_total3 = (valor1 + valor2 + valor3)/3;
			}
			
			
			//grupo4
			else if(i==4) {
				valor_total4 = (valor1 + valor2 + valor3)/3;
			}
			
			//grupo5
			else if(i==5) {
				valor_total5 = (valor1 + valor2 + valor3)/3;
			}
			
			
		}
		
		
		
		System.out.println("Promedio grupo 1 :" + valor_total1);
		System.out.println("Promedio grupo 2 :" + valor_total2);
		System.out.println("Promedio grupo 3 :" + valor_total3);
		System.out.println("Promedio grupo 4 :" + valor_total4);
		System.out.println("Promedio grupo 5 :" + valor_total5);

		
		
		
		input.close();
		
		
		
	}

}
