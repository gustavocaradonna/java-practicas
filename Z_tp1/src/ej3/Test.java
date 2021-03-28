package ej3;

public class Test {
	
	public static void main(String[] args) {
	JuegoOlimpico juego = new JuegoOlimpico("Atlanta 96");
	
	juego.agregarAtleta("Gustavo", 23.5 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("Belen", 15 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("javier", 34 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("Belen2", 2, Especialidad.ESPECIALIDAD_UNO);


	juego.calcularPodio(Especialidad.ESPECIALIDAD_UNO);
	
	
	}

}
