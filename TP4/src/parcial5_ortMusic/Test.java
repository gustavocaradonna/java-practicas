package parcial5_ortMusic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Cuenta ortMusic = new Cuenta(21654783, "Jose Morales"); 
		
		 ortMusic.agregarTema("Despacito", "Luis Fonci",2018,"Pop latino");
		 ortMusic.agregarTema("Bailando", "Enrique Iglesias",2014,"Pop latino");
		 ortMusic.agregarTema("La bicicleta", "Carlos Vives",2017,"Pop latino");
		 ortMusic.agregarTema("Despacito", "Luis Fonci",2018,"Pop latino");
		 ortMusic.agregarTema("Creo", "Fito Paez",1992,"Rock");
		 ortMusic.agregarTema("Una noche fria", "Callejeros",2003,"Rock");
		 ortMusic.agregarTema("Ya no sos igual", "Dos minutos",1994,"Rock"); 

		 ortMusic.reproducirTema("Despacito");
		 ortMusic.reproducirTema("Gente que no");
		 ortMusic.reproducirTema("Bailando");
		 ortMusic.reproducirTema("Despacito"); 
		
		 ortMusic.listarTemas("Rock");
		 ortMusic.temaMasReproducido("Pop latino");
		 ortMusic.temaMasReproducido("Rock");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
