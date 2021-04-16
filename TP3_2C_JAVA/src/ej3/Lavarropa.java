package ej3;

public class Lavarropa extends Electrodomestico {
	
	private int cargaMaxima;
	private boolean esAutomatico;
	private boolean esSemiAutomatico;

	public Lavarropa(String marca, String modelo, String numero,
			String voltaje, boolean estado, double precio,int cargaMaxima
			,boolean esAutomatico, boolean esSemiAutomatico) {
		super(marca, modelo, numero, voltaje, estado, precio);
		// TODO Auto-generated constructor stub

		setCargaMaxima(cargaMaxima);
		setEsAutomatico(esAutomatico);
		setEsSemiAutomatico(esSemiAutomatico);
	}

	

	private void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	private void setEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}

	private void setEsSemiAutomatico(boolean esSemiAutomatico) {
		this.esSemiAutomatico = esSemiAutomatico;
	}



	@Override
	public String toString() {
		String automaticoONo = (esAutomatico)?" Es Automatico," :" Es SemiAutomatico,";

		
		return this.getClass().getSimpleName()  + " [cargaMaxima=" + cargaMaxima + automaticoONo + super.toString();
	}

	@Override
	public String toStringBasico() {
		return this.getClass().getSimpleName() +  super.toStringBasico() ;
	}
	
	
}
