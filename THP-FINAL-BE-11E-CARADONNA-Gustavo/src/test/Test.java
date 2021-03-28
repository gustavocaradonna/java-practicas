package test;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Aplicacion linkedin = new Aplicacion();
		//Agregamos los usuarios a la aplicación
		System.out.println(linkedin.agregarUsuario("binker"));
		System.out.println(linkedin.agregarUsuario("espinosa"));
		System.out.println(linkedin.agregarUsuario("espinosa"));
		System.out.println(linkedin.agregarUsuario("contente"));
		System.out.println(linkedin.agregarUsuario("rabinovich"));
		//Establecemos las relaciones de amistad
		System.out.println(linkedin.agregarAmigo("binker","espinosa"));
		System.out.println(linkedin.agregarAmigo("espinosa","contente"));
		//Comprobamos grados de amistad
		System.out.println(linkedin.obtenerGradoAmistad("binker","espinosa"));
		System.out.println(linkedin.obtenerGradoAmistad("binker","contente"));
		System.out.println(linkedin.obtenerGradoAmistad("binker","rabinovich"));

	//	linkedin.listar();
		
		
		linkedin.listarEnums();
		
	}

}
