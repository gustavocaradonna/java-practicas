package ejercicios;
import java.util.Scanner;

public class Ejercicio9 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*9. Realizá un programa que resuelva el siguiente problema:
Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del
total aportó cada una (indicando nombre y porcentaje) y cuál es el monto del total aportado
por las tres.


Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego
mostrar lo pedido en el siguiente formato:
Nombre: capital aportado: $ … , Porcentaje del capital: %.... , Monto total aportado: $ ….
*/
		String persona1;
		String persona2;
		String persona3;
		
		double capital1 = 0;
		double capital2 = 0;
		double capital3 = 0;
		
		System.out.println("ingrese nombre de persona 1");
		persona1 = input.nextLine();
		
		System.out.println("ingrese importe de persona 1");
		capital1 = input.nextInt();
		input.nextLine();
		
		//

		System.out.println("ingrese nombre de persona 2");
		persona2 = input.nextLine();
		
		System.out.println("ingrese importe de persona 2");
		capital2 = input.nextInt();
		input.nextLine();
		
		//
		
		System.out.println("ingrese nombre de persona 3");
		persona3 = input.nextLine();
		
		System.out.println("ingrese importe de persona 3");
		capital3 = input.nextInt();
		input.nextLine();
		
		double total = capital1 + capital2 + capital3;

		
		System.out.println("nombre: "+ persona1 + " capital aportado: " + capital1 + " porcentaje aportado: %"  + (capital1 *100)/total );
		
		System.out.println("nombre: "+ persona2 + " capital aportado: " + capital2 + " porcentaje aportado: %"  + (capital2 *100)/total );

		System.out.println("nombre: "+ persona3 + " capital aportado: " + capital3 + " porcentaje aportado: %"  + (capital3 *100)/total );

		
		
		input.close();
		
		
		
	}

}
