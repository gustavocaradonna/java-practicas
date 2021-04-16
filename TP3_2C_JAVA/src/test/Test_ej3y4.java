package test;
import java.util.ArrayList;
import java.util.Scanner;
import ej1.*;
import ej2.*;
import ej3.*;
import ej4.*;

public class Test_ej3y4 {
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		
			CasaElectrodomestico casaElectro1 = new CasaElectrodomestico();

			casaElectro1.agregarProducto(new Televisor("samsung", "model x", "123", "220watts", false, 100000, 55, true));
			casaElectro1.agregarProducto(new Lavarropa("drean", "asd2", "423", "220", false, 23300, 10, false, true));
			casaElectro1.agregarProducto(new Heladera("gafa", "42d", "2133", "220", false, 230030, 540, true));
			casaElectro1.agregarProducto(new Licuadora("peabody", "12ds", "1233", "220", false, 23030, 5000, 5));

	
			casaElectro1.comprar(new Cliente("2032232322","oscar","sanchez"));
			
			
	}
		

			

}
