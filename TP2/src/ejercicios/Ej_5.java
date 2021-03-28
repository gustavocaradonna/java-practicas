package ejercicios;

import java.util.Scanner;

public class Ej_5 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		/*5. Realizá un programa que lea una serie de números ingresados por el usuario mientras que el
		promedio entre todos sea menor a 20. Informar la cantidad de valores leídos.*/
		
		double num1 = 0;
	//	double num2 = 0;
		double cont = 0;
		double prom = 0;
		double total = 0;
	
		
		
		do {
			
			
			System.out.println("Ingrese numero");
			num1 = input.nextDouble();
			input.nextLine();

			cont++;
			
			total = num1 + total;
			
			prom = total / cont;
			
			System.out.println("total hasta el momento es " + total);
			System.out.println("promedio hasta el momento es " + prom);
		}while(prom<20);
		
		
		System.out.println("El total fue " + total);
		System.out.println("El promedio es " + prom);
		System.out.println("La cantidad de valores leidos fue " + cont );
		
		
		input.close();

		
		/*
		
		do {
			//pregunto numeros
			System.out.println("ingrese un numero");
			num1 = input.nextInt();
			input.nextLine();
			
			System.out.println("ingrese otro numero");
			num2 = input.nextInt();
			input.nextLine();
			
			
			//un contador irá guardando la cantidad de ingresos
			cont = cont +2 ;
			prom = (num1 + num2) / cont;

			//
			
			
			
		}while(prom<20);		
		
		System.out.println("El promedio es " + prom);
		System.out.println("La cantidad de valores leidos fue " + cont );
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		while (prom<20) {
			
			System.out.println("ingrese un numero");
			num1 = input.nextInt();
			input.nextLine();
			
			System.out.println("ingrese otro numero");
			num2 = input.nextInt();
			input.nextLine();
			
			

			cont= cont +2;
			prom = num1+num2/cont;
			
			
			if(prom<20) {
				System.out.println("El promedio es menor a 20, ingrese nuevos numeros AAAAA:" + prom);
				//prom = num1+num2/cont;
			}
			
			else {
				
				System.out.println("El promedio es " + prom);
				System.out.println("La cantidad de valores leidos fue " + cont );
				
			}
			
			
		}
		
				*/

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
