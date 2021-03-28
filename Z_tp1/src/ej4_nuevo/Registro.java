package ej4_nuevo;

public class Registro {
	
	private String dia;
	private String hora;
	private int fila;
	private  LetraEnumerada letra;
	
	
	
	public Registro(Entrada entrada) {

		this.dia = entrada.getDia();
		this.hora = entrada.getHora();
		this.fila = entrada.getAsiento().getFila();
		this.letra = entrada.getAsiento().getLetra();
	}



	@Override
	public String toString() {
		return "Registro [dia=" + dia + ", hora=" + hora + ", fila=" + fila + ", letra=" + letra + "]";
	}
	
	
	
	
	

}
