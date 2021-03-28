package ejercicio8;

public class SuperHeroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	
	//constructor
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		super();
		this.nombre = nombre;
		setFuerza(fuerza);
		setResistencia(resistencia);
		setsuperpoderes(superpoderes);
		
	}
	
	//setters
	private void setFuerza(int fuerza) {
		if(fuerza<0) {
			this.fuerza = 0;
		}
		else if(fuerza>100) {
			this.fuerza = 100;
		}
		else {
			this.fuerza = fuerza; 
		}
		
	}
	private void setResistencia(int resistencia) {
		if(resistencia<0) {
			this.resistencia = 0;
		}
		else if(resistencia>100) {
			this.resistencia = 100;
		}
		else {
			this.resistencia = resistencia; 
		}
	}
	
	private void setsuperpoderes(int superpoderes) {
	
		if(superpoderes<0) {
			this.superpoderes = 0;
		}
		else if(superpoderes>100) {
			this.superpoderes = 100;
		}
		else {
			this.superpoderes = superpoderes; 
		}
	
	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	
	
	public void competir(SuperHeroe superHeroe1 ,SuperHeroe superHeroe2) {
		int cont = 0;
		if(superHeroe1.fuerza>superHeroe2.fuerza) {
			cont++;
		}
		if(superHeroe1.resistencia>superHeroe2.resistencia) {
			cont++;
		}
		if(superHeroe1.superpoderes>superHeroe2.superpoderes) {
			cont++;
		}
		
		if(cont>=2) {
			System.out.println("Triunfo");
		}
		else if(cont<2) {
			System.out.println("Derrota");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
