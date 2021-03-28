package ejercicios;

import java.util.Scanner;

public class ej_16 {
	//constantes
	static final int MENUCLASICO = 300;
	static final int MENUPARACELIACOS = 310;
	static final int MENUKOSHER = 430;
	static final int MENULIGHT = 290;
	static final int BEBIDA = 30;
	static final String MENU1 = "clasico";
	static final String MENU2 = "celiaco";
	static final String MENU3 = "kosher";
	static final String MENU4 = "light";
	static final String FIN = "fin";
	static final String MENSAJE1 = "Ingrese cantidad de invitados (mayor a 0)";
	static final String MENSAJE2 = "Ingrese cantidad de invitados que eligieron ese plato";

	static Scanner input = new Scanner(System.in);

	// funciones
	public static String calcularPrecioTotal() {
		String siONo = "";

		System.out.println("Bienvenido, desea calcular el precio total del katering? s/n");
		siONo = input.nextLine().toLowerCase();

		while (!siONo.equals("s") && !siONo.equals("n")) {

			System.out.println("Error. Desea calcular el precio total del katering? s/n");
			siONo = input.nextLine().toLowerCase();
		}
		return siONo;
	}

	public static int cantInvitados(String mensaje) {

		int invitados = 0;

		System.out.println(mensaje);
		invitados = input.nextInt();
		input.nextLine();

		while (invitados < 1) {

			System.out.println("Error. Ingrese una cantidad mayor a 0");
			invitados = input.nextInt();
			input.nextLine();
		}

		return invitados;
	}

	public static String tipoDeMenu() {
		String menu = "";

		System.out.println("Elija un menú (clasico/celiaco/kosher/light/fin para terminar)");
		menu = input.nextLine().toLowerCase();

		while (!menu.equals(MENU1) && !menu.equals(MENU2) && !menu.equals(MENU3) && !menu.equals(MENU4)
				&& !menu.equals(FIN)) {

			System.out.println("Error. Ingrese un menu correcto");
			menu = input.nextLine().toLowerCase();

		}

		return menu;
	}

	// main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contTotal = 0;
		int contTemp = 0;
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int totalMenu1 = 0;
		int totalMenu2 = 0;
		int totalMenu3 = 0;
		int totalMenu4 = 0;

		// inicio

		// pregunta si quiere calcular
		String siONo = calcularPrecioTotal();

		// solo corre todo el programa si la respuesta es "s"
		if (siONo.equals("s")) {

			int invitados = cantInvitados(MENSAJE1);
			System.out.println("La cantidad de invitados es " + invitados);

			// ciclo principal

			// pido el menu
			String menu;

			do {

				menu = tipoDeMenu();


				switch (menu) {

				case MENU1:

					cont1 = cantInvitados(MENSAJE2);
					System.out.println("Total menu 1 es  "+ totalMenu1);

					while (cont1 > invitados ||contTotal > invitados) {

						System.out.println("Error, la cantidad de platos es mayor a la de invitados.");
						cont1 = cantInvitados(MENSAJE2);
						System.out.println("Cont1 es " + cont1);
						System.out.println("contTemp es "+contTemp);
					}
					totalMenu1= totalMenu1 +cont1;

					break;

				case MENU2:
					cont2 = cantInvitados(MENSAJE2);
					
					while (cont2 > invitados || contTotal > invitados) {

						System.out.println("Error, la cantidad de platos es mayor a la de invitados.");
						cont2 = cantInvitados(MENSAJE2);

					}
					totalMenu2= totalMenu2 +cont2;
					System.out.println("Contotal es " + contTotal);


					break;

				case MENU3:
					cont3 = cantInvitados(MENSAJE2);
					
					while (cont3 > invitados ||contTotal > invitados) {

						System.out.println("Error, la cantidad de platos es mayor a la de invitados.");
						cont3 = cantInvitados(MENSAJE2);

					}
					totalMenu3= totalMenu3 +cont3;

					break;

				case MENU4:
					cont4 = cantInvitados(MENSAJE2);
					while (cont4 > invitados ||contTotal > invitados) {

						System.out.println("Error, la cantidad de platos es mayor a la de invitados.");
						cont4 = cantInvitados(MENSAJE2);

					}
					
					totalMenu4 = totalMenu4 +cont4;

					break;

				case FIN:

					break;
				default:
					break;

				}
				
				contTemp = cont1 + cont2 + cont3 + cont4 ;
				
				
				//
				contTotal = totalMenu1 + totalMenu2 + totalMenu3 + totalMenu4;
	         	System.out.println("Contotal es " + contTotal);
				System.out.println("ContTemp1 es " + cont1);
				System.out.println("contTemp es "+ contTemp);

				

			} while (!menu.equals(FIN) && contTotal != invitados);


			System.out.println("El total hasta el momento es " + contTotal);


			// mostrar totales

			int totalComida = (totalMenu1 * MENUCLASICO) + (totalMenu2 * MENUPARACELIACOS) + (totalMenu3 * MENUKOSHER)
					+ (totalMenu4 * MENULIGHT);
			int totalBebida = BEBIDA * invitados;

			System.out.println("Usted ha invitado " + invitados + " personas.");

			System.out.println("Clásico, lo pidieron: " + totalMenu1 + " personas. Y cada plato cuesta " + MENUCLASICO);
			System.out.println("Celíaco, lo pidieron: " + totalMenu2 + " personas. Y cada plato cuesta " + MENUPARACELIACOS);
			System.out.println("Kosher, lo pidieron: " + totalMenu3 + " personas. Y cada plato cuesta " + MENUKOSHER);
			System.out.println("Light, lo pidieron: " + totalMenu4 + " personas. Y cada plato cuesta " + MENULIGHT);

			System.out.println("El costo de comida es de " + totalComida);

			System.out.println("El costo de bebida es de " + totalBebida);
			System.out.println("El costo total es " + (totalComida + totalBebida));

			input.close();

		} else {
			System.out.println("No aceptó");
		}

	}

}
