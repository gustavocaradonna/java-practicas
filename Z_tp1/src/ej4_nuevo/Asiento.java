package ej4_nuevo;

public class Asiento {
	
	private int fila;
	private LetraEnumerada letra;
	private Estado estado;
	
	
	
	public Asiento(int fila, LetraEnumerada letra) {

		this.fila = fila;
		this.letra = letra;
		this.estado = Estado.LIBRE;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public int getFila() {
		return fila;
	}



	public LetraEnumerada getLetra() {
		return letra;
	}



	public Estado getEstado() {
		return estado;
	}



	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", letra=" + letra + ", estado=" + estado + "]";
	}
	
	
	
	
	
	
	

}
