package parcial_1;

import java.util.Scanner;

public class Test {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Academia academia1 = new Academia("ComoSeDice",5);
		
		System.out.println(academia1);
		
		
		
		
		academia1.inscribirAlumno("32.484.269", "gustavo", NivelConocimiento.BASICO);
		academia1.inscribirAlumno("32.484.269", "gustavo", NivelConocimiento.BASICO);
		academia1.inscribirAlumno("00.484.269", "mica", NivelConocimiento.BASICO);
		academia1.ingresarBajaAlumno("32.484.269");
		
		
		/*
		Scanner input = new Scanner(System.in);

		System.out.println("ingrese un estado");
		String algo = input.nextLine();
		*/
		
	
		
		
		
		academia1.listarAlumnosNivel(NivelConocimiento.BASICO);
		
		academia1.cargarPago("32.484.269", 4500);
		
		
		academia1.listarAlumnosNivel(NivelConocimiento.BASICO);
	}

}
