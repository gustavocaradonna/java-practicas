package ejercicio6;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creo un auto
		Automovil auto1 = new Automovil("Ford", "Fiesta", "LZF098",40);
		
		System.out.println(auto1);
		System.out.println("seteo rendimiento por litro ");	
		auto1.setRendimientoPorLitro(10);
		System.out.println(auto1);
		System.out.println("cargo 20 litros de combustible: ");		
		auto1.cargarCombustible(20);
		System.out.println(auto1);
		
		//viajo 180km
		auto1.viajar(180);
		System.out.println("viajo 180km :"+auto1);
		auto1.viajar(50);
		System.out.println(auto1);
	}

}
