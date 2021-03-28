package ejercicios;
import java.util.Scanner;

public class Cine_parcial {
	static Scanner input = new Scanner(System.in);

	//CONSTANTES
	static final String USUARIO = "asd";
	static final String CLAVE = "qwe";
	static final int BASECANTIDAD = 0;

	static final String MENSAJE1 = "adultos";
	static final String MENSAJE2 = "menores";

	static final int PRECIOMAYORES = 500;
	static final int PRECIOMENORES = 300;
	
	

	
	//funcion login
	public static boolean login() {
		
		String usuarioIngresado;
		String claveIngresada;

		boolean ingresa = false;
		
		System.out.println("Ingrese nombre de usuario: ");
		usuarioIngresado = input.nextLine();

		System.out.println("Ingrese clave: ");
		claveIngresada = input.nextLine();
		
		while(!usuarioIngresado.equals(USUARIO) || !claveIngresada.equals(CLAVE)) {
			System.out.println("Error. Ingrese nombre de usuario: ");
			usuarioIngresado = input.nextLine();

			System.out.println("Ingrese clave: ");
			claveIngresada = input.nextLine();
	
		}
		
		ingresa = true;
		
		return ingresa;
	}
	
	

	// funcion pedir nombre pelicula
	public static String pedirNombre() {
		String nombre = "";
		System.out.println("Ingrese nombre de pelicula: ");
		nombre = input.nextLine();

		return nombre;
	}
	
	
	// funcion pedir cantidad 
		public static int pedirCantidad(String mensaje) {

			int cantidad = 0;

			do {

				System.out.println("Ingrese cantidad de "+mensaje);
				cantidad = input.nextInt();
				input.nextLine();

			} while (cantidad < BASECANTIDAD);

			return cantidad;

		}
		
		// funcion desea continuar

		public static boolean deseaContinuar() {

			boolean continuar = false;
			String letra = "";
			System.out.println("Desea continuar? S/N");
			letra = input.nextLine().toLowerCase();

			while (!letra.equals("s") && !letra.equals("n")) {
				System.out.println("Error de letra. Desea continuar? S/N");
				letra = input.nextLine().toLowerCase();

			}
			
			if(letra.equals("s")) {
				continuar = true; 
			}else {
				continuar = false;
			}

			return continuar;

		}
	

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ingresa;
		String pelicula;
		int adultos;
		int menores;
		boolean continuar;
		int totalAdultos;
		int totalMenores;
		int totalCantidad;
		int totalPesos= 0;
		
		int masBoletos= 0;
		String peliculaMasVendida="";
		ingresa = login();
		
		String peliculaMayorRecaudacion="";
		int masPesos = 0;
		
		int maxTotalAdultos = 0;
		int maxTotalMenores = 0;
		
		do {
		
			
			pelicula = pedirNombre();
			adultos = pedirCantidad(MENSAJE1);
			menores = pedirCantidad(MENSAJE2);
			
			totalAdultos = adultos * PRECIOMAYORES;
			totalMenores = adultos * PRECIOMENORES;
			
			totalCantidad = adultos + menores;
			totalPesos = totalAdultos + totalMenores;
			
			if(totalCantidad>masBoletos) {
				
				masBoletos = totalCantidad;
				peliculaMasVendida = pelicula;
			}
			
			if(totalPesos > masPesos ) {
				masPesos = totalPesos;
				peliculaMayorRecaudacion = pelicula;
				
			}
			
			maxTotalAdultos += adultos;
			maxTotalMenores += menores;
			
			
		}while(deseaContinuar());
		
		System.out.println("FIN");
		
		System.out.println("La pelicula con mayor cantidad de boletos es: " + peliculaMasVendida + " con "+masBoletos);
		System.out.println("La pelicula con mayor cantidad de pesos recaudados es: " + peliculaMayorRecaudacion + " con "+ masPesos);
		System.out.println("Total de entradas adultos: " + maxTotalAdultos);
		System.out.println("Total de entradas menores: " + maxTotalMenores);

		
		
		

		
		
		input.close();

	}

}
