package ejercicio7;

public class Gato {
	
	
	private int energia;

	public Gato(int energia) {

		this.energia = energia;
	}
	

	public boolean alcanzar(Raton objRat,int distancia) {
		
		boolean resultado = false;
		
		if( ( this.energia - objRat.getEnergia() ) < distancia) {
			resultado = false;
		}else {
			resultado = true;
		}
		
		
		return resultado;
	}
	
	
}
