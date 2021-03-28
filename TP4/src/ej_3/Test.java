package ej_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Spotify spoty1 = new Spotify();
		
		
		spoty1.altaUsuario("gus@1.com","cara", 33, Categoria.PREMIUM);
		
		spoty1.altaUsuario("maria@1.com","asd", 22, Categoria.GRATUITO);
		
		spoty1.altaCancion("yesterday", "paul mc cartney", "pop", "15/02/1999", 0);

		spoty1.escucharCancion("gus@1.com", "yesterday", "paul mc cartney");
		spoty1.escucharCancion("gus@1.com", "yesterday", "paul mc cartney");
		spoty1.escucharCancion("gus@1.com", "yesterday", "paul mc cartney");
		spoty1.escucharCancion("gus@1.com", "yesterday", "paul mc cartney");

		spoty1.listarUsuarios();
		
		spoty1.listarCancionesPorUsuario("gus@1.com");
		
		
		
	}

}
