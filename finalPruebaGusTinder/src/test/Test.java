package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ingresos
		Tinder tinder = new Tinder("Tinder Gus");
		System.out.println(tinder.registrarPersona("Juan", "juan@mail.com", Genero.MASCULINO ,30,Genero.FEMENINO,25,35));
		System.out.println(tinder.registrarPersona("Carlos", "carlos@mail.com", Genero.MASCULINO ,45,Genero.FEMENINO,30,50));
		System.out.println(tinder.registrarPersona("Carlos", "carlos@mail.com", Genero.MASCULINO ,45,Genero.FEMENINO,30,50));
		System.out.println(tinder.registrarPersona("Maria", "maria@mail.com", Genero.FEMENINO ,28,Genero.MASCULINO,30,40));	
		System.out.println(tinder.registrarPersona("Ana", "ana@mail.com", Genero.FEMENINO ,32,Genero.MASCULINO,28,42));
		System.out.println(tinder.registrarPersona("Eva", "eva@mail.com", Genero.FEMENINO ,32,Genero.MASCULINO,40,50));
		

		System.out.println(tinder.mostrarListado("juan@mail.com"));
		System.out.println(tinder.mostrarListado("carlos@mail.com"));

	}

}
