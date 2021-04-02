package ej4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creo vivienda
		Vivienda vivienda1 = new Vivienda("Montañeses", 1234, 4, "C");

		//agrego persona
		vivienda1.agregarPersona("Arturi", "Roman", 53);
		vivienda1.agregarPersona("Monica", "Gaztambide", 35);
		
		//agrego mueble
		vivienda1.agregarMueble("Mesa de ", "Madera", "Marron");
		vivienda1.agregarMueble("Mesa de ", "Mármol", "Rojo");
		vivienda1.agregarMueble("Perchero de ", "Metal", "Negro");
		vivienda1.agregarMueble("Sillon de ", "Cuero", "Azul");

		
		System.out.println(vivienda1);
	}

}
