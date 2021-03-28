package ej4_nuevo;

import java.util.ArrayList;


public class Funcion {
	
	private String dia;
	private String horaDeInicio;
	private ArrayList<Entrada>entradas;
	private ArrayList<Asiento>asientos;

	
	
	public Funcion(String dia, String horaDeInicio) {
		super();
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.asientos = new ArrayList<>();
		this.entradas = new ArrayList<>();

	}
	
	public Entrada crearEntrada(String dia, String hora, int fila, LetraEnumerada letra) {
		Entrada miEntrada = new Entrada(dia, hora, fila, letra);

		
		return miEntrada;
	}
	
	
	
	
	
	
	

	public void registrarAsiento(int fila, LetraEnumerada letra) {
		
		if(estaLibreElAsiento(fila,letra)) {
		Asiento asiento = new Asiento(fila,letra);
		asientos.add(asiento);
		}
		
		
	}

	private boolean estaLibreElAsiento(int fila, LetraEnumerada letra) {
		boolean corte =false;
		boolean respuesta =false;

		int i = 0;
		while(i<asientos.size() && corte == false) {
			if(asientos.get(i).getFila()==fila && asientos.get(i).getLetra()==letra) {
				corte = true;
				if(asientos.get(i).getEstado() == Estado.LIBRE) {
					respuesta = true;
					asientos.get(i).setEstado(Estado.RESERVADO);
				}
			}
			
		}
		
		
		return respuesta;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	public String getDia() {
		return dia;
	}



	public void setDia(String dia) {
		this.dia = dia;
	}



	public String getHoraDeInicio() {
		return horaDeInicio;
	}



	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}



	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}



	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	
	
	
	

}
