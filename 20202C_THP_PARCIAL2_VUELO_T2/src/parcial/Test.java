package parcial;

public class Test {

	public static void main(String[] args) {

		Vuelo vuelo = new Vuelo("AA3313", 180);

		// reservas buenas
		System.out.println(vuelo.reservarAsiento(11111111, "1234567890", ClaseEnum.PRIMERA, "A", 1));
		System.out.println(vuelo.reservarAsiento(33333333, "1234567893", ClaseEnum.TURISTA, "F", 6));

		// reserva contiguos
		System.out.println(vuelo.reservarAsiento(22222222, "1234567891", ClaseEnum.PRIMERA, "A", 2));
		System.out.println(vuelo.reservarAsiento(44444444, "1234567894", ClaseEnum.TURISTA, "F", 5));

		// reserva uno ya vendido
		System.out.println(vuelo.reservarAsiento(11111111, "1234567890", ClaseEnum.PRIMERA, "A", 1));

		// mostrar monto recaudado por clase
		vuelo.mostrarMontoRecaudadoDeClase(ClaseEnum.PRIMERA);
		vuelo.mostrarMontoRecaudadoDeClase(ClaseEnum.BUSINESS);
		vuelo.mostrarMontoRecaudadoDeClase(ClaseEnum.TURISTA);
		
	}

}
