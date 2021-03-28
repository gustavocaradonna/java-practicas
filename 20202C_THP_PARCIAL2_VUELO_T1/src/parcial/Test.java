package parcial;

public class Test {

	public static void main(String[] args) {

		Vuelo vuelo = new Vuelo("AA3313", 180);


		// cargas buenas
		System.out.println(vuelo.reservarAsiento(11111111, "1155568245", ClaseEnum.PRIMERA));
		System.out.println(vuelo.reservarAsiento(22222222, "1166298864", ClaseEnum.TURISTA));
		System.out.println(vuelo.reservarAsiento(33333333, "1183985633", ClaseEnum.TURISTA));
		System.out.println(vuelo.reservarAsiento(44444444, "1131476894", ClaseEnum.BUSINESS));
		System.out.println(vuelo.reservarAsiento(55555555, "1131476192", ClaseEnum.PRIMERA));
		// Prueba de carga con error por duplicado
		System.out.println(vuelo.reservarAsiento(55555555, "1123499804", ClaseEnum.PRIMERA));

		// Listados por clases de asiento
		mostrarRecaudacionPorClase(vuelo);

		// Listar todos los reservados
		vuelo.listarAsientosReservados();
		// Anular la reserva existente
		vuelo.anularReserva(44444444);
		// Intentar una anulacion de reserva inexistente
		vuelo.anularReserva(99999999);
		
		// Mostramos actualizado
		mostrarRecaudacionPorClase(vuelo);
		vuelo.listarAsientosReservados();

		
		double algo = 8/0;
		
		
		
	}
	private static void mostrarRecaudacionPorClase(Vuelo vuelo) {
		vuelo.mostrarMontoRecaudadoDeClase(ClaseEnum.PRIMERA);
		vuelo.mostrarMontoRecaudadoDeClase(ClaseEnum.BUSINESS);
		vuelo.mostrarMontoRecaudadoDeClase(ClaseEnum.TURISTA);
	}

}
