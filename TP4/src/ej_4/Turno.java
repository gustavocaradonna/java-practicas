package ej_4;

import java.util.ArrayList;

public class Turno {

	private boolean sePresento;
	private Paciente paciente;
	
	
	//constructor

	public Turno(String dni, String nombre, String apellido, String telefono) {
		// TODO Auto-generated constructor stub
		
		this.paciente = new Paciente(dni,nombre,apellido,telefono);
		this.sePresento = false;
	}




	



	@Override
	public String toString() {
		return "Turno [sePresento=" + sePresento + ", paciente=" + paciente + "]";
	}








	public boolean getSePresento() {
		return sePresento;
	}


	public void setSePresento(boolean sePresento) {
		this.sePresento = sePresento;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	private void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
