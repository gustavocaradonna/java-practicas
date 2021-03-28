package parcial7_vacacionesDeInvierno;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Inmobiliaria inmobiliaria1 = new Inmobiliaria();
		
		inmobiliaria1.ingresarPropiedad("lima 234, 4p C",4,Zona.NORTE ,300000,false);
		inmobiliaria1.ingresarPropiedad("asd",4,Zona.NORTE ,300000,false);
		inmobiliaria1.ingresarPropiedad("qqqqqq",4,Zona.NORTE ,300000,false);
		inmobiliaria1.ingresarPropiedad("gusNueva",4,Zona.NORTE ,300000,false);

		
		inmobiliaria1.ingresarPropiedad("lima 234, 4p C",4,Zona.NORTE ,300000,false);

		
		
		System.out.println(inmobiliaria1);
		
		//inmobiliaria1.alquilarPropiedad("lima 234, 4p C");
		inmobiliaria1.alquilarPropiedad("lima 234, 4p C");
		inmobiliaria1.alquilarPropiedad("lima 234, 4p C");
		inmobiliaria1.alquilarPropiedad("asd");

		inmobiliaria1.mostrarPropiedadesOcupadas();
		
		inmobiliaria1.mostrarPorcentajeOcupacion(Zona.NORTE);
	}

}
