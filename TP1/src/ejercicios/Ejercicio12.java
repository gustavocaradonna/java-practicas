package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dado1 = 0;
		int dado2 = 0;
		int dado3 = 0;
		int cantidad6 = 0;

		System.out.println("primer tiro");
		dado1 = input.nextInt();
		input.nextLine();

		System.out.println("segundo tiro");
		dado2 = input.nextInt();
		input.nextLine();

		System.out.println("tercer tiro");
		dado3 = input.nextInt();
		input.nextLine();

		if (dado1 == 6) {
			cantidad6++;
		}
		if (dado2 == 6) {
			cantidad6++;
		}
		if (dado3 == 6) {
			cantidad6++;
		}

		if (cantidad6 == 3) {
			System.out.println("Excelente");
		} else if (cantidad6 == 2) {
			System.out.println("Muy bien");
		} else if (cantidad6 == 1) {
			System.out.println("Regular");
		} else {
			System.out.println("Insuficiente");
		}

		input.close();

	}

}
