package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gimnasio gimnasio1 = new Gimnasio("Gim Gus", 25);
		
		gimnasio1.inscribirSocio(32484269, "gustavo", 2, 250);
		gimnasio1.inscribirSocio(33238359, "flavia", 1, 1000);

		gimnasio1.listarSocios();
		
		
		gimnasio1.ponerMoroso(32484269);

		gimnasio1.listarSocios();

	
	}

}
