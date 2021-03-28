package ej2;

public class Test {
	
	public static void main(String[] args) {
	JuegoOlimpico juego = new JuegoOlimpico("Atlanta 96");
	
	juego.agregarAtleta("Gustavo", 23.5 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("Belen", 23.5 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("romina", 43.2 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("gonzalo", 99 , Especialidad.ESPECIALIDAD_UNO);
	juego.agregarAtleta("gonzalo", 2 , Especialidad.ESPECIALIDAD_UNO);

	System.out.println(juego.calcularGanador(Especialidad.ESPECIALIDAD_UNO));
	
	
	}

}
