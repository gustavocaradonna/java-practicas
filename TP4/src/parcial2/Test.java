package parcial2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Edificio yatay240 = new Edificio("YATAY 240", 5); 

		yatay240.agregarUnidad(1, 10741852, "Lionel Messi"); 
		yatay240.agregarUnidad(2, 10741852, "Cristiano Ronaldo"); 
		yatay240.agregarUnidad(2, 10741852, "Cristiano Ronaldo"); 

		yatay240.agregarUnidad(3, 10741852, "Lionel Messi"); 

		System.out.println(yatay240.departamentos);
		System.out.println(yatay240.departamentos.size());


		yatay240.actualizarVoto(1, false); 
		yatay240.actualizarVoto(1, false); 
		yatay240.actualizarVoto(1, true); 
		yatay240.actualizarVoto(1, false); 
		yatay240.actualizarVoto(2, true); 
		yatay240.actualizarVoto(3, true); 

		yatay240.actualizarVoto(4, false); 


		System.out.println(yatay240.departamentos.size());

		System.out.println(yatay240.departamentos);

		System.out.println("listar votos positivos");
		
		yatay240.listarVotosPositivos();
		
		yatay240.calcularPorcentaje();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for (int i = 0; i < 20; i++) {
			
			for (int j = 0; j < 20; j++) {
				
				int resultado = i * j;
				
				System.out.println(i + " * " + j + " = " + resultado);
			}
			
		}
		*/
		
	}

}
