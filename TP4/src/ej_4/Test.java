package ej_4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgendaMedica agenda1 = new AgendaMedica(3);
		


		System.out.println(agenda1.registrarTurno("3248","nati", "asdq", "2555-5555"));
		System.out.println(agenda1.registrarTurno("3248","nati", "asdq", "2555-5555"));

		System.out.println(agenda1.registrarTurno("324338","nati", "asdq", "2555-5555"));
		System.out.println(agenda1.registrarTurno("32432238","nati", "asdq", "2555-5555"));
		System.out.println(agenda1.registrarTurno("222","nati", "asdq", "2555-5555"));
		System.out.println(agenda1.registrarTurno("2","nati", "asdq", "2555-5555"));
		
		agenda1.darPresente("3248");
		agenda1.anularTurno("324338");
		
		
		agenda1.listarTurnos();
		System.out.println("AUSENTES:");
		System.out.println(agenda1.obtenerAusentes());

	}

}
