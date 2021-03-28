package ej_4;

import java.util.ArrayList;


public class AgendaMedica {

	private int cantidadTurnos;
	private ArrayList<Turno> turnos;

	// constructor
	public AgendaMedica(int cantidad) {

		cantidadTurnos = cantidad;
		turnos = new ArrayList();

	}

	// BUSCAR TURNO
	private Turno buscarTurno(String dni) {
		int i = 0;
		Turno turno = null;

		while (i < turnos.size() && turno == null) {
			if (this.turnos.get(i).getPaciente().getDni().equals(dni)) {
				turno = turnos.get(i);
			} else {
				i++;
			}
		}
		return turno;
	}

	// REGISTRAR TURNO
	public Resultado registrarTurno(String dni, String nombre, String apellido, String telefono) {
		Resultado resultado = null;
	
		if (buscarTurno(dni) != null) {
			resultado = Resultado.EL_PACIENTE_DNI_YA_TENIA_UN_TURNO_ASIGNADO_EN_LA_LISTA;
		} else if (this.cantidadTurnos-1 < turnos.size()) {
			resultado = Resultado.EL_MEDICO_NO_TIENE_MAS_TURNOS;
		} else {
			resultado = Resultado.TURNO_CONFIRMADO;

			turnos.add(new Turno(dni, nombre, apellido, telefono));
		}
		
		return resultado;
	}
	
	public void listarTurnos() {
		System.out.println("Los turnos son" + turnos);
	}
	
	
	public boolean darPresente(String dni) {
		boolean resultado = false;
		Turno turno = buscarTurno(dni);
		if (turno != null) {
			turno.setSePresento(true);
			resultado = true;
		}
		return resultado;
	}
	
	
	
	public boolean anularTurno(String dni) {
		boolean resultado = false;
		Turno turno = buscarTurno(dni);
		if(turno != null) {
			turnos.remove(turno);
			resultado = true;
		}
		
		return resultado;
	}
	
	public ArrayList<Paciente> obtenerAusentes(){
		ArrayList<Paciente> lista = new ArrayList();
		int i = 0;
		for (Turno turno:turnos) {
			
			if(turno.getSePresento() == false) {
				lista.add(turno.getPaciente());
				
			}
			
		}
		
		return lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "AgendaMedica [cantidadTurnos=" + cantidadTurnos + ", turnos=" + turnos + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
