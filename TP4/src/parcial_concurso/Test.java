package parcial_concurso;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Concurso concurso1 = new Concurso("Quarantine Bakers");
		
		//agrega participante
		concurso1.agregarParticipante("14723980", "Agustina", "González");
		
		//intenta agregar pero da error, ya que existe con anterioridad
		concurso1.agregarParticipante("14723980", "Samantha", "Pérez");

		//agrega participante
		concurso1.agregarParticipante("36581454", "Damian", "Martínez");

		//agrega participante
		concurso1.agregarParticipante("17606987", "Martina", "Luna");
		
		//agrega participante
		concurso1.agregarParticipante("33887253", "Emilio", "Caxi");
		
		//intenta votar pero falla porque no existe
		concurso1.votarParticipante("123456789");
		
		//vota con existo 1 vez
		concurso1.votarParticipante("14723980");
		
		//vota 3 veces con exito
		concurso1.votarParticipante("36581454");
		concurso1.votarParticipante("36581454");
		concurso1.votarParticipante("36581454");
		
		//vota con existo 1 vez
		concurso1.votarParticipante("17606987");
		
		//vota con existo 2 veces
		concurso1.votarParticipante("33887253");
		concurso1.votarParticipante("33887253");

		//muestra cantidad total de participantes
		System.out.println("Cantidad total de participantes " + concurso1.cantidadParticipantes());

		//eliminar participante
		concurso1.eliminarParticipante("17606987");
		
		//error al intentar eliminar, dni no existe
		concurso1.eliminarParticipante("99999999");
		
		//muestra cantidad total de participantes
		System.out.println("Cantidad total de participantes " + concurso1.cantidadParticipantes());

		//listar participantes con puntaje igual
		concurso1.listarParticipantesConPuntajeIgualA(3);
		
		//cantidad de votos
		concurso1.mayorPuntaje();
		
	}

}
