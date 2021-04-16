package test;
import ej1.*;
import ej2.*;

import ej1.Empleado;

public class Test_ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado vendedor1 = new Vendedor("Pedro", 25, 100, 200, 5);
		Empleado vendedor2 = new Vendedor("Maria", 30, 100, 200, 10);

		mostrarDetalle(vendedor1);
		mostrarDetalle(vendedor2);

	}

	static void mostrarDetalle(Empleado emp) {
		System.out.println(emp);

	}

}