package ejercico3;

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	private double montoDisponible;
	
	
	//constructor principal
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
		
		
	}

	//getters pùblicos
	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}



	//setters privados menos setActumulaedoActual() que no existe
	
	
	private void setNumero(String numero) {
		this.numero = numero;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}


	//toString
	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", montoDisponible=" + montoDisponible() + "]" ;
	}
	
	public double montoDisponible() {
		double disponible= limiteDeCompra-acumuladoActual;
		
		if(disponible<0) {
		 disponible = 0;
		}
		
		return disponible;
	}
/*El método privado compraPosible() que según el monto recibido por
parámetro devuelve si se puede o no hacer la compra. Para saber si la
compra es posible el monto de la misma no debe superar al monto
disponible para compras.
*/
	private boolean compraPosible(double montoCompra) {
		
		return montoCompra <= montoDisponible();
		
	}


	
	public void actualizarLimite(double nuevoLimite) {
		setLimiteDeCompra(nuevoLimite);
	}
	
	private void acumularGastoActual(double montoCompra) {
		
		acumuladoActual += montoCompra;
		
	}
	
	
	public boolean realizarCompra(double montoCompra) {
		boolean esPosible = compraPosible(montoCompra);
		if (esPosible) {
			acumularGastoActual(montoCompra);
		}
		
		
		return esPosible;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
