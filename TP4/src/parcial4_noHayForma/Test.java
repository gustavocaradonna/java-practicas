package parcial4_noHayForma;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creo gimnasio
		Gimnasio gimnasio1 = new Gimnasio("NoHayForma" ,10);
		
		//creo socios
		gimnasio1.inscribirSocio(32484269, "gustavo", 1, 0);
		gimnasio1.inscribirSocio(30235656, "flavita", 2, 10500);
		gimnasio1.inscribirSocio(23023022, "meme", 3, 125);

		//quito socios
		gimnasio1.quitarSocio(32484269);
		
		//listar deudores
		gimnasio1.listarDeudoresCategoria(2, 1000);
		
		//poner moroso
		gimnasio1.ponerMoroso(30235656);
		
		gimnasio1.listarSocios();
		
		System.out.println(gimnasio1.cantidadSocios);
		
		
		//listar nueva lista morosos
		
		gimnasio1.listarMorosos();

	}

}
