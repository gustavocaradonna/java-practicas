package ejemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner input = new Scanner(System.in);
	
	// metodo
	public static void crearListado() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo variable numeros de tipo arrayList, y q tipo son objetos del array? integer
		ArrayList<Integer> numeros = new ArrayList();
	    Integer numero;
		
		for (int i = 0 ; i<3 ; i++) {
			
			System.out.println("Ingrese un número");
			numero = input.nextInt();
			numeros.add(numero);
			
		}
		
		numeros.add(1,10);
		
		for (int i=0 ;i<numeros.size(); i++) {
			
			System.out.println(numeros.get(i));
		}
		
		
		
		
		
		
	}

}
