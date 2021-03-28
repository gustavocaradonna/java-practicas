package ejercicios;

import java.util.Scanner;

public class Ej_10 {
	static Scanner input = new Scanner(System.in);

	//funciones
	
	//pedirCorredor()
	public static int pedirCorredor(){
		
	//	Scanner input = new Scanner(System.in);
		System.out.println("Ingrese numero de corredor (si ingresa 0 termina el programa)");
		int numCorredor = input.nextInt();
		input.nextLine();
		return numCorredor;
	}
	
	//pedirOtrosDatos()
	public static int pedirOtrosDatos(String mensajex){

		System.out.println(mensajex);
		int cant = input.nextInt();
		input.nextLine();

		return cant;

	}
	
	//devolverSegundos()
	public static int devolverSegundos(int horas,int minutos,int segundos){

	
	int totalSeg = (horas*3600) + (minutos*60) + (segundos) ; 

	return totalSeg;
	
	}

	//void mostrar totales
	public static void mostrarTotales(double cont,double corredorMasRapido,double masRapido,double segundosTotales,double porcentajeMenorA1Hora,double contMenorA1Hora ) {
		

		if(cont != 0) {
		//A)
		System.out.println("El ganador es " + corredorMasRapido + " con " + masRapido);

		//B)
		System.out.println("El promedio total es " + segundosTotales/cont + " segundos.");
		
		//C)
		porcentajeMenorA1Hora = (contMenorA1Hora/cont)*100;
		System.out.println("El porcentaje de corredores que realizaron la carrera en menos de una hora es "+ porcentajeMenorA1Hora + " %.");
		
		}else {
			System.out.println("No ingresó ningún corredor");
		}
		
		input.close();
	
	}

	//MAIN
	public static void main(String[] args) {

		/*10. El club de corredores nos pide un programa para obtener estadísticas de la carrera de 10
		km. El mismo consiste en 
		
		Ingresar, por teclado, el número de corredor, las horas, los minutos y los segundos que tardo en realizar la carrera.
		Tener en cuenta que al ingresar 0 como el número de corredor, finaliza el programa y debe mostrar por pantalla:
		
		a) El ganador
		b) El promedio en segundos de los corredores.
		c) El porcentaje de corredores que realizaron la carrera en menos de una hora.
		
		Programar y utilizar la función devolverSegundos que recibe como parámetros horas, minutos y
		segundos.
		*/
				
		
		
		//variables
		int numCorredor,cantHoras,cantMinutos,cantSegundos,masRapido ,resultado,corredorMasRapido,segundosTotales;
		double porcentajeMenorA1Hora;
		double contMenorA1Hora;
		double cont;
		numCorredor = 0;
		cantHoras = 0;
		cantMinutos = 0;
		cantSegundos = 0;
		masRapido = 99999;
		resultado = 0;
		cont = 0;
		contMenorA1Hora = 0 ;
		porcentajeMenorA1Hora = 0;
		corredorMasRapido = 0;
		segundosTotales = 0;
		
		
		//mensajes constantes
		String MENSAJE1 = 	"Ingrese la cantidad de horas";
		String MENSAJE2 = 	"Ingrese la cantidad de minutos";
		String MENSAJE3 = 	"Ingrese la cantidad de segundos";

		//corro la función que pide el corredor
		numCorredor = pedirCorredor();
	
		//CICLO
		
	
	
		while(numCorredor != 0) {
			
			cantHoras= pedirOtrosDatos(MENSAJE1);
			cantMinutos= pedirOtrosDatos(MENSAJE2);
			cantSegundos= pedirOtrosDatos(MENSAJE3);
		
			resultado = devolverSegundos(cantHoras,cantMinutos,cantSegundos);
			
		
			//menores a una hora
			if (resultado<3600) {
				contMenorA1Hora=contMenorA1Hora+1;
			}
			//contador general
			cont = cont+1;
			
			
			//mas rápido
			if(resultado<masRapido) {
				masRapido=resultado;
				corredorMasRapido = numCorredor;
			}
			
			//promedio de los corredores
			
			segundosTotales= segundosTotales +resultado;
			
			
			
			//vuelvo a pedir numero de corredor
			numCorredor = pedirCorredor();

		
		}
		
		//Resultados:
		
		mostrarTotales(cont,corredorMasRapido,masRapido,segundosTotales,porcentajeMenorA1Hora,contMenorA1Hora);

		
		/*
		if(cont != 0) {
		//A)
		System.out.println("El ganador es " + corredorMasRapido + " con " + masRapido);

		//B)
		System.out.println("El promedio total es " + segundosTotales/cont + " segundos.");
		
		//C)
		porcentajeMenorA1Hora = (contMenorA1Hora/cont)*100;
		System.out.println("El porcentaje de corredores que realizaron la carrera en menos de una hora es "+ porcentajeMenorA1Hora + " %.");
		
		}else {
			System.out.println("No ingresó ningún corredor");
		}
*/
		
		

		
		
		
	}

}



	
		
