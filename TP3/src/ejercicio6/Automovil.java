package ejercicio6;

public class Automovil {
	
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	
	
	//A) constructor 
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidadTanque = capacidadTanque;
	}
	
	//B) método viajar
	public double viajar(double km){
		double cantKm = 0;
		
		consumirCombustible(km);
		
		if(km<0) {
			cantKm = 0;
		}
		
		return cantKm;
	}
	//C) método consumir combustible
	
	private double consumirCombustible(double km) {
		// TODO Auto-generated method stub
		double litrosConsumidos = 0;
		
		litrosConsumidos = km/rendimientoPorLitro;
		this.cantidadDeCombustible -= litrosConsumidos;
		
		return litrosConsumidos;
		
	}
	
	//D) método cargar combustible
	public boolean cargarCombustible(double cantidadCarga) {
		boolean sePudoCargar = false;
		
		if (cantidadCarga >= 0 && cantidadCarga<espacioDisponible()) {
			
			this.cantidadDeCombustible += cantidadCarga;
		}
		
		return sePudoCargar;
	}
	
	//E) espacio disponible
	private double espacioDisponible() {
		double disponible = 0;
		
		disponible = this.capacidadTanque - this.cantidadDeCombustible;
		
		return disponible;
	}
	
	//F)
	public boolean pocoCombustible() {
		
		
		return this.cantidadDeCombustible<((this.capacidadTanque * 15) / 100);
	}

	
	//G)getters 
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPatente() {
		return patente;
	}

	public double getCapacidadTanque() {
		return capacidadTanque;
	}

	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}

	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}

	//setters
	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}

	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}

	//H) toString
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDiponible= "+ espacioDisponible() + ", pocoCombustible= "+ pocoCombustible() + "]" ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
