package ejercico4;

public class Cafetera {
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	//a constructor predeterminado
	
	public Cafetera() {
		super();
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	//b constructor con la capacidad maxima de la cafetera
	
	public Cafetera(int capacidadMaxima) {
		super();
		setCapacidadMaxima(capacidadMaxima);
		setCantidadActual(0);
	}

	//c
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		super();
		setCapacidadMaxima(capacidadMaxima);
		setCantidadActual(cantidadActual);
	}

	//d setters privados
	private void setCapacidadMaxima(int capacidadMaxima) {
		
		if(capacidadMaxima<250) {
			capacidadMaxima = 250;
		}
		this.capacidadMaxima = capacidadMaxima;

	}

	private void setCantidadActual(int cantidadActual) {
		if(cantidadActual<0) {
			cantidadActual = 0;

		}
		else if(cantidadActual>capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
		this.cantidadActual = cantidadActual;
	}

	//getters publicos
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}
	
	
	//e llenar()
	public void llenar() {
		this.cantidadActual = this.capacidadMaxima;
	}

	//f 
	public void servirTaza(int porcion) {
		
		if(this.cantidadActual<porcion) {
			this.cantidadActual = 0;
			//aca podria poner vaciar();
		}
		else if(this.cantidadActual>porcion) {
			cantidadActual-=porcion;
		}

		
	}
	//g
	public void vaciar() {
		this.cantidadActual = 0;
	}
	
	//h
	public int agregarCafe(int agregado) {
		int sobrante = 0;
		int diferencia = this.capacidadMaxima - this.cantidadActual;
		if(agregado<diferencia) {
			this.cantidadActual += agregado;
		}else {
			this.cantidadActual = this.cantidadActual + diferencia;
		sobrante = agregado - diferencia;
		}
	
		return sobrante;

	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
