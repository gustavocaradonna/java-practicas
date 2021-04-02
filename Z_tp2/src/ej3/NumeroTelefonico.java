package ej3;

public class NumeroTelefonico {

	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoPais;
	private TipoDeLineaEnum tipoDeLinea;
	
	
	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoPais, TipoDeLineaEnum tipoDeLinea) {
		setCaracteristica(caracteristica);
		setCodigoPais(codigoPais);
		setNumeroDeAbonado(numeroDeAbonado);
		setTipoDeLinea(tipoDeLinea);
	}
	
	public NumeroTelefonico() {

	}

	public String getValor() {
		String valor;
		valor="+" + codigoPais;
		
		return valor;
	}
	
	public int getCaracteristica() {
		return caracteristica;
	}


	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}


	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}


	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}


	public int getCodigoPais() {
		return codigoPais;
	}


	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}


	public TipoDeLineaEnum getTipoDeLinea() {
		return tipoDeLinea;
	}


	public void setTipoDeLinea(TipoDeLineaEnum tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}

	@Override
	public String toString() {
		return  tipoDeLinea +" "+ caracteristica + "-" + numeroDeAbonado
				+ "-" + codigoPais  ;
	} 
	

	
	
}
