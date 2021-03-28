package ej_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AlvearIcon alvearIcon1 = new AlvearIcon("Libertador 4205", 10);
		
		alvearIcon1.habitarUnidad(1,32484269,"Gustavo");
		alvearIcon1.habitarUnidad(1,32484269,"Gustavo");
		alvearIcon1.habitarUnidad(2,9999999,"maria");
		alvearIcon1.habitarUnidad(15,3555555,"jorge");

		alvearIcon1.agregarDeuda(1, 4000);

		
		
	 alvearIcon1.listarMorosos() ;
		
		
	 alvearIcon1.cancelarDeuda(1, 5000);

	 alvearIcon1.listarMorosos() ;
	 alvearIcon1.listarUnidades() ;

	 
		
	}

}
