package ejercico4;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//
		
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(200);
		Cafetera cafetera3 = new Cafetera(500,750);
		
		
		System.out.println("antes de llenar");
		System.out.println(cafetera1);
		
		System.out.println("lleno la cafetera");
		cafetera1.llenar();
		System.out.println(cafetera1);
		
		System.out.println("sirvo una taza");
		cafetera1.servirTaza(200);
		System.out.println(cafetera1);
		
		System.out.println("vacio la cafetera");
		cafetera1.vaciar();
		System.out.println(cafetera1);
		
		System.out.println("agrego café a la cafetera");
		
		System.out.println("El sobrante es "+ cafetera1.agregarCafe(1400));
		
		

		
		
		
		
		
		
		
		
		
		
		
	
	}	

}
