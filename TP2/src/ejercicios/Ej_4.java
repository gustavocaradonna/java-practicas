package ejercicios;
import java.util.Scanner;

public class Ej_4 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*4. Realizar un programa en el cual se pida al usuario el ingreso de dos números enteros num1 y num2,
		cuya relación de valores es que el primero es menor o igual al segundo y mostrar por pantalla la
		secuencia de números que existe entre ambos:
		
		a) Incluyéndolos.
		b) Excluyéndolos.
	
	
		Obs: Validar que el primer número sea menor o igual al segundo. Pedir el ingreso de ambos números
		las veces que sea necesario hasta que se cumpla dicha condición.
		¿Qué pasaría si esta validación no la realizáramos y el ingreso es incorrecto? 
		*/
		
		int num1;
		int num2;
		int num1_b;
		int num2_b;
		
		
			System.out.println("ingrese un numero");
			num1 = input.nextInt();
			input.nextLine();

			System.out.println("ingrese otro numero");
			num2 = input.nextInt();
			input.nextLine();

			while(num1 >= num2) {
				
				System.out.println("Datos incorrectos, vuelva a ingresar un numero");
				num1 = input.nextInt();
				input.nextLine();

				System.out.println("Vuelva a ingresar otro numero");
				num2 = input.nextInt();
				input.nextLine();
				
			}
			
			//guardo los datos en otra variable para despues usarlos en el pedido B
			num1_b = num1 + 1;
			num2_b = num2 - 1;
			
			System.out.println("Numeros A:");
	
			while(num1<=num2) {
				
				
				System.out.println(num1);
				num1++;
			}
			
			System.out.println("Numeros B");
			
			while(num1_b<=num2_b) {
				System.out.println(num1_b);
				num1_b++;
				
			}
			
			
			
			input.close();

			

	//	System.out.println("el numero de num1 es "+num1 + "el numero num2 es " + num2);
		/*
		while ((num1+1) <= (num2 -1)) {
			System.out.println(num1);
			num1++;
			
			System.out.println("algo");			}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			 
			 
			 
			 
			 
			
		}
		
		
		
		
	}


