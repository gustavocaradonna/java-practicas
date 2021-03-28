package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Consejo consejo=new Consejo("Diputado",5);
		//agregado de votantes
		System.out.println(consejo.agregarVotante("Ricardo", "123456"));
		
		consejo.agregarVotante("Nestor", "234567");
		//votante ya agregado antes
		consejo.agregarVotante("Ricardo", "123456");
		//agregado de mas votantes
		consejo.agregarVotante("Roberto", "156725");
		
		consejo.agregarVotante("Marcelo", "256523");
		consejo.agregarVotante("Diego", "232323");
		consejo.agregarVotante("Roman", "363636");
		

		//Voto
		consejo.votar("Ricardo", "123456", ValorVoto.POSITIVO);
		consejo.votar("Nestor", "234567", ValorVoto.POSITIVO);
		consejo.votar("Roberto", "156725", ValorVoto.NEGATIVO);
		consejo.votar("Diego", "232323", ValorVoto.ABSTENCION);
		//Voto por segunda vez
		consejo.votar("Ricardo", "123456", ValorVoto.POSITIVO);
		//votante inexistente
		consejo.votar("Cristina", "666666", ValorVoto.POSITIVO);
		consejo.resultadoVotacion();
		
		System.out.println(consejo);


	}

}
