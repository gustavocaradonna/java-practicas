package ejercicio7;

public class Raton {

	private int energia;
	
	
	public Raton(int energia) {
		
		setEnergia(energia);
		
	}

	
	private void setEnergia(int energia) {
		this.energia = energia/2;
	}
	
	


	public int getEnergia() {
		return this.energia;
	}
	
}
