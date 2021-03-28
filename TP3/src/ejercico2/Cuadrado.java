package ejercico2;

public class Cuadrado {
	
	private int lado;

	
	//inicio el constructor
	public Cuadrado(int lado) {
		this.lado = lado;
	}

	//perimetro
	public int perimetro(){
		return lado * 4;
	}
	//superficie
	public int superficie() {
		return this.lado * lado;
	}

	
	// toString
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", peri=" + perimetro() + ", sup=" + superficie() + "]";
	}

	

	
	//getter
	public int getLado() {
		return lado;
	}
	//setter
	public void setLado(int lado) {
		this.lado = lado;
	}

	



	






	
	
	//
	
	
	
	
}
