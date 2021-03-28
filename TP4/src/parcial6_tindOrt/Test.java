package parcial6_tindOrt;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TindOrt tinder = new TindOrt();
		
		tinder.registrarPersona("Gustavo", "gus@hotmail.com", Genero.MASCULINO, 33, Genero.FEMENINO, 18, 33);
		tinder.registrarPersona("Gustavo", "gus@hotmail.com", Genero.MASCULINO, 33, Genero.FEMENINO, 18, 33);

		tinder.registrarPersona("maria", "maria@asd.com", Genero.FEMENINO, 27, Genero.MASCULINO, 18, 33);
		tinder.registrarPersona("camila", "cami@asd.com", Genero.INDISTINTO, 19, Genero.MASCULINO, 18, 33);

		tinder.registrarPersona("natalia", "natalia@hotmail.com", Genero.FEMENINO, 80, Genero.MASCULINO, 18, 33);


		
		
		
		System.out.println(tinder.mostrarListado("gu1@hotmail.com"));
		System.out.println(tinder.mostrarListado("gus@hotmail.com"));

	}

}
