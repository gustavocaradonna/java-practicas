package ej1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grupo grupo = new Grupo("coders");
		
		grupo.agregarIntegrante("Gustavo");
		grupo.agregarIntegrante("Javier");
		grupo.agregarIntegrante("Alan");
		grupo.agregarIntegrante("Gustavo");
		
		System.out.println(grupo.obtenerIntegrante(1));
		
		System.out.println(grupo.removerIntegrante("Javier"));
		System.out.println(grupo.removerIntegrante("Javier"));

		
		//grupo.cant();
		grupo.mostrar();
		
		grupo.vaciar();
		grupo.mostrar();
		
		System.out.println("X22");
	}

}
