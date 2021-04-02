package ej3;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
		// creo persona
		Persona persona = new Persona("MESSI", "LIONEL");
		Persona persona2 = new Persona("LAVEZZI", "EZEQUIEL");

		// le agrego los numeros telefonicos

		persona.agregarNumeroTelefonico(549, 114111, 2222, TipoDeLineaEnum.CELULAR);
		persona.agregarNumeroTelefonico(070, 032444, 5678, TipoDeLineaEnum.CELULAR);
		persona.agregarNumeroTelefonico(054, 4411, 5472, TipoDeLineaEnum.FIJO);

		//creo email
		persona.agregarEmail("lio@messi.com");
		
		persona.agregarMascota("ricardo", "perro");
		persona.agregarMascota("flavia", "iguana");
		
		Hito hito = persona.agregarHito("23/06/2014", "Subcampeon copa del mundo");
		
		hito.agregarPersona(persona2);
		

		//muestro el objeto
		persona.mostrarTodo();
		
	}

}
