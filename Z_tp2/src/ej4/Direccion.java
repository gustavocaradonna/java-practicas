package ej4;

public class Direccion {
	
	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	
	
	
	public Direccion(String calle, int altura, int piso, String departamento) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", piso=" + piso + ", departamento=" + departamento
				+ "]";
	}
	
	
	

}
