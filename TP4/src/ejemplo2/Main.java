package ejemplo2;

import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Persona> personas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		personas = new ArrayList();
		
		
		personas.add(new Persona("Diego", 25));
		personas.add(new Persona("juan", 32));

		//por cada iteracion lo voy a guardar en la variable persona que es de persona
		for (Persona persona: personas) {
			
			System.out.println(persona);
		}
		
	}

}
