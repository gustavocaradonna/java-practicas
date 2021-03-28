package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		boolean estaEnA = false;
		boolean estaEnB = false;
		boolean estaEnAmbos= false;
		boolean noEstaEnNinguno = false;
		int unSoloDigito = 0;
		int impar = 0;
		
		
		System.out.println("Ingrese un número: ");
		num1 = input.nextInt();
		input.nextLine();
		
		
		
		if(num1 > -10 && num1 < 10) {
			estaEnA = true;
		}
		
		if(num1 % 2 == 1) {
			estaEnB = true;
		}
		
		if(estaEnA==true && estaEnB == true) {
			estaEnAmbos = true;
		}
		if(estaEnA==false && estaEnB == false){
			noEstaEnNinguno = true;
		}
		
		
	    if (estaEnAmbos) {
					System.out.println("Está en ambos");
		    }
					
	    	else if (noEstaEnNinguno) {
						System.out.println("No está en ninguno");
			}
			
			else if(estaEnA) {
				System.out.println("Está en A");
			}
			else if (estaEnB) {
				System.out.println("Está en B");
			}
		
			}
	
		
		
	}


