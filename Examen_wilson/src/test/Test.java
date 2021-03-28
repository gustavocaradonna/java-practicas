package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Materia materiaLengua = new Materia("lengua" , 20);
		//Agregamos los usuarios a la aplicación
	//	System.out.println(linkedin.agregarUsuario("binker"));
		
		System.out.println(materiaLengua.agregarProfesor("wilson",42,22));
		System.out.println(materiaLengua.agregarProfesor("wilson",42,22));
		System.out.println(materiaLengua.agregarProfesor("wilson",42,22));
		System.out.println(materiaLengua.agregarProfesor("wilson",42,22));
		System.out.println(materiaLengua.agregarProfesor("gusti",42,22));
		
		System.out.println(materiaLengua.eliminarProfe("gusti"));
		materiaLengua.listarProfe();
		
	}

}
