package lineal;

public class Test {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = 4;
		double x2 = -2;
		double y1 = 1;
		double y2 = 2;
		
		
		double a;
		double b;
		
		double puntoPorDondeQuieroQuePaseX = 2;
		double puntoPorDondeQuieroQuePaseY = -3;

		
		
		a = (y2-y1) / (x2-x1);
		b = puntoPorDondeQuieroQuePaseY - (a*puntoPorDondeQuieroQuePaseX);
		

		System.out.println("La pendiente es " + a);
		System.out.println("La ordenada al origen es " + b);
	}

}
