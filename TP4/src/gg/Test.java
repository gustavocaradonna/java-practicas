package gg;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		public boolean eliminarParticipante(String dni) {
			boolean exito = false;
			Participante miParticipante = buscarParticipanteXDni(dni);
			if (miParticipante != null) {

				participantes.remove(miParticipante);
				System.out.println("Se eliminó el participante con dni " + dni);
				exito = true;
			} else {
				System.out.println("No se pudo eliminar al participante con dni " + dni);
			}
			return exito;
		}

	}

}
