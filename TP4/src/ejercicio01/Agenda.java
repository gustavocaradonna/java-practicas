package ejercicio01;

import java.util.ArrayList;


public class Agenda {

	
	//ArrayList y constructor
	ArrayList<Persona>personas;
	
	public Agenda(){
		
		personas = new ArrayList<>();
	}
	

	
	private Persona buscarPersona(String dni) {
		Persona persona1 =null;
		int index = 0;
		
		while(persona1 == null && index< this.personas.size()) {
			
			if(dni.equals(personas.get(index).getDni())) {
				persona1 = personas.get(index);
			}
			index++;
		}
		
		
		return persona1;
	}
	
	public boolean agregarPersona(String nombre, String telefono, String dni, String direccion) {
		boolean siONo = false;
		
		
		if(buscarPersona(dni)== null) {
			personas.add(new Persona(nombre,telefono,dni,direccion));
			
			
			siONo= true;
		}
	
		return siONo;
	}
	
	
	public Persona removerPersona(String dni) {
		
		Persona p1 = null;
		
		if(buscarPersona(dni)!= null) {
			
			p1 = this.buscarPersona(dni);
			personas.remove(this.buscarPersona(dni));
			
		}
		
		return p1;
	}
	
	
	public boolean modificarDomicilio(String dni, String direccion) {
		
		boolean siONo = false;
		
		Persona persona = buscarPersona(dni);
		
		if(persona!=null) {
			
			persona.setDireccion(direccion);
			siONo = true;
		}
		
		
		return siONo;
	}
	
	
	public void listarPersonas(){

	
		for(Persona persona: personas) {
			System.out.println(persona);
		}
		
		
	
	}
	
	
	
	
	
	
	
}
