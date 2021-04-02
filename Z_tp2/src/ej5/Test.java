package ej5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo un edificio
		Edificio edificio1 = new Edificio();

		//creo vivienda
		Vivienda vivienda1 = new Vivienda("Montañeses", 1234, 4, "C");
		
		Vivienda vivienda2 = new Vivienda("Montañeses", 1234, 2, "B");
		
		//la agrego al edificio
		edificio1.agregarVivienda(vivienda1);
		edificio1.agregarVivienda(vivienda2);

		
		//agrego persona
		vivienda1.agregarPersona("Arturi", "Roman", 53);
		vivienda1.agregarPersona("Monica", "Gaztambide", 35);
		
		//agrego mueble
		vivienda1.agregarMueble("Mesa de ", "Madera", "Marron");
		vivienda1.agregarMueble("Mesa de ", "Mármol", "Rojo");
		vivienda1.agregarMueble("Perchero de ", "Metal", "Negro");
		vivienda1.agregarMueble("Sillon de ", "Cuero", "Azul");

		
		System.out.println("VIVIENDA 1 " + vivienda1);
		System.out.println("VIVIENDA 2 " + vivienda2);

		System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
		
		edificio1.realizarMudanza(4,"C", 2, "B");
		
		System.out.println("VIVIENDA 1 " + vivienda1);
		System.out.println("VIVIENDA 2 " + vivienda2);
		
		
	}

}
