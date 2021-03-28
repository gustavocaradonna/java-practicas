package ejercicio01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Agenda agenda1 = new Agenda();
		
		agenda1.agregarPersona("gustavo", "1168158464", "32484269", "carlos diehl");
		agenda1.agregarPersona("dali", "999999999", "2423232323", "los stud");
		agenda1.agregarPersona("lucia", "422323", "555555555", "mitre");
		

		agenda1.listarPersonas();		
		
		System.out.println("eliminacion no exitosa");
		System.out.println(agenda1.removerPersona("2222"));
		
		System.out.println("eliminacion exitosa");
		System.out.println(agenda1.removerPersona("32484269"));

		System.out.println("nueva lista");
		agenda1.listarPersonas();
		
		System.out.println("modificacion direccion no exitosa");
		System.out.println(agenda1.modificarDomicilio("111", "ROSALES"));
		
		System.out.println("la lista sigue siendo");
		agenda1.listarPersonas();
		
		System.out.println("modificacion exitosa");
		agenda1.modificarDomicilio("555555555", "loria");
		
		System.out.println("listado de personas");
		agenda1.listarPersonas();
		
		
	}

}
