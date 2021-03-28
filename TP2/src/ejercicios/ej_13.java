package ejercicios;

import java.util.Scanner;

public class ej_13 {
	static Scanner input = new Scanner(System.in);

	//función ingrese cantidad de alumnos
	public static int cantAlumnos(){
	
		int alumnos=0;
				
				do {
					System.out.println("Ingrese cantidad de alumnos");
					alumnos = input.nextInt();
					input.nextLine();
					
				}while(alumnos<1);
			
				return alumnos;
	}
	
	
	//función ingrese curso
	public static char ingreseCurso() {
		String curso;

		do {
			System.out.println("Ingrese curso");
			curso =input.next().toLowerCase();
			input.nextLine();
			
		}while(!curso.equals("a") && !curso.equals("b") && !curso.equals("c")  && !curso.equals("d") );
		
		
		return curso.charAt(0);
		
	}
	
	
	//función clase apoyo
	public static String claseApoyo(){

		
		System.out.println("Ingrese en cual materia requiere clases de apoyo. ");
		String claseRecibida = input.nextLine();
		
		while (!claseRecibida.equals("taller") && !claseRecibida.equals("matematica") && !claseRecibida.equals("fundamentos")) {

			System.out.println("Error. Ingrese en cual materia requiere clases de apoyo. ");
			claseRecibida = input.nextLine();
			
		}
		
		return claseRecibida;
	}
	
	
	//VOID mostrarTotales
	public static void mostrarTotales(int taller,int fundamentos,int matematica) {
		//materia mas requerida
		if(taller>fundamentos && taller>matematica) {
			System.out.println("La materia mas requerida fué taller" );

		}
		
		else if(fundamentos>taller && fundamentos>matematica) {
			System.out.println("La materia mas requerida fué fundamentos" );

		}
		else {
			System.out.println("La materia mas requerida fué matematica" );
		}
	}
	
	//MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*13. Se desea realizar un programa para saber qué prioridad darle a cada materia en cuanto a clases
de apoyo de acuerdo a la necesidad de los alumnos.
Al comenzar el programa, se pedirá la cantidad de alumnos que desea cargar. 

Por cada alumno se pedirá curso (a/b/c/d. Validar), y materia en la cual necesita clase de apoyo
(taller/fundamentos/matemática).
Una vez realizado el ingreso de datos, se deberá mostrar por pantalla cuál fue la materia más requerida*/
		
		
		int alumnos = 0;
		String resultado = "";
		int taller = 0;
		int fundamentos = 0;
		int matematica = 0;
		

		alumnos = cantAlumnos();

		for (int i = 0; i < alumnos; i++) {
			
			System.out.println("Alumno " + (i+1));
			char curso = ingreseCurso();
			String clase = claseApoyo();
			
		switch (clase) {
		case "taller": 
			taller = taller +1;
			
			break;
			
		case "fundamentos": 
			fundamentos = fundamentos +1;
			
			break;
			
		case "matematica": 
			matematica = matematica +1;
			
			break;
			
		default:
			break;
		}
		
		}
		
		mostrarTotales(taller,fundamentos,matematica);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
