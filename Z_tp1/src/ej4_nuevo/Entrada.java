package ej4_nuevo;

public class Entrada {
	
	private String dia;
	private String hora;
	private Asiento asiento;
	
	
	
	public Entrada(String dia, String hora, int fila, LetraEnumerada letra) {

		this.dia = dia;
		this.hora = hora;
		this.asiento = new Asiento(fila,letra);
	}



	public String getDia() {
		return dia;
	}



	public String getHora() {
		return hora;
	}



	public Asiento getAsiento() {
		return asiento;
	}



	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
	
	public void cumplido() {
		
	}



	@Override
	public String toString() {
		return "Entrada [dia=" + dia + ", hora=" + hora + ", asiento=" + asiento + "]";
	}







	
	
	
	

}
