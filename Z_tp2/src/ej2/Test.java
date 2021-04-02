package ej2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creo persona
		Persona persona = new Persona("MESSI", "LIONEL");

		// le agrego los numeros telefonicos

		persona.agregarNumeroTelefonico(549, 114111, 2222, TipoDeLineaEnum.CELULAR);
		persona.agregarNumeroTelefonico(070, 032444, 5678, TipoDeLineaEnum.CELULAR);
		persona.agregarNumeroTelefonico(054, 4411, 5472, TipoDeLineaEnum.FIJO);

		//creo email
		persona.agregarEmail("lio@messi.com");
		
		persona.agregarMascota("ricardo", "perro");
		persona.agregarMascota("flavia", "iguana");

		
		

		//muestro el objeto
		persona.mostrarTodo();
	}

}
