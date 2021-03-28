package ejercicio01_test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Agenda agenda1 = new Agenda();
		Agenda agenda2 = new Agenda();
		
		
		
		agenda1.agregar("gus", "20");
		agenda1.agregar("dali", "69");
		
		
		
		
		agenda2.agregar("wilson", "44");
		agenda2.agregar("santi", "55");
		
		System.out.println("agenda 1:");
		agenda1.mostrar();
		System.out.println("agenda 2:");
        agenda2.mostrar();
		
	}

}
