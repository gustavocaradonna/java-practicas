package examen_final;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edificio edificio1 = new Edificio("loria 477" , 40);
		
		edificio1.agregarUnidad(2, 32484269, "Gustavo");
		edificio1.agregarUnidad(3, 45555555, "flavia");
		edificio1.agregarUnidad(3, 45555555, "flavia");
		edificio1.agregarUnidad(1, 32484269, "asd");

		edificio1.actualizarVoto(3, true);
		
		edificio1.listarVotosPositivos();
		
		
		edificio1.actualizarVoto(3, false);
		edificio1.listarVotosPositivos();

		
		edificio1.calcularPorcentaje();
		
		edificio1.agregarUnidad(39, 23244, "nancy");
		
		edificio1.longitud();

	}

}
