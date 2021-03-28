package ejercicios;

import java.util.Scanner;

public class test2 {
	
	static int suma(int num1 ,int num2) {
	
	int total =  (num1 +  num2) ;
	return total;
    
    
	}
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1 = 0;
		int num2 = 0;
		int total = 0;
		
		System.out.println("ingrese numero");
		num1 = input.nextInt();
		input.nextLine();
		
		System.out.println("ingrese otro numero");
		num2 = input.nextInt();
		input.nextLine();

		
		total = suma(num1 , num2);
		
		System.out.println(total);
		
		

	}

}
