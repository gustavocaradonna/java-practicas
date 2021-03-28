package test;

public class Computadora {

	
	private String marca;
	public int peso;
	private static int tamaño = 25;
	private Mother asus;
	
	//constructor

	public Computadora(String marca, int peso1, Mother MOTH) {
		
		this.peso = peso1;
		setMarca(marca);
		this.asus = MOTH;
		
	}
	public Computadora() {
	
		
	}
	//toString


	public void setMarca(String marca) {
		
	/*
		if(marca == "apple"){
			marca = "ibm";
		}
	
		this.marca = marca;
			*/
		this.marca = validarMarca(marca);

	}

	
	
	private String validarMarca(String marca) {
		String retorno;
		
		if(marca == "apple"){
			
			marca = "ibm";
		}
		retorno = marca;
	
		return retorno;
	}
	
	

	private void setPeso(int peso) {
		this.peso = peso;
		
	}
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", peso=" + peso + " tamaño " + tamaño+"]";
	}




	public String pedirNombre(Mother m) {
		
		return m.getNombre();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
