package ejercicios;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class test {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String nombre;
	int edad;
	double peso;
	char inicial;
	
	
	System.out.println("cual es tu nombre?");
	nombre = input.nextLine();
	System.out.println("cual es tu edad?");
	edad = input.nextInt();
	System.out.println("cual es tu peso?");
	peso = input.nextDouble();
	System.out.println("cual es tu inicial?");
	inicial = input.next().charAt(0);

	
	System.out.println("su nombre es "+ nombre + ", su edad es " + edad + " , su peso es " + peso + " , su inicial es " + inicial + ". LLevas vivido "+ (edad*365) + " dias. Te quedan estimativamente "+ ((76-edad)*365) + " dias de vida" );
		
		input.close();
		
	}

}
